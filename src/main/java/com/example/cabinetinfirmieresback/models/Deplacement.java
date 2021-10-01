package com.example.cabinetinfirmieresback.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "deplacement")
@Data
public class Deplacement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @Column(name= "date")
    private Date date;

    @Column(name = "cout")
    private Double cout;

    @ManyToOne
    @JoinColumn(name = "infirmiere_id")
    private Infirmiere infirmiere;


}
