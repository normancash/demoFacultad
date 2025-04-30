package org.example.demopostregres.model;

import jakarta.persistence.*;


@Entity
@Table(name="facultad",uniqueConstraints = {
        @UniqueConstraint(columnNames = "nombre")
})
public class Facultad {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                generator = "SEQ_FACULTAD")
    @SequenceGenerator(name="SEQ_FACULTAD"
            ,sequenceName = "SEQ_FACULTAD"
                  ,allocationSize = 1)
    private Integer id;

    private String nombre;
    private String descripcion;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
