package com.gourmetdelights.api.recipe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface RecipeRepository extends JpaRepository<Recipe, UUID> {

    @Query(
        """
        SELECT recipe 
        FROM Recipe recipe 
        JOIN recipe.ingredients ingredient 
        WHERE ingredient.ingredient = :ingredient
        """
    )
    List<Recipe> findRecipesByIngredient(@Param("ingredient") String ingredient);

    @Query(
        """
        SELECT r
        FROM Recipe r
        JOIN r.ingredients i
        WHERE i.ingredient IN :ingredients
        GROUP BY r
        HAVING COUNT(DISTINCT i.ingredient) > 0
        """
    )
    List<Recipe> findRecipesByAllIngredients(@Param("ingredients") List<String> ingredients);
    
}
