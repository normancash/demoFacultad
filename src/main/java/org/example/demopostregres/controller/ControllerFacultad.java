package org.example.demopostregres.controller;

import jakarta.validation.Valid;
import org.example.demopostregres.model.Facultad;
import org.example.demopostregres.dto.FacultadDTO;
import org.example.demopostregres.services.IServiceFacultad;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/facultad")
public class ControllerFacultad {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private IServiceFacultad serviceFacultad;

    @GetMapping("/all")
    public List<FacultadDTO> getAll() {
        return serviceFacultad.getAll().stream()
                .map(facultad -> modelMapper
                        .map(facultad,FacultadDTO.class))
                .collect(Collectors.toList());
    }

    @PostMapping("/save")
    public void save(@RequestBody @Valid FacultadDTO facultadDTO) {
        Facultad facultadDB = modelMapper
                .map(facultadDTO,Facultad.class);
        modelMapper.map(serviceFacultad.save(facultadDB)
                           ,FacultadDTO.class);

    }

    @PutMapping("/update")
    public void update(@RequestBody FacultadDTO facultadDTO) {
        serviceFacultad.update(modelMapper
                .map(facultadDTO,Facultad.class));
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        serviceFacultad.delete(id);
    }
}
