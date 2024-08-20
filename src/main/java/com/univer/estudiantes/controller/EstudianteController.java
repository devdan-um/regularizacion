package com.univer.estudiantes.controller;


import com.univer.estudiantes.entity.EstudianteEntity;
import com.univer.estudiantes.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/univer")
public class EstudianteController {

    @Autowired
    private EstudianteRepository repository;

    @GetMapping("/guardar")
    public String guardarEstudiante(){

        EstudianteEntity entity = new EstudianteEntity();
        entity.setNombre("Alan");

        repository.save(entity);

        return "Estudiante guardado";
    }


}
