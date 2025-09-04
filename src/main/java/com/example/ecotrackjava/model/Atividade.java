package com.example.ecotrackjava.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O tipo da atividade não pode estar em branco.")
    private String tipo;

    @Positive(message = "A pontuação deve ser um valor positivo.")
    private int pontos;

    @Positive(message = "A pegada de carbono evitada deve ser um valor positivo.")
    private double co2Evitado;
    
    private LocalDate data;
}