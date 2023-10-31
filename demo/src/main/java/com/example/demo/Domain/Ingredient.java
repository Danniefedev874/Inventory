package com.example.demo.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="ingredient")
public class Ingredient {
    public Ingredient() {
    }

    @Id
    private Long id;
    private String name;
    private String nutrition;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNutrition() {
        return nutrition;
    }

    public void setNutrition(String nutrition) {
        this.nutrition = nutrition;
    }

    public Ingredient(Long id, String name, String nutrition) {
        this.id = id;
        this.name = name;
        this.nutrition = nutrition;
    }

}
