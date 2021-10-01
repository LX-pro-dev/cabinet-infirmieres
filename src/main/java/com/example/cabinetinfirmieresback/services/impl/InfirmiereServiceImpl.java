package com.example.cabinetinfirmieresback.services.impl;

import com.example.cabinetinfirmieresback.models.Infirmiere;
import com.example.cabinetinfirmieresback.repositories.InfirmiereRepository;
import com.example.cabinetinfirmieresback.services.InfirmiereService;

import java.util.List;

public class InfirmiereServiceImpl implements InfirmiereService {

    private InfirmiereRepository infirmiereRepository;

    public InfirmiereServiceImpl(InfirmiereRepository infirmiereRepository) {
        this.infirmiereRepository = infirmiereRepository;
    }

    @Override
    public List<Infirmiere> findAll() { return this.infirmiereRepository.findAll(); }

    @Override
    public Infirmiere findById(Integer id) { return this.infirmiereRepository.findById(id).orElse(null); }

    @Override
    public Infirmiere postInfirmiere(Infirmiere infirmiere) { return this.infirmiereRepository.save(infirmiere); }

    @Override
    public Infirmiere putInfirmiere(Infirmiere infirmiere) { return this.infirmiereRepository.save(infirmiere); }

    @Override
    public void deleteInfirmiere(Integer id) { this.infirmiereRepository.deleteById(id); }
}
