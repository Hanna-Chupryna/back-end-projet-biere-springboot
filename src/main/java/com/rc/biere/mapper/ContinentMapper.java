package com.rc.biere.mapper;

import com.rc.biere.dto.ContinentDto;
import com.rc.biere.entity.Continent;

public class ContinentMapper {

    public static ContinentDto toDto(Continent continent) {
        ContinentDto dto = new ContinentDto();
        dto.setId(continent.getId());
        dto.setNomContinent(continent.getNomContinent());
        return dto;
    }

    public static Continent toEntity(ContinentDto continentDto) {
        Continent continent = new Continent();
        continent.setId(continentDto.getId());
        continent.setNomContinent(continentDto.getNomContinent());
        return continent;
    }
}
