package com.example.service_webrest_springboot_springdatarest.service.model;

import jakarta.persistence.*;
import jdk.jfr.Category;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Article {
    @Id
    @GeneratedValue
    private Long id;
    private String description;
    private Double price;
    private Double quantity;

    @ManyToOne
    @JoinColumn(name = " categorie_id")
    private Categorie categorie;

    public Article(String description, Double price, Double quantity){
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

}
