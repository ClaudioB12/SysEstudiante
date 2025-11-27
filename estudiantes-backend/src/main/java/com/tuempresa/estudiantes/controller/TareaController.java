package com.tuempresa.estudiantes.controller;

import com.tuempresa.estudiantes.dto.TareaDTO;
import com.tuempresa.estudiantes.service.TareaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {

    private final TareaService tareaService;

    public TareaController(TareaService tareaService) {
        this.tareaService = tareaService;
    }

    @GetMapping("/estudiante/{codigo}")
    public ResponseEntity<List<TareaDTO>> listarPorCodigoEstudiante(@PathVariable String codigo) {
        return ResponseEntity.ok(tareaService.listarPorCodigoEstudiante(codigo));
    }

    @PostMapping
    public ResponseEntity<TareaDTO> crear(@RequestBody TareaDTO dto) {
        return ResponseEntity.ok(tareaService.crearTarea(dto));
    }
}
