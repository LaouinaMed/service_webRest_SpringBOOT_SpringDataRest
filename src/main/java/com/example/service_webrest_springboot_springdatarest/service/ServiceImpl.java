package com.example.service_webrest_springboot_springdatarest.service;

import com.example.service_webrest_springboot_springdatarest.dao.CategorieRepository;
import com.example.service_webrest_springboot_springdatarest.service.model.Article;
import com.example.service_webrest_springboot_springdatarest.service.model.Categorie;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@AllArgsConstructor
public class ServiceImpl implements IService{
    private CategorieRepository categorieRepository;
    @Override
    public void save(Categorie cat, Article... articleList) {
        for(Article a:articleList){
            a.setCategorie(cat);
            cat.getArticles().add(a);
        }
        categorieRepository.save(cat);
    }
}
