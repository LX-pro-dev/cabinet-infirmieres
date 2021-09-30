package com.example.cabinetinfirmieresback.services.impl;

import com.example.cabinetinfirmieresback.models.Adresse;
import com.example.cabinetinfirmieresback.repositories.AdresseRepository;
import com.example.cabinetinfirmieresback.services.AdresseService;

import java.util.List;

public class AdresseServiceImpl implements AdresseService {

    private AdresseRepository adresseRepository;

    public AdresseServiceImpl(AdresseRepository adresseRepository) {
        this.adresseRepository = adresseRepository;
    }

    @Override
    public List<Adresse> findAll() { return this.adresseRepository.findAll(); }

    @Override
    public Adresse findById(Integer id) { return this.adresseRepository.findById(id).orElse(null);    }

    @Override
    public Adresse postAdresse(Adresse adresse) { return this.adresseRepository.save(adresse);   }

    @Override
    public Adresse putAdresse(Adresse adresse) { return this.adresseRepository.save(adresse);   }

    @Override
    public void deleteAdresse(Integer id) { this.adresseRepository.deleteById(id);   }
}
