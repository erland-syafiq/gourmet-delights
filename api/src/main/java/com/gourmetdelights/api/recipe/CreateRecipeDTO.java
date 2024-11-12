package com.gourmetdelights.api.recipe;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CreateRecipeDTO {
    private String authorUsername;
    private String title;
    private int readingTime;
    private String summary;
    private String content;
    private List<String> ingredients;
}
