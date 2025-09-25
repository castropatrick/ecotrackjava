package com.example.ecotrackjava.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity @Data
public class Usuario {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank(message="{usuario.nome.notblank}")
  private String nome;

  @Email(message="{usuario.email.email}")
  private String email;

  @PositiveOrZero(message="{usuario.pontuacao.positiveOrZero}")
  private int pontuacaoTotal;
}
