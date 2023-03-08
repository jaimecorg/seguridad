package com.jaimecorg.seguridad.services;

import java.util.List;

import com.jaimecorg.seguridad.models.Usuario;

public interface UsuarioService {
    
    public List<Usuario> findAll();
    public Usuario findById(int id);
    public Usuario save(Usuario usuario);
    public void update(int id, Usuario usuario);
    public void deleteById(int id);
    public void deleteAll();
}
