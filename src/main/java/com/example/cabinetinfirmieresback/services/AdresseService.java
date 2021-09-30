package com.example.cabinetinfirmieresback.services;

import com.example.cabinetinfirmieresback.models.Adresse;

import java.util.List;

public interface AdresseService {
    public List<Adresse> findAll();

    public Adresse findById(Integer id);

    public Adresse postAdresse(Adresse adresse);

    public Adresse putAdresse(Adresse adresse);

    public void deleteAdresse(Integer id);
}
