package com.example.ecotrackjava.service;

import com.example.ecotrackjava.model.Usuario;
import com.example.ecotrackjava.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
  private final UsuarioRepository repo;
  public UsuarioService(UsuarioRepository repo){ this.repo = repo; }

  public List<Usuario> list(){ return repo.findAll(); }
  public Usuario get(Long id){ return repo.findById(id).orElseThrow(); }
  public Usuario save(Usuario u){ return repo.save(u); }
  public Usuario update(Long id, Usuario dto){
    return repo.findById(id).map(u -> {
      u.setNome(dto.getNome());
      u.setEmail(dto.getEmail());
      u.setPontuacaoTotal(dto.getPontuacaoTotal());
      return repo.save(u);
    }).orElseThrow();
  }
  public void delete(Long id){ repo.deleteById(id); }
}
