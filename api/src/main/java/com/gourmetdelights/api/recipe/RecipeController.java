package com.gourmetdelights.api.recipe;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost")
@RestController
public class RecipeController {
    
    @Autowired
    private RecipeService recipeService;
    
    // Existing CRUD operations

    @PostMapping("/recipes")
    public Recipe putRecipe(@RequestBody Recipe recipe) {
        return recipeService.putRecipe(recipe);
    }

    @GetMapping("/recipes")
    public List<Recipe> getAllRecipes() {
        return recipeService.getAllRecipes();
    }

    @GetMapping("/recipes/{id}")
    public Recipe getRecipe(@PathVariable UUID id) {
        return recipeService.getRecipe(id);
    }

    // Search endpoint
	@PostMapping("/recipes/by-ingredients")
	public List<Recipe> searchRecipes(@RequestBody List<String> ingredients) {
		return recipeService.getRecipesByIngredients(ingredients);
	}

}
