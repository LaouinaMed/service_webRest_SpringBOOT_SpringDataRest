package com.example.service_webrest_springboot_springdatarest.dao;

import com.example.service_webrest_springboot_springdatarest.domaine.ArticleDTO;
import com.example.service_webrest_springboot_springdatarest.service.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "articles",path="ecommerce",excerptProjection = ArticleDTO.class)
public interface ArticleRepository extends JpaRepository<Article, Long> {
    @RestResource(path = "byDescription" , rel = "customFindByDescription")
    List<Article> findByDescription(@Param("description") String description);
}
