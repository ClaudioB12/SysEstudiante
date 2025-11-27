package com.tuempresa.estudiantes.service;

import com.tuempresa.estudiantes.dto.TareaDTO;

import java.util.List;

public interface TareaService {

    List<TareaDTO> listarPorCodigoEstudiante(String codigo);

    TareaDTO crearTarea(TareaDTO dto);
}
