package com.gourmetdelights.api.rating;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CreateRatingDTO {
    private UUID userId;
    private UUID recipeId;
    private int score;
    private Timestamp timeStamp;
}