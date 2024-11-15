package com.gourmetdelights.api.recipe;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost")
@RestController
public class RecipeController {

	@Autowired
	private RecipeService recipeService;
	
	@PostMapping("/recipes")
	public FullRecipeDTO putRecipe(@RequestBody CreateRecipeDTO recipeData) {
		return recipeService.putRecipe(recipeData);
	}
	
	@GetMapping("/recipes")
	public List<FullRecipeDTO> getAllRecipes() {
		List<Recipe> recipes = recipeService.getAllRecipes();
		return recipes.stream()
					  .map(recipeService::convertToFullRecipeDTO)
					  .collect(Collectors.toList());
	}
	
	@GetMapping("/recipes/{id}")
	public FullRecipeDTO getRecipe(@PathVariable UUID id) {
		Recipe recipe = recipeService.getRecipe(id);
		return recipeService.convertToFullRecipeDTO(recipe);
  	}
    
	// Depreciated
	@PostMapping("/recipes/by-ingredients")
	public List<FullRecipeDTO> searchRecipes(@RequestBody List<String> ingredients) {
		List<Recipe> recipes = recipeService.getRecipesByIngredients(ingredients);
		return recipes.stream()
					  .map(recipeService::convertToFullRecipeDTO)
					  .collect(Collectors.toList());
	}

	@GetMapping("/recipes/search")
	public List<FullRecipeDTO> searchRecipesByParameters(@RequestParam("ingredients") List<String> ingredients) {
		List<Recipe> recipes = recipeService.getRecipesByIngredients(ingredients);
		return recipes.stream()
					  .map(recipeService::convertToFullRecipeDTO)
					  .collect(Collectors.toList());
	}

	
}
