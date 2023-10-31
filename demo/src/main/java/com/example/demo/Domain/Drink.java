package com.example.demo.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity(name = "drink")
public class Drink {
    @Id
    private Long id;

    private String name;
    private int capacity;
    private String colour;
    private String type;
    private String company;
    @OneToMany
    private List<Ingredient> ingredients;

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Drink(String name, int capacity, String colour, String type, String company, List<Ingredient> ingredients) {
        this.name = name;
        this.capacity = capacity;
        this.colour = colour;
        this.type = type;
        this.company = company;
        this.ingredients = ingredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Drink(){
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public String getCompany() {
        return company;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
