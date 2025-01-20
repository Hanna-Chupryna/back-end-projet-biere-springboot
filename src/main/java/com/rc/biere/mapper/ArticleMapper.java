package com.rc.biere.mapper;

import com.rc.biere.dto.ArticleDto;
import com.rc.biere.entity.Article;
import com.rc.biere.entity.Couleur;
import com.rc.biere.entity.Marque;
import com.rc.biere.entity.Typebiere;

public class ArticleMapper {

    public static ArticleDto toDto(Article article) {
        ArticleDto dto = new ArticleDto();
        dto.setId(article.getId());
        dto.setNomArticle(article.getNomArticle());
        dto.setPrixAchat(article.getPrixAchat());
        dto.setVolume(article.getVolume());
        dto.setTitrage(article.getTitrage());

        if(article.getIdMarque() != null) {
            dto.setIdMarque(MarqueMapper.toDto(article.getIdMarque()));
        }

        if(article.getIdCouleur() != null) {
            dto.setIdCouleur(CouleurMapper.toDto(article.getIdCouleur()));
        }

        if(article.getIdType() != null) {
            dto.setIdType(TypebiereMapper.toDto(article.getIdType()));
        }
        return dto;
    }


    public static Article toEntity(ArticleDto articleDto) {
        Article article = new Article();
        article.setId(articleDto.getId());
        article.setNomArticle(articleDto.getNomArticle());
        article.setPrixAchat(articleDto.getPrixAchat());
        article.setVolume(articleDto.getVolume());
        article.setTitrage(articleDto.getTitrage());


        if(articleDto.getIdMarque() != null) {
            article.setIdMarque(MarqueMapper.toEntity(articleDto.getIdMarque()));
        }

        if(articleDto.getIdCouleur() != null) {
            article.setIdCouleur(CouleurMapper.toEntity(articleDto.getIdCouleur()));
        }

        if(articleDto.getIdType() != null) {
            article.setIdType(TypebiereMapper.toEntity(articleDto.getIdType()));
        }

        return article;
    }
}
