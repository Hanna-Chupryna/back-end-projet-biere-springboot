package com.rc.biere.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "continent")
public class Continent {
    @Id
    @Column(name = "ID_CONTINENT", nullable = false)
    private Integer id;

    @Column(name = "NOM_CONTINENT", nullable = false, length = 25)
    private String nomContinent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomContinent() {
        return nomContinent;
    }

    public void setNomContinent(String nomContinent) {
        this.nomContinent = nomContinent;
    }
}