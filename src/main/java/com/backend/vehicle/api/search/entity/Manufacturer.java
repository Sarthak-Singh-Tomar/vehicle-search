package com.backend.vehicle.api.search.entity;

import javax.persistence.*;

@Entity
@Table(name = "manufacturer")
public class Manufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "manufacturer_name")
    private String manufacturerName;
    @Column(name = "country_of_origin")
    private String countryOfOrigin;
}
