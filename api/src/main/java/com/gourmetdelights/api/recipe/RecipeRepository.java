package com.gourmetdelights.api.recipe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface RecipeRepository extends JpaRepository<Recipe, UUID> {

    // Custom query to find recipes containing at least one of the provided ingredients
    @Query("SELECT DISTINCT r FROM Recipe r JOIN r.ingredients i WHERE i IN :ingredients")
    List<Recipe> findRecipesByIngredients(@Param("ingredients") List<String> ingredients);
}
