package com.example.cabinetinfirmieresback;

import com.example.cabinetinfirmieresback.repositories.AdresseRepository;
import com.example.cabinetinfirmieresback.repositories.PatientRepository;
import com.example.cabinetinfirmieresback.services.AdresseService;
import com.example.cabinetinfirmieresback.services.PatientService;
import com.example.cabinetinfirmieresback.services.impl.AdresseServiceImpl;
import com.example.cabinetinfirmieresback.services.impl.PatientServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public AdresseService adresseService(AdresseRepository adresseRepository) {
        return new AdresseServiceImpl(adresseRepository);
    }

    @Bean
    public PatientService patientService(PatientRepository patientRepository) {
        return new PatientServiceImpl(patientRepository);
    }
}
