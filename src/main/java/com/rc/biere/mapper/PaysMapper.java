package com.rc.biere.mapper;

import com.rc.biere.dto.PaysDto;
import com.rc.biere.entity.Pays;

public class PaysMapper {

    public static PaysDto toDto(Pays pays) {
        PaysDto dto = new PaysDto();
        dto.setId(pays.getId());
        dto.setNomPays(pays.getNomPays());
        dto.setIdContinent(pays.getIdContinent());
        return dto;
    }

    public static Pays toEntity(PaysDto paysDto) {
        Pays pays = new Pays();
        pays.setId(paysDto.getId());
        pays.setNomPays(paysDto.getNomPays());
        pays.setIdContinent(paysDto.getIdContinent());
        return pays;
    }
}
