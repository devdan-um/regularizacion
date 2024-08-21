package com.univer.estudiantes.controller;


import com.univer.estudiantes.entity.EstudianteEntity;
import com.univer.estudiantes.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/save")
    public ResponseEntity guardarEstudiante(@RequestBody EstudianteEntity request){
        EstudianteEntity entity = new EstudianteEntity();
        entity.setNombre(request.getNombre());

        repository.save(entity);

        return ResponseEntity.ok("El estudiante se guardo de manera correcta");
    }


}
