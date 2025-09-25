package com.example.ecotrackjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ecotrackjava.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}
