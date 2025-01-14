package com.rc.biere.service;

import com.rc.biere.dto.PaysDto;
import com.rc.biere.mapper.PaysMapper;
import com.rc.biere.repository.PaysRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class PaysService {

    private final PaysRepository paysRepository;

    public PaysService(PaysRepository paysRepository) {
        this.paysRepository = paysRepository;
    }

    public List<PaysDto> getAllPays(){
        return paysRepository.findAll().stream().map(PaysMapper::toDto).collect(Collectors.toList());
    }

    public List<PaysDto> getPaysByContinentId(Integer continentId){
        return paysRepository.findByIdContinentId(continentId).stream().map(PaysMapper::toDto).collect(Collectors.toList());
    }
}
