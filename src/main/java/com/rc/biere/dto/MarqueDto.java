package com.rc.biere.dto;

import com.rc.biere.entity.Fabricant;
import com.rc.biere.entity.Pays;

public class MarqueDto {
    private Integer id;
    private String nomMarque;
    private Pays idPays;
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
