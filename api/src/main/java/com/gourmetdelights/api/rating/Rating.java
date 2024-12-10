package com.gourmetdelights.api.rating;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.sql.Timestamp;

import com.gourmetdelights.api.user.User;
import com.gourmetdelights.api.ingredient.Ingredient;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "ratings")
@NoArgsConstructor
@AllArgsConstructor
public class Rating {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "user_id")
    private UUID userId;
    
    @Column(name = "recipe_id")
    private UUID recipeId;
    
    @Column(name = "score")
    private int score;

    @Column(name = "timestamp")
    private Timestamp timeStamp;
}