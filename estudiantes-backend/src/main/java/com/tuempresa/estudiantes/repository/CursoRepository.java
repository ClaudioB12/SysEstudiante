package com.tuempresa.estudiantes.repository;

import com.tuempresa.estudiantes.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
