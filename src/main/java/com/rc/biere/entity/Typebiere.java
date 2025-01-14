package com.rc.biere.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "typebiere")
public class Typebiere {
    @Id
    @Column(name = "ID_TYPE", nullable = false)
    private Integer id;

    @Column(name = "NOM_TYPE", nullable = false, length = 25)
    private String nomType;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomType() {
        return nomType;
    }

    public void setNomType(String nomType) {
        this.nomType = nomType;
    }
}