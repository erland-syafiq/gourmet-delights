package com.gourmetdelights.api.recipe;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gourmetdelights.api.ingredient.Ingredient;
import com.gourmetdelights.api.user.User;
import com.gourmetdelights.api.user.UserService;

import jakarta.transaction.Transactional;

@Service
public class RecipeService {
	
	@Autowired
	private RecipeRepository recipeRepository;

	@Autowired
	private UserService userService;
	
	@Transactional
	public FullRecipeDTO putRecipe(CreateRecipeDTO data) {
		User author = userService.getUserByUsername(data.getAuthorUsername());

		Recipe recipe = new Recipe();
		recipe.setAuthor(author);
		recipe.setTitle(data.getTitle());
		recipe.setReadingTime(data.getReadingTime());
		recipe.setSummary(data.getSummary());
		recipe.setDatePublished(LocalDate.now());
		recipe.setIngredients(new ArrayList<Ingredient>());
		recipe.setContent(data.getContent());
		
		for (String ingredientString : data.getIngredients()) {
			Ingredient ingredient = new Ingredient(recipe, ingredientString);
			recipe.getIngredients().add(ingredient);
		}

		Recipe savedRecipe = recipeRepository.save(recipe);
		return this.convertToFullRecipeDTO(savedRecipe);
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
		fullRecipe.setRecipeId(recipe.getRecipeId());
        fullRecipe.setTitle(recipe.getTitle());
        fullRecipe.setAuthorFName(recipe.getAuthor().getFirstName());
        fullRecipe.setAuthorLName(recipe.getAuthor().getLastName());
        fullRecipe.setReadingTime(recipe.getReadingTime());
        fullRecipe.setSummary(recipe.getSummary());
        fullRecipe.setContent(recipe.getContent());
        fullRecipe.setDatePublished(recipe.getDatePublished());
        fullRecipe.setRating(3);
        fullRecipe.setIngredients(
            recipe.getIngredients()
                .stream()
                .map((ingredient) -> ingredient.getIngredient())
                .collect(Collectors.toList()));
		return fullRecipe;
	}

    public List<Recipe> getRecipesByIngredients(List<String> ingredients) {
        return recipeRepository.findRecipesByAllIngredients(ingredients);
    }
}
