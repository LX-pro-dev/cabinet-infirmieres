package com.example.cabinetinfirmieresback.controllers;

import com.example.cabinetinfirmieresback.models.Deplacement;
import com.example.cabinetinfirmieresback.services.DeplacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("deplacements")
public class DeplacementController {

    @Autowired
    private DeplacementService deplacementService;

    @GetMapping
    public List<Deplacement> findAll() {
        return deplacementService.findAll();
    }

    @GetMapping("{id}")
    public Deplacement findById(@PathVariable Integer id) {
        return deplacementService.findById(id);
    }

    @PostMapping
    public Deplacement postDeplacement(@RequestBody Deplacement deplacement) {
        return deplacementService.postDeplacement(deplacement);
    }

    @PutMapping
    public Deplacement putDeplacement(@RequestBody Deplacement deplacement) {
        return deplacementService.putDeplacement(deplacement);
    }

    @DeleteMapping("{id}")
    public void deleteDeplacement(@PathVariable Integer id) {
        deplacementService.deleteDeplacement(id);
    }
}
