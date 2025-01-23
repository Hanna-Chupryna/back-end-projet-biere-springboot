package com.rc.biere.service;

import com.rc.biere.dto.ArticleDto;
import com.rc.biere.entity.Article;
import com.rc.biere.mapper.ArticleMapper;
import com.rc.biere.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service

public class ArticleService {
    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public List<ArticleDto> getAllArticles() {
        return articleRepository.findAll().stream().map(ArticleMapper::toDto).collect(Collectors.toList());
    }

    public Optional<ArticleDto> getArticleById(Integer id) {
        return articleRepository.findById(id).map(ArticleMapper::toDto);
    }

    public ArticleDto addArticle(ArticleDto articleDto) {
        Article article = ArticleMapper.toEntity(articleDto);
        Article savedArticle = articleRepository.save(article);
        return ArticleMapper.toDto(savedArticle);
    }

}
