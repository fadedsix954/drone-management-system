package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.HistoricoManutencao;

public interface HistoricoManutencaoRepository extends JpaRepository<HistoricoManutencao, Long> {
}
