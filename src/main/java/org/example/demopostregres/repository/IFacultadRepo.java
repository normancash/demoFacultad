package org.example.demopostregres.repository;

import org.example.demopostregres.model.Facultad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFacultadRepo extends
        JpaRepository<Facultad, Integer> {
}
