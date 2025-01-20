package com.rc.biere.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "vendre")
public class Vendre {
    @EmbeddedId
    private VendreId id;

    @MapsId("annee")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ANNEE", nullable = false)
    private Article annee;

    @Column(name = "QUANTITE")
    private Integer quantite;

    @Column(name = "prix_vente", precision = 19, scale = 4)
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