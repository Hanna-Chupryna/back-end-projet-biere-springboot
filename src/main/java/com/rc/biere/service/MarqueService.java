package com.rc.biere.service;

import com.rc.biere.dto.MarqueDto;
import com.rc.biere.mapper.MarqueMapper;
import com.rc.biere.repository.MarqueRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class MarqueService {

    private final MarqueRepository marqueRepository;

    public MarqueService(MarqueRepository marqueRepository) {
        this.marqueRepository = marqueRepository;
    }

    public List<MarqueDto> getAllMarques() {
        return marqueRepository.findAll().stream().map(MarqueMapper::toDto).collect(Collectors.toList());
    }

}
