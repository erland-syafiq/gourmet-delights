package com.gourmetdelights.api.rating;

import java.util.UUID;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface RatingRepository extends JpaRepository<Rating, UUID> {

    @Query(
        """
        SELECT rating 
        FROM Rating rating
        WHERE rating.user_id = :user_id
        """
    )
    List<Rating> findRatingsByUser(@Param("user_id") String user_id);

    @Query(
        """
        SELECT *
        FROM Rating rating
        """
    )
    List<Rating> findAllRatings();
    
}