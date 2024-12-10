package com.gourmetdelights.api.rating;

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
public class RatingController {

	@Autowired
	private RatingService recipeService;
	
	@PostMapping("/ratings")
	public FullRecipeDTO putRating(@RequestBody CreateRatingDTO ratingData) {
		return ratingService.putRating(ratingData);
	}
	
	@GetMapping("/ratings")
	public List<FullRatingDTO> getAllRatings() {
		List<Rating> ratings = ratingService.getAllRatings();
		return ratings.stream()
					  .map(ratingService::convertToFullRatingDTO)
					  .collect(Collectors.toList());
	}
	
	@GetMapping("/ratings/{id}")
	public FullRatingDTO getRating(@PathVariable UUID id) {
		Recipe rating = ratingService.getRating(id);
		return ratingService.convertToFullRatingDTO(rating);
  	}
}
