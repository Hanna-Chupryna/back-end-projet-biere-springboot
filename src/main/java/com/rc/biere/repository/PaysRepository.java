package com.rc.biere.repository;

import com.rc.biere.entity.Pays;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaysRepository extends JpaRepository<Pays, Integer> {
    List<Pays> findByIdContinentId(Integer idContinent);
}


