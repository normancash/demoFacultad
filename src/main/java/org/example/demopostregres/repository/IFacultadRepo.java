package org.example.demopostregres.repository;

import org.example.demopostregres.model.Facultad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IFacultadRepo extends
        JpaRepository<Facultad, Integer> {

    @Query("select e from Facultad e where e.nombre = :nombre")
    Facultad findFacultadBy(String nombre);
}
