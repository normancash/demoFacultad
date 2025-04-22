package org.example.demopostregres.controller;

import org.example.demopostregres.model.Facultad;
import org.example.demopostregres.services.IServiceFacultad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facultad")
public class ControllerFacultad {

    @Autowired
    private IServiceFacultad serviceFacultad;

    @GetMapping("/all")
    public List<Facultad> getAll() {
        return serviceFacultad.getAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody Facultad facultad) {
        serviceFacultad.save(facultad);
    }

    @PutMapping("/update")
    public void update(@RequestBody Facultad facultad) {
        serviceFacultad.save(facultad);
    }

}
