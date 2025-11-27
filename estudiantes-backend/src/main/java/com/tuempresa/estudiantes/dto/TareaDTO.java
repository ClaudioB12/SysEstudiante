package com.tuempresa.estudiantes.dto;

public class TareaDTO {

    private Long id;
    private Long idEstudiante;
    private String titulo;
    private String descripcion;
    private String fechaLimite;
    private String estado;

    public TareaDTO() {}

    public TareaDTO(Long id, Long idEstudiante, String titulo,
                    String descripcion, String fechaLimite, String estado) {
        this.id = id;
        this.idEstudiante = idEstudiante;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        this.estado = estado;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getIdEstudiante() { return idEstudiante; }
    public void setIdEstudiante(Long idEstudiante) { this.idEstudiante = idEstudiante; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getFechaLimite() { return fechaLimite; }
    public void setFechaLimite(String fechaLimite) { this.fechaLimite = fechaLimite; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
