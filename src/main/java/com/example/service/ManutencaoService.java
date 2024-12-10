package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Manutencao;
import com.example.repository.ManutencaoRepository;

@Service
public class ManutencaoService {

    @Autowired
    private ManutencaoRepository manutencaoRepository;

    public List<Manutencao> getAllManutencao() {
        return manutencaoRepository.findAll();
    }

    public Manutencao saveManutencao(Manutencao manutencao) {
        return manutencaoRepository.save(manutencao);
    }

    public void deleteManutencao(Long id) {
        manutencaoRepository.deleteById(id);
    }
}
