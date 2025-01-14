package com.rc.biere.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fabricant")
public class Fabricant {
    @Id
    @Column(name = "ID_FABRICANT", nullable = false)
    private Integer id;

    @Column(name = "NOM_FABRICANT", nullable = false, length = 40)
    private String nomFabricant;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomFabricant() {
        return nomFabricant;
    }

    public void setNomFabricant(String nomFabricant) {
        this.nomFabricant = nomFabricant;
    }
}