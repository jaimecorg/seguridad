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

import com.jaimecorg.seguridad.models.Permiso;
import com.jaimecorg.seguridad.services.PermisoService;

@RestController
public class PermisoController {

    @Autowired
    PermisoService permisoService;

    @GetMapping("/permisos")
    List<Permiso> all(){
        return permisoService.findAll();
    }
    
    @GetMapping("/permisos/{id}")
    Permiso findPermiso(@PathVariable int id){
        return permisoService.findById(id);
    }

    @DeleteMapping("/permisos/{id}")
    void deletePermiso(@PathVariable int id){
        permisoService.deleteById(id);
    }

    @PostMapping("/permisos")
    Permiso crearPermiso(@RequestBody Permiso permiso){
        permisoService.save(permiso);
        return permiso;
    }

    @PutMapping("/permisos/{id}")
    void modificarPermiso(@PathVariable int id, @RequestBody Permiso permiso){
        permisoService.update(id, permiso);
    }
}
