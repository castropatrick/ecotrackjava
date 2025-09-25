package com.example.ecotrackjava.controller;

import com.example.ecotrackjava.model.Usuario;
import com.example.ecotrackjava.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

  private final UsuarioService service;
  public UsuarioController(UsuarioService service){ this.service = service; }

  @GetMapping public List<Usuario> list(){ return service.list(); }

  @GetMapping("/{id}") public Usuario get(@PathVariable Long id){ return service.get(id); }

  @PostMapping @ResponseStatus(HttpStatus.CREATED)
  public Usuario create(@Valid @RequestBody Usuario u){ return service.save(u); }

  @PutMapping("/{id}") public Usuario update(@PathVariable Long id, @Valid @RequestBody Usuario u){
    return service.update(id, u);
  }

  @DeleteMapping("/{id}") @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(@PathVariable Long id){ service.delete(id); }
}
