package com.rc.biere.dto;

import com.rc.biere.entity.Article;
import com.rc.biere.entity.VendreId;
import jakarta.persistence.*;

import java.math.BigDecimal;

public class VendreDto {

    private VendreId id;
    private Article annee;
    private Integer quantite;
    private BigDecimal prixVente;

    public VendreId getId() {
        return id;
    }

    public void setId(VendreId id) {
        this.id = id;
    }

    public Article getAnnee() {
        return annee;
    }

    public void setAnnee(Article annee) {
        this.annee = annee;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public BigDecimal getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(BigDecimal prixVente) {
        this.prixVente = prixVente;
    }
}
