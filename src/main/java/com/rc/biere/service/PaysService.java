package com.rc.biere.service;

import com.rc.biere.dto.ArticleDto;
import com.rc.biere.dto.PaysDto;
import com.rc.biere.entity.Pays;
import com.rc.biere.mapper.ArticleMapper;
import com.rc.biere.mapper.PaysMapper;
import com.rc.biere.repository.PaysRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
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

    public Optional<PaysDto> getPaysById(Integer id) {
        return paysRepository.findById(id).map(PaysMapper::toDto);
    }

    /*
    public Optional<PaysDto> getPaysByNomPays(String nomPays) {
        return paysRepository.findByNomPays(nomPays).map(PaysMapper::toDto);
    }

     */

    public PaysDto addPays(PaysDto paysDto){
        Pays pays = PaysMapper.toEntity(paysDto);
        Pays savedPays = paysRepository.save(pays);
        return PaysMapper.toDto(savedPays);
    }

    public void deletePaysById(Integer id) {
        paysRepository.deleteById(id);
    }

}
