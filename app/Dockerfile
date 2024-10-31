# Stage 1: Build with Node
FROM node:18-alpine3.17 as build

WORKDIR /app

# Copy files and install dependencies in the Node stage
COPY . /app
RUN npm install
RUN npm run build

# Stage 2: Serve with NGINX
FROM ubuntu:latest

# Install NGINX
RUN apt-get update && \
    apt-get install -y nginx && \
    rm -rf /var/lib/apt/lists/*

# Copy built files from the build stage
COPY --from=build /app/dist /var/www/html/

# Expose port and start NGINX
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
