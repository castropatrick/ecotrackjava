package com.example.ecotrackjava.controller;

import com.example.ecotrackjava.model.Categoria;
import com.example.ecotrackjava.service.CategoriaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

  private final CategoriaService service;
  public CategoriaController(CategoriaService service){ this.service = service; }

  @GetMapping public List<Categoria> list(){ return service.list(); }

  @GetMapping("/{id}") public Categoria get(@PathVariable Long id){ return service.get(id); }

  @PostMapping @ResponseStatus(HttpStatus.CREATED)
  public Categoria create(@Valid @RequestBody Categoria c){ return service.save(c); }

  @PutMapping("/{id}") public Categoria update(@PathVariable Long id, @Valid @RequestBody Categoria c){
    return service.update(id, c);
  }

  @DeleteMapping("/{id}") @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(@PathVariable Long id){ service.delete(id); }
}
