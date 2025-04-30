package org.example.demopostregres.services;

import org.example.demopostregres.dto.FacultadDTO;
import org.example.demopostregres.exception.FacultadException;
import org.example.demopostregres.model.Facultad;
import org.example.demopostregres.repository.IFacultadRepo;
import org.hibernate.annotations.Comment;
import org.modelmapper.ModelMapper;
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
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<Facultad> getAll() throws FacultadException{
        boolean ban = true;
        if (ban) {
            throw new FacultadException("A proposito");
        }
        return facultadRepo.findAll();
    }

    @Override
    public Facultad getOne(Integer id) throws FacultadException {
        Facultad facultad = facultadRepo.findById(id).orElse(null);
        if (facultad == null) {
            throw new FacultadException("No existe esa " +
                    "facultad con este id:" + id);
        }
        return facultad;
    }


    @Override
    public Facultad save(Facultad facultad) {
         return facultadRepo.save(facultad);
    }

    @Override
    public Facultad update(Facultad facultad) {
        Facultad facultadDB = facultadRepo
                .findFacultadBy(facultad.getNombre());
        facultadDB.setDescripcion(facultad.getDescripcion());
        facultadDB.setNombre(facultad.getNombre());
        return facultadRepo.save(facultadDB);        
    }

    @Override
    public void delete(Integer id) {
        facultadRepo.deleteById(id);
    }
}
