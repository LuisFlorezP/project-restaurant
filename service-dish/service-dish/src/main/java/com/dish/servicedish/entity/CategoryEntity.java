package com.dish.servicedish.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity(name = "category_entity")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "category")
    @JsonManagedReference
    @JsonIgnore
    private List<DishEntity> dishEntities;

    public CategoryEntity() {
    }

    public CategoryEntity(Long id, String name, List<DishEntity> dishEntities) {
        this.id = id;
        this.name = name;
        this.dishEntities = dishEntities;
    }

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

    public List<DishEntity> getDishEntities() {
        return dishEntities;
    }

    public void setDishEntities(List<DishEntity> dishEntities) {
        this.dishEntities = dishEntities;
    }
}
