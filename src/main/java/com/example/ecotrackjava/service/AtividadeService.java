package com.example.ecotrackjava.service;

import com.example.ecotrackjava.model.Atividade;
import com.example.ecotrackjava.repository.AtividadeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtividadeService {
  private final AtividadeRepository repo;
  public AtividadeService(AtividadeRepository repo){ this.repo = repo; }

  public List<Atividade> list(){ return repo.findAll(); }
  public Atividade get(Long id){ return repo.findById(id).orElseThrow(); }
  public Atividade save(Atividade a){ return repo.save(a); }
  public Atividade update(Long id, Atividade dto){
    return repo.findById(id).map(a -> {
      a.setTipo(dto.getTipo());
      a.setPontos(dto.getPontos());
      a.setCo2Evitado(dto.getCo2Evitado());
      a.setDescricao(dto.getDescricao());
      a.setUsuario(dto.getUsuario());
      a.setCategoria(dto.getCategoria());
      return repo.save(a);
    }).orElseThrow();
  }
  public void delete(Long id){ repo.deleteById(id); }
}
