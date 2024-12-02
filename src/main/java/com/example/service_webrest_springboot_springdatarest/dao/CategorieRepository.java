package com.example.service_webrest_springboot_springdatarest.dao;

import com.example.service_webrest_springboot_springdatarest.service.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "categorie" , path = "categories")
public interface CategorieRepository  extends JpaRepository<Categorie,Long> {
    Categorie findByCategorie(@Param("categorie")String categorie);
}
