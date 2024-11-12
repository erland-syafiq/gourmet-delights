package com.gourmetdelights.api.recipe;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FullRecipeDTO {
    private UUID recipeId;
    private String title;
    private String authorFName;
    private String authorLName;
    private int readingTime;
    private String summary;
    private String content;
    private LocalDate datePublished;
    private int rating;
    private List<String> ingredients;
}
