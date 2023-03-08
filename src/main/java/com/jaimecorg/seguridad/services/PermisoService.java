package com.jaimecorg.seguridad.services;

import java.util.List;

import com.jaimecorg.seguridad.models.Permiso;

public interface PermisoService {
    
    public List<Permiso> findAll();
    public Permiso findById(int id);
    public Permiso save(Permiso permiso);
    public void update(int id, Permiso permiso);
    public void deleteById(int id);
    public void deleteAll();
}
