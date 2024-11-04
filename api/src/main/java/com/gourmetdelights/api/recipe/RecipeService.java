package com.gourmetdelights.api.recipe;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {
	
    @Autowired
    private RecipeRepository recipeRepository;

    // Existing methods

    public Recipe putRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }
	
    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }
	
    public Recipe getRecipe(UUID id) {
        Optional<Recipe> recipe = recipeRepository.findById(id);
        return recipe.orElse(null); // Using orElse to prevent throwing an exception if the recipe is not found
    }

    public boolean doesRecipeExist(UUID id) {
        return recipeRepository.existsById(id);
    }

    // New method to search recipes by ingredients
    public List<Recipe> getRecipesByIngredients(List<String> ingredients) {
        return recipeRepository.findRecipesByIngredients(ingredients);
    }
}
