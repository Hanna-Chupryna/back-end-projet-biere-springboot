package com.rc.biere.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "article")
public class Article {
    @Id
    @Column(name = "ID_ARTICLE", nullable = false)
    private Integer id;

    @Column(name = "NOM_ARTICLE", nullable = false, length = 60)
    private String nomArticle;

    @Column(name = "prix_achat", nullable = false, precision = 19, scale = 4)
    private BigDecimal prixAchat;

    @Column(name = "VOLUME")
    private Integer volume;

    @Column(name = "TITRAGE")
    private Float titrage;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_MARQUE", nullable = false)
    private com.rc.biere.entity.Marque idMarque;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_COULEUR")
    private com.rc.biere.entity.Couleur idCouleur;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TYPE")
    private com.rc.biere.entity.Typebiere idType;

}