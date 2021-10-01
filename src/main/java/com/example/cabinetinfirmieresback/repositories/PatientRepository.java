package com.example.cabinetinfirmieresback.repositories;

import com.example.cabinetinfirmieresback.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
