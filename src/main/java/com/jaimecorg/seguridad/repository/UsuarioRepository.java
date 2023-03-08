package com.jaimecorg.seguridad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaimecorg.seguridad.models.Usuario;

@Repository
public interface UsuarioRepository extends  JpaRepository<Usuario, Integer> {
    
}
