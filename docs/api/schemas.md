# Recipes

## Schemas

### GET `/recipes/<id>`

#### Description
Fetches schemas with their respective primary key id.

#### Response
##### Possible Responses
| Status Code             | Description                             |
|-------------------------|-----------------------------------------|
| 200 OK                  | Returns a JSON of a `recipe`            |
| 404 Not Found           | Recipe not found                        |
| 500 Server Error        | Internal Server Errror.                 |

##### Recipe Fields
| Recipe Fields            | Type   | Description                          |
|--------------------------|--------|--------------------------------------|
| recipeId                 | string | Unique id of recipe                  |
| content                  | string | The details of the recipe            |
| datePublished            | date   | Date published (YYYY-MM-DD)    |
| readingTime              | int    | Time it takes to read recipe in minutes        |
| summary                  | string | Summary of recipe                    |
| title                    | string | Title of the recipe       |
| authorId                 | string | Id of the author of the recipe         |

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

#### Query Parameters
- `ingredients` (optional): Search by an ingredient.   
  Example: `/recipes/search?ingredients=chicken`

#### Example Request
`GET /recipes/search?ingredients=cheese`

#### Response
##### Possible Responses
| Status Code             | Description                             |
|-------------------------|-----------------------------------------|
| 200 OK                  | Returns a JSON list of `recipe`         |
| 404 Not Found           | Recipe not found                        |
| 500 Server Error        | Internal Server Errror.                 |

##### Recipe Fields
| Recipe Fields            | Type   | Description                          |
|--------------------------|--------|--------------------------------------|
| recipeId                 | string | Unique id of recipe                  |
| content                  | string | The details of the recipe            |
| datePublished            | date   | Date published (YYYY-MM-DD)    |
| readingTime              | int    | Time it takes to read recipe in minutes        |
| summary                  | string | Summary of recipe                    |
| title                    | string | Title of the recipe       |
| authorId                 | string | Id of the author of the recipe         |

Note: The result of this search query will not include the recipe's content to save space.


# Users

## Schemas

### GET `/users/<id>`

#### Description
Fetches schemas with their respective primary key id.

#### Response
##### Possible Responses
| Status Code             | Description                             |
|-------------------------|-----------------------------------------|
| 200 OK                  | Returns a JSON of a `user`            |
| 404 Not Found           | Recipe not found                        |
| 500 Server Error        | Internal Server Errror.                 |

##### User Fields
| User Fields            | Type   | Description                          |
|------------------------|--------|--------------------------------------|
| userId                 | string | Unique id of user                  |
| dateOfBirth            | date   | Date of birth (YYYY-MM-DD)    |
| firstName              | string    | First name of the user        |
| lastName               | string | Last name of the user                    |
| password               | string | User's password       |
| username               | string | User's username         |


# Recipe Ingredients

## Schemas

### GET `/recipe_ingredients/<id>`

#### Description
Fetches schemas with their respective primary key id.

#### Response
##### Possible Responses
| Status Code             | Description                             |
|-------------------------|-----------------------------------------|
| 200 OK                  | Returns a JSON of a `recipe_ingredient`            |
| 404 Not Found           | Recipe not found                        |
| 500 Server Error        | Internal Server Errror.                 |

##### User Fields
| User Fields            | Type   | Description                          |
|------------------------|--------|--------------------------------------|
| ingredient             | string | Name of the ingredient                  |
| recipeId               | string    | Unique id of the recipe that this ingredient is part of       |


# Ratings

## Schemas

### GET `/ratings/<id>`

#### Description
Fetches schemas with their respective primary key id.

#### Response
##### Possible Responses
| Status Code             | Description                             |
|-------------------------|-----------------------------------------|
| 200 OK                  | Returns a JSON of a `rating`            |
| 404 Not Found           | Recipe not found                        |
| 500 Server Error        | Internal Server Errror.                 |

##### User Fields
| User Fields            | Type   | Description                          |
|------------------------|--------|--------------------------------------|
| userId                 | string | Unique id of the user who gave the rating                  |
| recipeId               | string    | Unique id of the recipe that this rating is for       |
| score                  | int    | The score given by the user, out of 5        |
| timeStamp              | Timestamp    | The time that this rating was given        |
