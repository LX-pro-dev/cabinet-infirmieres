package com.example.cabinetinfirmieresback.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="adresse")
@Data
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String numero;
    private String rue;
    private Integer cp;
    private String ville;
}
