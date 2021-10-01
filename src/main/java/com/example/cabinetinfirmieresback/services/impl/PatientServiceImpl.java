package com.example.cabinetinfirmieresback.services.impl;

import com.example.cabinetinfirmieresback.models.Patient;
import com.example.cabinetinfirmieresback.repositories.PatientRepository;
import com.example.cabinetinfirmieresback.services.PatientService;

import java.util.List;

public class PatientServiceImpl implements PatientService {

    private PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> findAll() { return this.patientRepository.findAll(); }

    @Override
    public Patient findById(Integer id) { return this.patientRepository.findById(id).orElse(null);  }

    @Override
    public Patient postPatient(Patient patient) { return this.patientRepository.save(patient); }

    @Override
    public Patient putPatient(Patient patient) { return this.patientRepository.save(patient); }

    @Override
    public void deletePatient(Integer id) { this.patientRepository.deleteById(id); }
}
