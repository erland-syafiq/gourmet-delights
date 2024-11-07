package com.gourmetdelights.api.rating;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import com.gourmetdelights.api.user.User;
import com.gourmetdelights.api.recipe.Recipe;

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
@IdClass(RatingId.class)
public class Rating {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id", referencedColumnName = "user_id")
    private User recipe;
    
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="recipe_id", referencedColumnName = "recipe_id")
    private Recipe recipe;
    
    @Column(name = "rating_score")
    private int score;

    @Column(name = "time_stamp")
    private Timestamp timeStamp;
}
