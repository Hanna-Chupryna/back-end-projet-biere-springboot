package com.rc.biere.mapper;

import com.rc.biere.dto.PaysDto;
import com.rc.biere.entity.Continent;
import com.rc.biere.entity.Pays;

public class PaysMapper {

    public static PaysDto toDto(Pays pays) {
        PaysDto dto = new PaysDto();
        dto.setId(pays.getId());
        dto.setNomPays(pays.getNomPays());

        if (pays.getIdContinent() != null) {
            dto.setIdContinent(pays.getIdContinent().getId());
        }
        return dto;
    }

    public static Pays toEntity(PaysDto paysDto) {
        Pays pays = new Pays();
        pays.setId(paysDto.getId());
        pays.setNomPays(paysDto.getNomPays());

        if (paysDto.getIdContinent() != null) {
            Continent continent = new Continent();
            continent.setId(paysDto.getIdContinent());
            paysDto.setIdContinent(continent.getId());
        }
        return pays;
    }
}
