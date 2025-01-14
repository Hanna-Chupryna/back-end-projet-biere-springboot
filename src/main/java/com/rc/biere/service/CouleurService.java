package com.rc.biere.service;

import com.rc.biere.dto.CouleurDto;
import com.rc.biere.mapper.CouleurMapper;
import com.rc.biere.repository.CouleurRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class CouleurService {

    private final CouleurRepository couleurRepository;

    public CouleurService(CouleurRepository couleurRepository) {
        this.couleurRepository = couleurRepository;
    }

    public List<CouleurDto> getAllCouleurs() {
        return couleurRepository.findAll()
                .stream().map(CouleurMapper::toDto).collect(Collectors.toList());
    }
}
