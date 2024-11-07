package com.gourmetdelights.api.rating;

import java.io.Serializable;

import com.gourmetdelights.api.recipe.Recipe;
import com.gourmetdelights.api.user.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IngredientId implements Serializable {

    private Recipe recipe;

    private User user;

    private String rating;
}
