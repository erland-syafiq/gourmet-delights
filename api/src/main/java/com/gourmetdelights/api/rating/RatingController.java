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
	private RatingService ratingService;
	
	@PostMapping("/ratings")
	public Rating putRating(@RequestBody CreateRatingDTO ratingData) {
		return ratingService.putRating(ratingData);
	}
	
	@GetMapping("/ratings")
	public List<Rating> getAllRatings() {
		List<Rating> ratings = ratingService.getAllRatings();
		return ratings.stream()
					  .collect(Collectors.toList());
	}
	
	@GetMapping("/ratings/{id}")
	public Rating getRating(@PathVariable UUID id) {
		Rating rating = ratingService.getRating(id);
		return rating;
  	}
}