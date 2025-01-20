package com.rc.biere.mapper;

import com.rc.biere.dto.VendreDto;
import com.rc.biere.entity.Vendre;

public class VendreMapper {

    public static VendreDto toDto(Vendre vendre) {
        VendreDto dto = new VendreDto();
        dto.setId(vendre.getId());
        dto.setAnnee(vendre.getAnnee());
        dto.setQuantite(vendre.getQuantite());
        dto.setPrixVente(vendre.getPrixVente());
        return dto;
    }

    public static Vendre toEntity(VendreDto vendreDto) {
        Vendre vendre = new Vendre();
        vendre.setId(vendreDto.getId());
        vendre.setAnnee(vendreDto.getAnnee());
        vendre.setQuantite(vendreDto.getQuantite());
        vendre.setPrixVente(vendreDto.getPrixVente());
        return vendre;
    }
}
