# Gourmet Delights

**Gourmet Delights** is a web application that lets users search for delicious recipes based on the ingredients they have on hand. This convenient recipe search tool empowers home cooks to create new meals without the hassle of extensive planning, minimizing waste and maximizing creativity in the kitchen. Users simply input the ingredients they have, and the app suggests recipes that match!

## Features

- **Ingredient-based Recipe Search**: Enter available ingredients, and Gourmet Delights will suggest matching recipes.
- **Detailed Recipe Information**: Each recipe includes preparation steps, cooking time, and nutritional information.
- **User-Friendly Interface**: Designed for easy navigation, making it simple for users of all levels to find recipes quickly.

## Running Gourmet Delights Using Docker Compose

To start the Gourmet Delights app using Docker Compose, follow these steps.

### Prerequisites

- [Docker](https://docs.docker.com/get-docker/) and [Docker Compose](https://docs.docker.com/compose/install/) installed on your machine.

### Docker Compose Setup

Ensure your project has a `docker-compose.yml` file in the root directory, configured to build and run the **Gourmet Delights** application.

### Starting the App with Docker Compose

1. **Navigate to the project directory**:

   ```bash
   cd /path/to/gourmet-delights
   ```

2. **Run the application** with Docker Compose:

   ```bash
   docker compose up --build
   ```

   - The `--build` flag ensures that Docker rebuilds the image if there are any changes to the code.
   - Docker Compose will build the necessary images, start the containers, and expose the app to a specified port.

3. **Access the Application**:

   Once Docker Compose has started all services, open your browser and go to [http://localhost](http://localhost) to access the Gourmet Delights website.

### Stopping the Application

To stop the application, press `Ctrl + C` in the terminal where `docker compose up` is running, or use the following command to stop and remove containers:

```bash
docker compose down
```