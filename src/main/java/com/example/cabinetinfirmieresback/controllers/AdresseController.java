package com.example.cabinetinfirmieresback.controllers;

import com.example.cabinetinfirmieresback.models.Adresse;
import com.example.cabinetinfirmieresback.services.AdresseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("adresses")
public class AdresseController {

    @GetMapping
    public List<Adresse> findAll() { return this.adresseService.findAll(); }

    @GetMapping("{id}")
    public Adresse findById(@PathVariable Integer id) { return this.adresseService.findById(id); }

    @PostMapping
    public Adresse postAdresse(@RequestBody Adresse adresse) { return this.adresseService.postAdresse(adresse); }

    @PutMapping
    public Adresse putAdresse(@RequestBody Adresse adresse) { return this.adresseService.putAdresse(adresse); }

    @DeleteMapping("{id}")
    public void deleteAdresse(@PathVariable Integer id) { this.adresseService.deleteAdresse(id); }

    @Autowired
    private AdresseService adresseService;
}
