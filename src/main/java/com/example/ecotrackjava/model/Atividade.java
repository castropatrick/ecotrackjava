package com.example.ecotrackjava.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    @JsonIgnoreProperties("atividades")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    @JsonIgnoreProperties("atividades")
    private Categoria categoria;
}
