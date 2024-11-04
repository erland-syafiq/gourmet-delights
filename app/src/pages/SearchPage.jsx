import React, { useState } from 'react';
import './SearchPage.css'; // Assuming you will create a SearchPage.css file

const SearchPage = () => {
    const [ingredients, setIngredients] = useState("");
    const [recipes, setRecipes] = useState([]);
    const [loading, setLoading] = useState(false);
    const [error, setError] = useState("");

    const handleSearch = async () => {
        setLoading(true);
        setError("");
        try {
            const formattedIngredients = ingredients.split(',').map(item => item.trim());
            console.log('Searching with ingredients:', formattedIngredients);
            
            const response = await fetch('http://localhost:8080/recipes/by-ingredients', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(formattedIngredients)
            });
    
            if (response.ok) {
                const data = await response.json();
                setRecipes(data);
            } else if (response.status === 404) {
                setError("No recipes found with the given ingredients.");
                setRecipes([]);
            } else {
                setError("An error occurred while searching for recipes.");
                setRecipes([]);
            }
        } catch (e) {
            setError("Network error. Please try again.");
            setRecipes([]);
        } finally {
            setLoading(false);
        }
    };
    

    return (
        <div className="search-page">
            <div className="search-container">
                <h1 className="search-heading">Find Your Perfect Recipe</h1>
                <p className="search-description">Enter ingredients to find delicious recipes tailored just for you.</p>
                <div className="input-container">
                    <input
                        type="text"
                        placeholder="Enter ingredients (e.g., tomato, cheese)"
                        value={ingredients}
                        onChange={(e) => setIngredients(e.target.value)}
                        className="search-input"
                    />
                    <button onClick={handleSearch} className="search-button">Search</button>
                </div>
                {loading && <p className="loading-text">Loading...</p>}
                {error && <p className="error-text">{error}</p>}
            </div>

            {recipes.length > 0 && (
                <div className="recipe-results">
                    {recipes.map((recipe) => (
                        <div key={recipe.recipeId} className="recipe-card">
                            <h3 className="recipe-title">{recipe.title}</h3>
                            <p className="recipe-content">
                                <strong>Summary:</strong> {recipe.summary}<br />
                                <strong>Ingredients:</strong> {recipe.ingredients.join(", ")}
                            </p>
                        </div>
                    ))}
                </div>
            )}
        </div>
    );
};

export default SearchPage;
