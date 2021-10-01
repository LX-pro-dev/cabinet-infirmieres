package com.example.cabinetinfirmieresback.controllers;

import com.example.cabinetinfirmieresback.models.Infirmiere;
import com.example.cabinetinfirmieresback.services.InfirmiereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("infirmieres")
public class InfirmiereController {

    @Autowired
    private InfirmiereService infirmiereService;

    @GetMapping
    public List<Infirmiere> findAll() {
        return infirmiereService.findAll();
    }

    @GetMapping("{id}")
    public Infirmiere findById(@PathVariable Integer id) {
        return infirmiereService.findById(id);
    }

    @PostMapping
    public Infirmiere postInfirmiere(@RequestBody Infirmiere infirmiere) {
        return infirmiereService.postInfirmiere(infirmiere);
    }
    @PutMapping
    public Infirmiere putInfirmiere(@RequestBody Infirmiere infirmiere) {
        return infirmiereService.putIfirmiere(infirmiere);
    }

    @DeleteMapping("{id}")
    public void deleteInfirmiere(@PathVariable Integer id) {
        infirmiereService.deleteInfirmiere(id);
    }
}

