package com.rc.biere.mapper;

import com.rc.biere.dto.TypebiereDto;
import com.rc.biere.entity.Typebiere;

public class TypebiereMapper {

    public static TypebiereDto toDto(Typebiere typebiere) {
        TypebiereDto dto = new TypebiereDto();
        dto.setId(typebiere.getId());
        dto.setNomType(typebiere.getNomType());
        return dto;
    }

    public static Typebiere toEntity(TypebiereDto typebiereDto) {
        Typebiere typebiere = new Typebiere();
        typebiere.setId(typebiereDto.getId());
        typebiere.setNomType(typebiereDto.getNomType());
        return typebiere;
    }
}
