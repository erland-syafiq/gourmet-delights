package com.gourmetdelights.api.recipe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {
	
	@Autowired
	private RecipeService recipeService;
	
	@PostMapping("/recipes")
	public Recipe putRecipe(@RequestBody Recipe recipe) {
		return recipeService.putRecipe(recipe);
	}
	
	@GetMapping("/recipes")
	public List<Recipe> getAllRecipes() {
		return recipeService.getAllRecipes();
	}
	
	@GetMapping("/recipes/{id}")
	public Recipe getRecipe(@PathVariable String id) {
		return recipeService.getRecipe(id);
	}
	
	
}
