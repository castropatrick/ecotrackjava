package com.example.ecotrackjava.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "{atividade.tipo.notnull}")
    @Enumerated(EnumType.STRING)
    private TipoAtividade tipo;

    @Positive(message = "{atividade.pontos.positive}")
    private int pontos;

    @Positive(message = "{atividade.co2Evitado.positive}")
    private double co2Evitado;

    @Size(max = 255, message = "{atividade.descricao.size}")
    private String descricao;
}
