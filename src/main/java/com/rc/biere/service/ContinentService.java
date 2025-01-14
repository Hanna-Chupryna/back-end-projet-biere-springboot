package com.rc.biere.service;

import com.rc.biere.dto.ContinentDto;
import com.rc.biere.mapper.ContinentMapper;
import com.rc.biere.repository.ContinentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class ContinentService {

    private final ContinentRepository continentRepository;

    public ContinentService(ContinentRepository continentRepository) {
        this.continentRepository = continentRepository;
    }

    public List<ContinentDto> getAllContinents() {
        return continentRepository.findAll().stream().map(ContinentMapper::toDto).collect(Collectors.toList());
    }
}
