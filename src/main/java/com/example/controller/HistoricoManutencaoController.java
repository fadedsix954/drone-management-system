package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.HistoricoManutencao;
import com.example.service.HistoricoManutencaoService;

@RestController
@RequestMapping("/historico")
public class HistoricoManutencaoController {

    @Autowired
    private HistoricoManutencaoService historicoManutencaoService;

    @GetMapping
    public List<HistoricoManutencao> getAllHistorico() {
        return historicoManutencaoService.getAllHistorico();
    }

    @PostMapping
    public HistoricoManutencao createHistorico(@RequestBody HistoricoManutencao historicoManutencao) {
        return historicoManutencaoService.saveHistorico(historicoManutencao);
    }

    @DeleteMapping("/{id}")
    public void deleteHistorico(@PathVariable Long id) {
        historicoManutencaoService.deleteHistorico(id);
    }
}
