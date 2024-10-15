# Recipes

## Endpoints

### GET `/recipes/<id>`

#### Description
Fetches a recipe with the id of `<id>`. 

#### Response
| Status Code             | Description                             |
|-------------------------|-----------------------------------------|
| 200 OK                  | Returns a JSON of a `recipe`            |
| 500 Internal Server Error | Server error                          |


| Recipe Fields            | Type   | Description                          |
|--------------------------|--------|--------------------------------------|
| recipeId                 | string | Unique id of recipe                  |
| title                    | string | Recipe Title                         |
| authorFName              | string | First name of author                 |
| authorLName              | string | Last name of author                  |
| readingTime              | int    | Time it takes to read recipe in minutes        |
| summary                  | string | Summary of recipe                    |
| content                  | string | Content of the recipe                |
| datePublished            | string | Date published (YYYY-MM-DD)          |
| rating                   | int    | Rating of the recipe, out of 5       |
| ingredients              | list of strings | List of ingredients         |

#### Example Request
```
GET /recipes/1 HTTP/1.1
```

#### Example Response 1
```
HTTP/1.1 200 OK
Access-Control-Allow-Origin: *
Content-Type: application/json

{
    "recipeId": "550e8400-e29b-41d4-a716-446655440000",
    "title": "How to Cook Spaghetti Bolognese: A Step by Step Guide",
    "authorFName": "John",
    "auhotrLName": "Smith",
    "readingTime": 3,
    "summary": "Spaghetti Bolognese is a classic Italian dish that features tender spaghetti noodles topped with a rich, flavorful meat sauce. ",
    "content": "Start by heating olive oil in a large pan and sautéing finely chopped onions, garlic, carrots, and celery until softened. Add ground beef and cook until browned, then stir in canned tomatoes, tomato paste, beef broth, and a splash of red wine for depth. Season with salt, pepper, dried oregano, and a bay leaf, then simmer on low heat for about 30-40 minutes to let the flavors meld. In the meantime, cook your spaghetti until al dente. Serve the rich Bolognese sauce over the spaghetti, topped with freshly grated Parmesan and a sprinkle of fresh basil or parsley.",
    "datePublished": "2024-08-03",
    "rating": 4.8,
    "ingredients": ["spaghetti", "salt", "pepper", "olive oil", "worcestershire sauce", "sugar"]
}
```

#### Example Response 2
```
HTTP/1.1 404 Not Found
Content-Type: application/json
```

### GET `/recipes/search`

#### **Query Parameters:**
- `ingredients` (optional): Search by an ingredient.   
  Example: `/recipes/search?ingredients=chicken`

#### **Example Request:**
`GET /recipes/search?ingredients=cheese`

#### **Response:**
- **Status Code**: 200 OK  
- **Content-Type**: `application/json`  

#### **Error Handling:**
- **Status Code**: 404 Not Found (if no recipes match the search criteria)