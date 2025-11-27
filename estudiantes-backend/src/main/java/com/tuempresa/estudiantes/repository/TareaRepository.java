package com.tuempresa.estudiantes.repository;

import com.tuempresa.estudiantes.entity.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TareaRepository extends JpaRepository<Tarea, Long> {

    List<Tarea> findByIdEstudiante(Long idEstudiante);
}
