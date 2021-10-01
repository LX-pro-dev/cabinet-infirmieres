package com.example.cabinetinfirmieresback.services;

import com.example.cabinetinfirmieresback.models.Patient;

import java.util.List;

public interface PatientService {

    public List<Patient> findAll();

    public Patient findById(Integer id);

    public Patient postPatient(Patient patient);

    public Patient putPatient(Patient patient);

    public void deletePatient(Integer id);

}
