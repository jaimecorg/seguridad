package com.jaimecorg.seguridad.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaimecorg.seguridad.models.Permiso;
import com.jaimecorg.seguridad.repository.PermisoRepository;
import com.jaimecorg.seguridad.services.PermisoService;

@Service
public class PermisoServiceImpl implements PermisoService{

    @Autowired
    PermisoRepository repository;

    @Override
    public List<Permiso> findAll() {
        return repository.findAll();

    }

    @Override
    public Permiso findById(int id) {
        Optional<Permiso> findById = repository.findById(id);
        if(findById != null){
            return findById.get();
        }
        return null;
    }

    @Override
    public Permiso save(Permiso permiso) {
        return repository.save(permiso);

    }

    @Override
    public void update(int id, Permiso permiso) {
        this.findById(id);
        permiso.setId(id);
        repository.save(permiso);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();

    }
}
