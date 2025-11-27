package com.tuempresa.estudiantes.dto;

import java.util.List;

public class EstudianteDTO {

    private String codigo;
    private String nombre;
    private String escuela;
    private String ciclo;
    private String sede;
    private List<CursoDTO> cursos;

    public EstudianteDTO() {}

    public EstudianteDTO(String codigo, String nombre, String escuela,
                         String ciclo, String sede, List<CursoDTO> cursos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.escuela = escuela;
        this.ciclo = ciclo;
        this.sede = sede;
        this.cursos = cursos;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEscuela() { return escuela; }
    public void setEscuela(String escuela) { this.escuela = escuela; }

    public String getCiclo() { return ciclo; }
    public void setCiclo(String ciclo) { this.ciclo = ciclo; }

    public String getSede() { return sede; }
    public void setSede(String sede) { this.sede = sede; }

    public List<CursoDTO> getCursos() { return cursos; }
    public void setCursos(List<CursoDTO> cursos) { this.cursos = cursos; }
}
