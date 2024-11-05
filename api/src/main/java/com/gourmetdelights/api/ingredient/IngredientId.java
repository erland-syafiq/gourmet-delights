package com.gourmetdelights.api.ingredient;

import java.io.Serializable;

import com.gourmetdelights.api.recipe.Recipe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IngredientId implements Serializable {

    private Recipe recipe;

    private String ingredient;
}
