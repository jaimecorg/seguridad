package com.jaimecorg.seguridad.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jaimecorg.seguridad.models.Usuario;
import com.jaimecorg.seguridad.services.UsuarioService;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/usuarios")
    List<Usuario> all(){
        return usuarioService.findAll();
    }
    
    @GetMapping("/usuarios/{id}")
    Usuario findUsuario(@PathVariable int id){
        return usuarioService.findById(id);
    }

    @DeleteMapping("/usuarios/{id}")
    void deleteUsuario(@PathVariable int id){
        usuarioService.deleteById(id);
    }

    @PostMapping("/usuarios")
    Usuario crearUsuario(@RequestBody Usuario usuario){
        usuarioService.save(usuario);
        return usuario;
    }

    @PutMapping("/usuarios/{id}")
    void modificarUsuario(@PathVariable int id, @RequestBody Usuario usuario){
        usuarioService.update(id, usuario);
    }
}
