package com.example.ecotrackjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ecotrackjava.model.Atividade;

public interface AtividadeRepository extends JpaRepository<Atividade, Long> {
    
}