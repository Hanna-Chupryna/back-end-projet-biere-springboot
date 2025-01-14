package com.rc.biere.mapper;

import com.rc.biere.dto.FabricantDto;
import com.rc.biere.entity.Fabricant;

public class FabricantMapper {

    public static FabricantDto toDto(Fabricant fabricant) {
        FabricantDto dto = new FabricantDto();
        dto.setId(fabricant.getId());
        dto.setNomFabricant(fabricant.getNomFabricant());
        return dto;
    }

    public static Fabricant toEntity(FabricantDto fabricantDto) {
        Fabricant fabricant = new Fabricant();
        fabricant.setId(fabricantDto.getId());
        fabricant.setNomFabricant(fabricantDto.getNomFabricant());
        return fabricant;
    }
}
