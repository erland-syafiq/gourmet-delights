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
	
	public Recipe putRecipe(Recipe recipe) {
		return recipeRepository.save(recipe);
	}
	
	public List<Recipe> getAllRecipes() {
		return recipeRepository.findAll();
	}
	
	public Recipe getRecipe(UUID id) {
		Optional<Recipe> recipe = recipeRepository.findById(id);
		
		return recipe.get();
	}
	
	public boolean doesRecipeExist(UUID id) {
		Optional<Recipe> recipe = recipeRepository.findById(id);
		
		return recipe.isPresent();
	}
	
}
