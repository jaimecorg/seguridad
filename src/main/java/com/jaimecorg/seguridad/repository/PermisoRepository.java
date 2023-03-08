package com.jaimecorg.seguridad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaimecorg.seguridad.models.Permiso;

@Repository
public interface PermisoRepository extends  JpaRepository<Permiso, Integer> {
    
}
