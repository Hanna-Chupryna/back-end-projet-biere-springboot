package com.rc.biere.dto;

import com.rc.biere.entity.Fabricant;
import com.rc.biere.entity.Pays;

public class MarqueDto {
    private Integer id;
    private String nomMarque;
    private PaysDto idPays;
    private FabricantDto idFabricant;

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

    public PaysDto getIdPays() {
        return idPays;
    }

    public void setIdPays(PaysDto idPays) {
        this.idPays = idPays;
    }

    public FabricantDto getIdFabricant() {
        return idFabricant;
    }

    public void setIdFabricant(FabricantDto idFabricant) {
        this.idFabricant = idFabricant;
    }
}
