package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Manutencao;

public interface ManutencaoRepository extends JpaRepository<Manutencao, Long> {
}
