package com.gourmetdelights.api.ingredient;

import com.gourmetdelights.api.recipe.Recipe;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="recipe_ingredients")
@IdClass(IngredientId.class)
public class Ingredient {
    
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="recipe_id", referencedColumnName = "recipe_id")
    private Recipe recipe;

    @Id
    @Column(name="ingredient")
    private String ingredient;
}
