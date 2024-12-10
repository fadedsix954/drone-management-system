package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.HistoricoManutencao;
import com.example.repository.HistoricoManutencaoRepository;

@Service
public class HistoricoManutencaoService {

    @Autowired
    private HistoricoManutencaoRepository historicoManutencaoRepository;

    public List<HistoricoManutencao> getAllHistorico() {
        return historicoManutencaoRepository.findAll();
    }

    public HistoricoManutencao saveHistorico(HistoricoManutencao historicoManutencao) {
        return historicoManutencaoRepository.save(historicoManutencao);
    }

    public void deleteHistorico(Long id) {
        historicoManutencaoRepository.deleteById(id);
    }
}
