package com.tuempresa.estudiantes.repository;

import com.tuempresa.estudiantes.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

    List<Matricula> findByIdEstudiante(Long idEstudiante);
}
