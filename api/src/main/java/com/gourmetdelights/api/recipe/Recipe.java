package com.gourmetdelights.api.recipe;

import java.time.LocalDate;
import java.util.UUID;

import com.gourmetdelights.api.user.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "recipes")
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "recipe_id")
	private UUID recipeId;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "reading_time")
	private int readingTime;

	@Column(name = "date_published")
	private LocalDate datePublished;
	
	@Column(name = "summary")
	private String summary;

	@Column(name = "content")
	private String content;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "author_id", referencedColumnName = "user_id")
	private User author;
}
