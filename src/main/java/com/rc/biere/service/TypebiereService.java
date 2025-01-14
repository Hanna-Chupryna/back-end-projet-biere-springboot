package com.rc.biere.service;

import com.rc.biere.dto.TypebiereDto;
import com.rc.biere.entity.Typebiere;
import com.rc.biere.mapper.TypebiereMapper;
import com.rc.biere.repository.TypebiereRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class TypebiereService {

    private final TypebiereRepository typebiereRepository;

    public TypebiereService(TypebiereRepository typebiereRepository) {
        this.typebiereRepository = typebiereRepository;
    }

    public List<TypebiereDto> getAllTypebiere() {
        return typebiereRepository.findAll().stream().map(TypebiereMapper::toDto).collect(Collectors.toList());
    }
}
