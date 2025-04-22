package org.example.demopostregres.services;

import org.example.demopostregres.model.Facultad;
import org.example.demopostregres.repository.IFacultadRepo;
import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceFacultad
        implements IServiceFacultad{


    @Autowired
    private IFacultadRepo facultadRepo;

    @Override
    public List<Facultad> getAll() {
        return facultadRepo.findAll();
    }

    @Override
    public Facultad getOne(Integer id) {
        return facultadRepo.findById(id).orElse(null);
    }

    @Override
    public void save(Facultad facultad) {
         facultadRepo.save(facultad);
    }

    @Override
    public void delete(Facultad facultad) {
        facultadRepo.delete(facultad);
    }
}
