package com.tuempresa.estudiantes.service.impl;

import com.tuempresa.estudiantes.dto.TareaDTO;
import com.tuempresa.estudiantes.entity.Estudiante;
import com.tuempresa.estudiantes.entity.Tarea;
import com.tuempresa.estudiantes.repository.EstudianteRepository;
import com.tuempresa.estudiantes.repository.TareaRepository;
import com.tuempresa.estudiantes.service.TareaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaServiceImpl implements TareaService {

    private final TareaRepository tareaRepository;
    private final EstudianteRepository estudianteRepository;

    public TareaServiceImpl(TareaRepository tareaRepository,
                            EstudianteRepository estudianteRepository) {
        this.tareaRepository = tareaRepository;
        this.estudianteRepository = estudianteRepository;
    }

    @Override
    public List<TareaDTO> listarPorCodigoEstudiante(String codigo) {
        Estudiante estudiante = estudianteRepository.findByCodigo(codigo)
                .orElseThrow(() -> new RuntimeException("Estudiante no encontrado"));

        List<Tarea> tareas = tareaRepository.findByIdEstudiante(estudiante.getId());

        return tareas.stream()
                .map(t -> new TareaDTO(
                        t.getId(),
                        t.getIdEstudiante(),
                        t.getTitulo(),
                        t.getDescripcion(),
                        t.getFechaLimite(),
                        t.getEstado()
                ))
                .toList();
    }

    @Override
    public TareaDTO crearTarea(TareaDTO dto) {
        Estudiante estudiante = estudianteRepository.findById(dto.getIdEstudiante())
                .orElseThrow(() -> new RuntimeException("Estudiante no encontrado"));

        Tarea tarea = new Tarea();
        tarea.setIdEstudiante(estudiante.getId());
        tarea.setTitulo(dto.getTitulo());
        tarea.setDescripcion(dto.getDescripcion());
        tarea.setFechaLimite(dto.getFechaLimite());
        tarea.setEstado(dto.getEstado());

        Tarea guardada = tareaRepository.save(tarea);

        return new TareaDTO(
                guardada.getId(),
                guardada.getIdEstudiante(),
                guardada.getTitulo(),
                guardada.getDescripcion(),
                guardada.getFechaLimite(),
                guardada.getEstado()
        );
    }
}
