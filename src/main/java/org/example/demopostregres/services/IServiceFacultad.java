package org.example.demopostregres.services;

import org.example.demopostregres.dto.FacultadDTO;
import org.example.demopostregres.model.Facultad;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceFacultad {

    List<Facultad> getAll();

    Facultad getOne(Integer id);

    Facultad save(Facultad facultad);

    Facultad update(Facultad facultad);

    void delete(Integer id);


}
