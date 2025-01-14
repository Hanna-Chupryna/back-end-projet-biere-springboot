package com.rc.biere.mapper;

import com.rc.biere.dto.CouleurDto;
import com.rc.biere.entity.Couleur;

public class CouleurMapper {

    public static CouleurDto toDto(Couleur couleur) {
        CouleurDto dto = new CouleurDto();
        dto.setId(couleur.getId());
        dto.setNomCouleur(couleur.getNomCouleur());
        return dto;
    }

    public static Couleur toEntity(CouleurDto couleurDto) {
        Couleur couleur = new Couleur();
        couleur.setId(couleurDto.getId());
        couleur.setNomCouleur(couleurDto.getNomCouleur());
        return couleur;
    }
}
