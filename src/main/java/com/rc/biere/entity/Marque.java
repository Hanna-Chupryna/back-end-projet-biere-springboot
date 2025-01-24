package com.rc.biere.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "marque")


public class Marque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MARQUE", nullable = false)
    private Integer id;

    @Column(name = "NOM_MARQUE", nullable = false, length = 40)
    private String nomMarque;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAYS")
    @JsonIgnore
    private Pays idPays;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FABRICANT")
    @JsonIgnore
    private Fabricant idFabricant;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomMarque() {
        return nomMarque;
    }

    public void setNomMarque(String nomMarque) {
        this.nomMarque = nomMarque;
    }

    public Pays getIdPays() {
        return idPays;
    }

    public void setIdPays(Pays idPays) {
        this.idPays = idPays;
    }

    public Fabricant getIdFabricant() {
        return idFabricant;
    }

    public void setIdFabricant(Fabricant idFabricant) {
        this.idFabricant = idFabricant;
    }
}