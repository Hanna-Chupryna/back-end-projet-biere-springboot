package com.rc.biere.repository;

import com.rc.biere.entity.Article;
import com.rc.biere.entity.Pays;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface PaysRepository extends JpaRepository<Pays, Integer> {
    Optional<Pays> findById(Integer id);

    /*
    Optional<Pays> findByNomPays(String nomPays);

     */
}


