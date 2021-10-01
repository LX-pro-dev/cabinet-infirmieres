package com.example.cabinetinfirmieresback.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

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
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    private Date dateDeNaissance;

    @Column(columnDefinition = "ENUM('Homme','Femme','Autre')")
    @Enumerated(EnumType.STRING)
    private Sexe sexe;

    @Column(name= "numero_securite_sociale")
    private Long numeroSecuriteSociale;

}
