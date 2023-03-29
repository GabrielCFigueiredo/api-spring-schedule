package com.api.register.controller;

import com.api.register.dao.IUsuario;
import com.api.register.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
public class UserController {

    @Autowired
    private IUsuario dao;

    @GetMapping
    public List<Usuario> listaUsuario() {
        return (List<Usuario>) dao.findAll();
    }

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario user) {
        Usuario usuario = dao.save( user );
        return usuario;
    }

    @PutMapping
    public Usuario editarUsuario(@RequestBody Usuario user) {
        Usuario usuario = dao.save( user );
        return usuario;
    }

    @DeleteMapping("/{id}")
    public Optional<Usuario> excluirUsuario(@PathVariable Long id) {
    Optional<Usuario> usuario = dao.findById( id );
    dao.deleteById( id );
    return usuario;
    }
}
