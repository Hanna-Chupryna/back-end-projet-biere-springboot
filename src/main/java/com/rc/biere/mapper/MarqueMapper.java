package com.rc.biere.mapper;

import com.rc.biere.dto.FabricantDto;
import com.rc.biere.dto.MarqueDto;
import com.rc.biere.entity.Fabricant;
import com.rc.biere.entity.Marque;

public class MarqueMapper {

    public static MarqueDto toDto(Marque marque) {
        MarqueDto dto = new MarqueDto();
        dto.setId(marque.getId());
        dto.setNomMarque(marque.getNomMarque());
        dto.setIdFabricant(marque.getIdFabricant());
        dto.setIdPays(marque.getIdPays());

        if (marque.getIdFabricant() != null) {
            dto.setIdFabricant(marque.getIdFabricant());
        }

        if (marque.getIdPays() != null) {
            dto.setIdPays(marque.getIdPays());
        }
        return dto;
    }

    public static Marque toEntity(MarqueDto marqueDto) {
        Marque marque = new Marque();
        marque.setId(marqueDto.getId());
        marque.setNomMarque(marqueDto.getNomMarque());
        marque.setIdFabricant(marqueDto.getIdFabricant());
        marque.setIdPays(marqueDto.getIdPays());

        if (marqueDto.getIdFabricant() != null) {
            marque.setIdFabricant(marqueDto.getIdFabricant());
        }
        if (marqueDto.getIdPays() != null) {
            marque.setIdPays(marqueDto.getIdPays());
        }

        return marque;
    }

}
