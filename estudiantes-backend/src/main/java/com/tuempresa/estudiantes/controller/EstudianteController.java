package com.tuempresa.estudiantes.controller;

import com.tuempresa.estudiantes.dto.EstudianteDTO;
import com.tuempresa.estudiantes.service.EstudianteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {

    private final EstudianteService estudianteService;

    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<EstudianteDTO> obtenerPorCodigo(@PathVariable String codigo) {
        return ResponseEntity.ok(estudianteService.obtenerPorCodigo(codigo));
    }
}
