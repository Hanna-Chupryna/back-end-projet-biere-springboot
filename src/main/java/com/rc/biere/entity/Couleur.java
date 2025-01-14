package com.rc.biere.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "couleur")
public class Couleur {
    @Id
    @Column(name = "ID_COULEUR", nullable = false)
    private Integer id;

    @Column(name = "NOM_COULEUR", nullable = false, length = 25)
    private String nomCouleur;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomCouleur() {
        return nomCouleur;
    }

    public void setNomCouleur(String nomCouleur) {
        this.nomCouleur = nomCouleur;
    }
}