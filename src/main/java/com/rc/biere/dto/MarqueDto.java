package com.rc.biere.dto;

import com.rc.biere.entity.Fabricant;
import com.rc.biere.entity.Pays;

public class MarqueDto {
    private Integer id;
    private String nomMarque;
    private Integer idPays;
    private Integer idFabricant;

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

    public Integer getIdPays() {
        return idPays;
    }

    public void setIdPays(Integer idPays) {
        this.idPays = idPays;
    }

    public Integer getIdFabricant() {
        return idFabricant;
    }

    public void setIdFabricant(Integer idFabricant) {
        this.idFabricant = idFabricant;
    }
}
