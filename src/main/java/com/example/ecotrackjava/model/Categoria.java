package com.example.ecotrackjava.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity @Data
public class Categoria {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank(message="{categoria.nome.notblank}")
  private String nome;

  @Size(max=255, message="{categoria.descricao.size}")
  private String descricao;
}
