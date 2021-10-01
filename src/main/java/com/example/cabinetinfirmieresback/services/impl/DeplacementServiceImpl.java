package com.example.cabinetinfirmieresback.services.impl;

import com.example.cabinetinfirmieresback.models.Deplacement;
import com.example.cabinetinfirmieresback.repositories.DeplacementRepository;
import com.example.cabinetinfirmieresback.services.DeplacementService;

import java.util.List;

public class DeplacementServiceImpl implements DeplacementService {

    private DeplacementRepository deplacementRepository;

    public DeplacementServiceImpl(DeplacementRepository deplacementRepository) {
        this.deplacementRepository = deplacementRepository;
    }

    @Override
    public List<Deplacement> findAll() { return this.deplacementRepository.findAll(); }

    @Override
    public Deplacement findById(Integer id) {  return this.deplacementRepository.findById(id).orElse(null); }

    @Override
    public Deplacement postDeplacement(Deplacement deplacement) { return this.deplacementRepository.save(deplacement); }

    @Override
    public Deplacement putDeplacement(Deplacement deplacement) { return this.deplacementRepository.save(deplacement); }

    @Override
    public void deleteDeplacement(Integer id) { this.deplacementRepository.deleteById(id);  }
}
