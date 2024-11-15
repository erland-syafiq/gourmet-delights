import React, { useState } from "react";
import "./SearchPage.css";

const SearchPage = () => {
    const [ingredients, setIngredients] = useState("");
    const [recipes, setRecipes] = useState([]);
    const [selectedRecipe, setSelectedRecipe] = useState(null);
    const [loading, setLoading] = useState(false);
    const [error, setError] = useState("");

    const mockRecipes = [
        {
            recipeId: "550e8400-e29b-41d4-a716-446655440001",
            title: "Chicken Alfredo Pasta",
            summary: "A creamy, savory pasta dish with tender chicken pieces and Alfredo sauce.",
            content: `Cook pasta according to package instructions. In a large pan, cook chicken until golden brown. Remove chicken and set aside. In the same pan, melt butter, then add minced garlic and sauté for 1-2 minutes. Stir in heavy cream, grated Parmesan cheese, and a pinch of nutmeg. Simmer for 5 minutes until the sauce thickens. Combine pasta, chicken, and sauce, then toss until evenly coated. Garnish with parsley and serve hot.`,
            readingTime: 5,
            datePublished: "2024-05-15",
            rating: 4.5,
            ingredients: ["chicken", "pasta", "cream", "parmesan"]
        },
        {
            recipeId: "550e8400-e29b-41d4-a716-446655440002",
            title: "Classic Chicken Soup",
            summary: "A hearty and comforting chicken soup for cold days.",
            content: `In a large pot, heat olive oil over medium heat. Sauté diced onions, carrots, and celery until softened. Add chicken breast, chicken broth, bay leaf, and a pinch of salt and pepper. Bring to a boil, then reduce heat and simmer for 20 minutes until the chicken is tender. Remove the chicken, shred it using a fork, and return it to the pot. Add noodles or rice if desired, and cook for an additional 10 minutes. Serve hot with fresh parsley.`,
            readingTime: 4,
            datePublished: "2024-06-20",
            rating: 4.8,
            ingredients: ["chicken", "carrots", "celery", "onions"]
        },
        {
            recipeId: "550e8400-e29b-41d4-a716-446655440003",
            title: "Vegetable Stir Fry",
            summary: "A quick and healthy stir fry packed with fresh vegetables.",
            content: `In a wok or large skillet, heat vegetable oil over high heat. Add sliced carrots, broccoli florets, and bell peppers. Stir-fry for 2-3 minutes until vegetables are tender-crisp. Add minced garlic and grated ginger, and stir-fry for another minute. In a small bowl, mix soy sauce, honey, and a dash of sesame oil. Pour the sauce over the vegetables and toss until coated. Serve hot with steamed rice or noodles.`,
            readingTime: 3,
            datePublished: "2024-07-01",
            rating: 4.2,
            ingredients: ["carrots", "broccoli", "bell peppers", "soy sauce"]
        }
    ];
    
    const handleSearch = () => {
        setLoading(true);
        setError("");

        const inputIngredients = ingredients.split(",").map((item) => item.trim().toLowerCase());

        const filteredRecipes = mockRecipes.filter((recipe) =>
            inputIngredients.every((inputIngredient) =>
                recipe.ingredients.some((ingredient) =>
                    ingredient.toLowerCase().includes(inputIngredient)
                )
            )
        );

        if (filteredRecipes.length > 0) {
            setRecipes(filteredRecipes);
        } else {
            setRecipes([]);
            setError("No recipes found with the given ingredients.");
        }

        setLoading(false);
    };

    const handleRecipeClick = (recipe) => {
        console.log("Selected Recipe:", recipe); // Debugging log
        setSelectedRecipe(recipe);
    };

    const handleBackToResults = () => {
        console.log("Back to results clicked");
        setSelectedRecipe(null);
    };

    return (
        <div className="search-page">
            <div className="results-sidebar">
                <h2>Results</h2>
                <ul>
                    {recipes.map((recipe) => (
                        <li
                            key={recipe.recipeId}
                            className="sidebar-item"
                            onClick={() => handleRecipeClick(recipe)}
                        >
                            <h3>{recipe.title}</h3>
                            <p>{recipe.summary}</p>
                            <span>{recipe.readingTime} min</span>
                        </li>
                    ))}
                </ul>
            </div>
    
            {!selectedRecipe ? (
                <div className="main-content">
                    <div className="search-container">
                        <h1 className="search-heading">Find Your Perfect Recipe</h1>
                        <div className="input-container">
                            <input
                                type="text"
                                placeholder="Enter ingredients (e.g., tomato, cheese)"
                                value={ingredients}
                                onChange={(e) => setIngredients(e.target.value)}
                                className="search-input"
                            />
                            <button onClick={handleSearch} className="search-button">
                                Search
                            </button>
                        </div>
                        {loading && <p className="loading-text">Loading...</p>}
                        {error && <p className="error-text">{error}</p>}
                    </div>
                </div>
            ) : (
                <div className="main-content">
                    <div className="recipe-details">
                        <button className="back-button" onClick={handleBackToResults}>
                            Back to Search
                        </button>
                        <h2>{selectedRecipe.title}</h2>
                        <p><strong>Summary:</strong> {selectedRecipe.summary}</p>
                        <p><strong>Ingredients:</strong> {selectedRecipe.ingredients.join(", ")}</p>
                        <h3>Instructions:</h3>
                        <p>{selectedRecipe.content}</p>
                    </div>
                </div>
            )}
        </div>
    );
    
};

export default SearchPage;
