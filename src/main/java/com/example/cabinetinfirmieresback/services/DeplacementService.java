package com.example.cabinetinfirmieresback.services;

import com.example.cabinetinfirmieresback.models.Deplacement;
import org.apache.catalina.LifecycleState;

import java.util.List;

public interface DeplacementService {

    public List<Deplacement> findAll();

    public Deplacement findById(Integer id);

    public Deplacement postDeplacement(Deplacement deplacement);

    public Deplacement putDeplacement(Deplacement deplacement);

    public void deleteDeplacement(Integer id);
}
