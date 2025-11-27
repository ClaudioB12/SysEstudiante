package com.tuempresa.estudiantes.service.impl;

import com.tuempresa.estudiantes.dto.CursoDTO;
import com.tuempresa.estudiantes.dto.EstudianteDTO;
import com.tuempresa.estudiantes.entity.Curso;
import com.tuempresa.estudiantes.entity.Estudiante;
import com.tuempresa.estudiantes.entity.Matricula;
import com.tuempresa.estudiantes.repository.CursoRepository;
import com.tuempresa.estudiantes.repository.EstudianteRepository;
import com.tuempresa.estudiantes.repository.MatriculaRepository;
import com.tuempresa.estudiantes.service.EstudianteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    private final EstudianteRepository estudianteRepository;
    private final MatriculaRepository matriculaRepository;
    private final CursoRepository cursoRepository;

    public EstudianteServiceImpl(EstudianteRepository estudianteRepository,
                                 MatriculaRepository matriculaRepository,
                                 CursoRepository cursoRepository) {
        this.estudianteRepository = estudianteRepository;
        this.matriculaRepository = matriculaRepository;
        this.cursoRepository = cursoRepository;
    }

    @Override
    public EstudianteDTO obtenerPorCodigo(String codigo) {
        Estudiante estudiante = estudianteRepository.findByCodigo(codigo)
                .orElseThrow(() -> new RuntimeException("Estudiante no encontrado"));

        List<Matricula> matriculas = matriculaRepository.findByIdEstudiante(estudiante.getId());

        List<CursoDTO> cursos = matriculas.stream().map(m -> {
            Curso c = cursoRepository.findById(m.getIdCurso())
                    .orElseThrow(() -> new RuntimeException("Curso no encontrado"));
            return new CursoDTO(c.getCodigoCurso(), c.getNombre(),
                    m.getAula(), m.getPeriodo(), m.getSeccion());
        }).toList();

        return new EstudianteDTO(
                estudiante.getCodigo(),
                estudiante.getNombre(),
                estudiante.getEscuela(),
                estudiante.getCiclo(),
                estudiante.getSede(),
                cursos
        );
    }
}
