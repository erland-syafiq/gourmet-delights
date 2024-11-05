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

	public FullRecipeDTO convertToFullRecipeDTO(Recipe recipe) {
		FullRecipeDTO fullRecipe = new FullRecipeDTO();
		fullRecipe.setRecipeID(recipe.getRecipeId());
        fullRecipe.setTitle(recipe.getTitle());
        fullRecipe.setAuthorFName(recipe.getAuthor().getFirstName());
        fullRecipe.setAuthorLName(recipe.getAuthor().getLastName());
        fullRecipe.setReadingTime(recipe.getReadingTime());
        fullRecipe.setSummary(recipe.getSummary());
        fullRecipe.setContent(recipe.getContent());
        fullRecipe.setDatePublished(recipe.getDatePublished());
        fullRecipe.setRating(3);
		return fullRecipe;
	}
	
    public Recipe getRecipe(UUID id) {
        Optional<Recipe> recipe = recipeRepository.findById(id);
        return recipe.orElse(null); // Using orElse to prevent throwing an exception if the recipe is not found
    }

    public boolean doesRecipeExist(UUID id) {
        return recipeRepository.existsById(id);
    }

    public List<Recipe> getRecipesByIngredients(List<String> ingredients) {
        return recipeRepository.findRecipesByAllIngredients(ingredients);
    }
}
