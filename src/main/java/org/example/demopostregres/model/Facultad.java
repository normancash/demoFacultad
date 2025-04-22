package org.example.demopostregres.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="facultad")
@Getter
@Setter
public class Facultad {

    @Id
    private Integer id;
    private String nombre;
    private String descripcion;
}
