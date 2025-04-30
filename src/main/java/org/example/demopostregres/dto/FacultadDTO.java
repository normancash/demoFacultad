package org.example.demopostregres.dto;


import jakarta.validation.constraints.NotBlank;


public class FacultadDTO {

    @NotBlank(message = "El nombre no puede estar vacio")
    private String nombre;
    @NotBlank(message="La descripcion no puede estar vacia")
    private String descripcion;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
