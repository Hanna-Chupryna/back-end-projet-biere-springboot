package com.rc.biere.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "pays")
public class Pays {
    @Id
    @Column(name = "ID_PAYS", nullable = false)
    private Integer id;

    @Column(name = "NOM_PAYS", nullable = false, length = 40)
    private String nomPays;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_CONTINENT", nullable = false)
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