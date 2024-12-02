package com.example.service_webrest_springboot_springdatarest.dao;

import com.example.service_webrest_springboot_springdatarest.service.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "categories" , path = "categories")
public interface CategorieRepository  extends JpaRepository<Categorie,Long> {
    Categorie findByCategories(@Param("categorie")String categorie);
}
