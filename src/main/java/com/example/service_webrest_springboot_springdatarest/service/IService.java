package com.example.service_webrest_springboot_springdatarest.service;

import com.example.service_webrest_springboot_springdatarest.service.model.Article;
import com.example.service_webrest_springboot_springdatarest.service.model.Categorie;

public interface IService {
    void save(Categorie cat, Article... articles);
}
