package com.example.cabinetinfirmieresback.controllers;

import com.example.cabinetinfirmieresback.models.Patient;
import com.example.cabinetinfirmieresback.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("patients")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping
    public List<Patient> findAll() {
        return patientService.findAll();
    }

    @GetMapping("{id}")
    public Patient findById(@PathVariable Integer id) {
        return patientService.findById(id);
    }

    @PostMapping
    public Patient postPatient(@RequestBody Patient patient) {
        return patientService.postPatient(patient);
    }
    @PutMapping
    public Patient putPatient(@RequestBody Patient patient) {
        return patientService.putPatient(patient);
    }
    @DeleteMapping("{id}")
    public void deletePatient(@PathVariable Integer id) {
        patientService.deletePatient(id);
    }
}
