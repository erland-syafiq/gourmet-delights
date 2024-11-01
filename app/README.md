# Running the Gourmet Delights Frontend Project

This guide explains how to start the project in development mode using `npm` and how to build and run the Docker image for production.

## 1. Running in Development Mode

To start the Vite development server:

```bash
npm run dev
```

- This command will start the development server, which by default runs on [http://localhost:3000](http://localhost:5173).
- Open your browser and navigate to that address to view the development version of the project.

## 2. Building and Running with Docker

To build and run the project using Docker for production, follow these steps:

### Build the Docker Image

Run the following command to build the Docker image:

```bash
docker build -t gourmetdelights-app .
```

- The `-t` flag tags the image with the name `gourmet-delights-frontend`.
- The `.` at the end specifies the current directory as the context for the Docker build.

### Run the Docker Container

To run the Docker container and expose it on port 80:

```bash
docker run -d -p 80:80 gourmetdelights-app
```
