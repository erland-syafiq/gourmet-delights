package com.gourmetdelights.api.rating;

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
public class RatingService {
	
	@Autowired
	private RatingRepository ratingRepository;

	@Autowired
	private UserService userService;
	
	@Transactional
	public Rating putRating(CreateRatingDTO data) {
		Rating rating = new Rating();
        rating.setUserId(data.getUserId());
        rating.setRecipeId(data.getRecipeId());
        rating.setScore(data.getScore());
        rating.setTimeStamp(data.getTimeStamp());

		Rating savedRating = ratingRepository.save(rating);
		return savedRating;
	}
	
	public List<Rating> getAllRatings() {
		return ratingRepository.findAllRatings();
	}
	
	public Rating getRating(UUID id) {
		Optional<Rating> rating = ratingRepository.findById(id);
		
		return rating.get();
	}
	
	public boolean doesRatingExist(UUID id) {
		Optional<Rating> rating = ratingRepository.findById(id);

		return rating.isPresent();
	}
}