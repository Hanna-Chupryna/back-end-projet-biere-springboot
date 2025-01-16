package com.rc.biere.mapper;

import com.rc.biere.dto.MarqueDto;
import com.rc.biere.entity.Fabricant;
import com.rc.biere.entity.Marque;
import com.rc.biere.entity.Pays;

public class MarqueMapper {

    public static MarqueDto toDto(Marque marque) {
        MarqueDto dto = new MarqueDto();
        dto.setId(marque.getId());
        dto.setNomMarque(marque.getNomMarque());

        if (marque.getIdFabricant() != null) {
            dto.setIdFabricant(marque.getIdFabricant().getId());
        }

        if (marque.getIdPays() != null) {
            dto.setIdPays(marque.getIdPays().getId());
        }
        return dto;
    }

    public static Marque toEntity(MarqueDto marqueDto) {
        Marque marque = new Marque();
        marque.setId(marqueDto.getId());
        marque.setNomMarque(marqueDto.getNomMarque());

        if (marqueDto.getIdFabricant() != null) {
            Fabricant fabricant = new Fabricant();
            fabricant.setId(marqueDto.getIdFabricant());
            marqueDto.setIdFabricant(fabricant.getId());
        }
        if (marqueDto.getIdPays() != null) {
            Pays pays = new Pays();
            pays.setId(marqueDto.getIdPays());
            marqueDto.setIdPays(pays.getId());
        }

        return marque;
    }

}
