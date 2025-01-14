package com.rc.biere.dto;

import com.rc.biere.entity.Continent;


public class PaysDto {
    private Integer id;
    private String nomPays;
    private Continent idContinent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomPays() {
        return nomPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    public Continent getIdContinent() {
        return idContinent;
    }

    public void setIdContinent(Continent idContinent) {
        this.idContinent = idContinent;
    }
}
