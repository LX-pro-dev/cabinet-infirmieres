package com.example.cabinetinfirmieresback.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name= "infirmiere")
@Data
public class Infirmiere {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "adresse_id")
    private Adresse adresse;

    @Column(name= "numero_profesiionel")
    private Integer numeroProfessionel;

    @Column(name = "nom")
    private String nom;

    @Column(name= "prenom")
    private String prenom;

    @Column(name = "tel_pro")
    private String telPro;

    @Column(name= "tel_perso")
    private String telPerso;

}
