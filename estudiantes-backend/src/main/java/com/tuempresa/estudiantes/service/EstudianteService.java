package com.tuempresa.estudiantes.service;

import com.tuempresa.estudiantes.dto.EstudianteDTO;

public interface EstudianteService {
    EstudianteDTO obtenerPorCodigo(String codigo);
}
