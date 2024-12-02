package com.example.service_webrest_springboot_springdatarest.domaine;

import com.example.service_webrest_springboot_springdatarest.service.model.Article;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "articleDAO",types= Article.class)
public interface ArticleDTO {
    Long getId();
    @Value("#{target.description}")
    String getDesc();
    Double getPrice();
    @Value("#{target.quantity}")
    Double getQuant();

    @Value("#{target.categorie.categorie}")
    String getCat();
}