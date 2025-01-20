package com.rc.biere.service;

import com.rc.biere.dto.VendreDto;
import com.rc.biere.mapper.VendreMapper;
import com.rc.biere.repository.VendreRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class VendreService {

    private final VendreRepository vendreRepository;

    public VendreService(VendreRepository vendreRepository) {
        this.vendreRepository = vendreRepository;
    }

    public List<VendreDto> getAllVendre() {
        return vendreRepository.findAll().stream().map(VendreMapper::toDto).collect(Collectors.toList());
    }
}
