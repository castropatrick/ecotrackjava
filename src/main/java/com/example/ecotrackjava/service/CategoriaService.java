package com.example.ecotrackjava.service;

import com.example.ecotrackjava.model.Categoria;
import com.example.ecotrackjava.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
  private final CategoriaRepository repo;
  public CategoriaService(CategoriaRepository repo){ this.repo = repo; }

  public List<Categoria> list(){ return repo.findAll(); }
  public Categoria get(Long id){ return repo.findById(id).orElseThrow(); }
  public Categoria save(Categoria c){ return repo.save(c); }
  public Categoria update(Long id, Categoria dto){
    return repo.findById(id).map(c -> {
      c.setNome(dto.getNome());
      c.setDescricao(dto.getDescricao());
      return repo.save(c);
    }).orElseThrow();
  }
  public void delete(Long id){ repo.deleteById(id); }
}
