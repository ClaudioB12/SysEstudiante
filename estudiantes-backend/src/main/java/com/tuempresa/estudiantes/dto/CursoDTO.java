package com.tuempresa.estudiantes.dto;

public class CursoDTO {

    private String codigoCurso;
    private String nombre;
    private String aula;
    private String periodo;
    private String seccion;

    public CursoDTO() {}

    public CursoDTO(String codigoCurso, String nombre, String aula, String periodo, String seccion) {
        this.codigoCurso = codigoCurso;
        this.nombre = nombre;
        this.aula = aula;
        this.periodo = periodo;
        this.seccion = seccion;
    }

    public String getCodigoCurso() { return codigoCurso; }
    public void setCodigoCurso(String codigoCurso) { this.codigoCurso = codigoCurso; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getAula() { return aula; }
    public void setAula(String aula) { this.aula = aula; }

    public String getPeriodo() { return periodo; }
    public void setPeriodo(String periodo) { this.periodo = periodo; }

    public String getSeccion() { return seccion; }
    public void setSeccion(String seccion) { this.seccion = seccion; }
}
