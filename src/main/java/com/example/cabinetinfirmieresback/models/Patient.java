package com.example.cabinetinfirmieresback.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

enum Sexe {
    Homme,
    Femme,
    Autre;
}

@Entity
@Table(name= "patient")
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "adresse_id")
    private Adresse adresse;

    @ManyToOne
    @JoinColumn(name = "infirmiere_id")
    private Infirmiere infirmiere;

    @Column(name= "nom")
    private String nom;

    @Column(name= "prenom")
    private String prenom;

    @Column(name= "date_de_naissance")
    private LocalDateTime dateDeNaissance;

    @Column(columnDefinition = "ENUM('Homme','Femme','Autre')")
    @Enumerated(EnumType.STRING)
    private Sexe sexe;

    @Column(name= "numero_securite_social")
    private Long numeroSecuriteSocial;

}
