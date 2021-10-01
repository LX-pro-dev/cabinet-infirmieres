package com.example.cabinetinfirmieresback.services;

import com.example.cabinetinfirmieresback.models.Infirmiere;

import java.util.List;

public interface InfirmiereService {

    public List<Infirmiere> findAll();

    public Infirmiere findById(Integer id);

    public Infirmiere postInfirmiere(Infirmiere infirmiere);

    public Infirmiere putIfirmiere(Infirmiere infirmiere);

    public void deleteInfirmiere(Integer id);
}
