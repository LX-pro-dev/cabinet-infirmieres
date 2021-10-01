package com.example.cabinetinfirmieresback.repositories;

import com.example.cabinetinfirmieresback.models.Deplacement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeplacementRepository extends JpaRepository<Deplacement, Integer> {
}
