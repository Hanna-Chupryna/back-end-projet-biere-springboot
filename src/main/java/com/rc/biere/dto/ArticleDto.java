package com.rc.biere.dto;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;

public class   ArticleDto {
    private Integer id;
    private String nomArticle;
    private BigDecimal prixAchat;
    private Integer volume;
    private Float titrage;
    private MarqueDto idMarque;
    private CouleurDto idCouleur;
    private TypebiereDto idType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomArticle() {
        return nomArticle;
    }

    public void setNomArticle(String nomArticle) {
        this.nomArticle = nomArticle;
    }

    public BigDecimal getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(BigDecimal prixAchat) {
        this.prixAchat = prixAchat;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Float getTitrage() {
        return titrage;
    }

    public void setTitrage(Float titrage) {
        this.titrage = titrage;
    }

    public MarqueDto getIdMarque() {
        return idMarque;
    }

    public void setIdMarque(MarqueDto idMarque) {
        this.idMarque = idMarque;
    }

    public CouleurDto getIdCouleur() {
        return idCouleur;
    }

    public void setIdCouleur(CouleurDto idCouleur) {
        this.idCouleur = idCouleur;
    }

    public TypebiereDto getIdType() {
        return idType;
    }

    public void setIdType(TypebiereDto idType) {
        this.idType = idType;
    }
}
