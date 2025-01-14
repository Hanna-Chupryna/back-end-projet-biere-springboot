package com.rc.biere.service;

import com.rc.biere.dto.FabricantDto;
import com.rc.biere.entity.Fabricant;
import com.rc.biere.mapper.FabricantMapper;
import com.rc.biere.repository.FabricantRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class FabricantService {

    private final FabricantRepository fabricantRepository;

    public FabricantService(FabricantRepository fabricantRepository) {
        this.fabricantRepository = fabricantRepository;
    }

    public List<FabricantDto> getAllFabricant(){
        return fabricantRepository.findAll().stream().map(FabricantMapper::toDto).collect(Collectors.toList());
    }
}
