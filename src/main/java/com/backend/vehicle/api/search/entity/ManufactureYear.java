package com.backend.vehicle.api.search.entity;

import javax.persistence.*;

@Entity
@Table(name = "manufacture_year")
public class ManufactureYear {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int year;
}
