-- MySQL dump 10.13  Distrib 8.0.40, for Linux (x86_64)
--
-- Host: localhost    Database: gourmetdelights
-- ------------------------------------------------------
-- Server version	8.0.40

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `recipe_ingredients`
--

DROP TABLE IF EXISTS `recipe_ingredients`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `recipe_ingredients` (
  `recipe_id` binary(16) NOT NULL,
  `ingredient` varchar(255) DEFAULT NULL,
  KEY `fk_recipe` (`recipe_id`),
  CONSTRAINT `fk_recipe` FOREIGN KEY (`recipe_id`) REFERENCES `recipes` (`recipe_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recipe_ingredients`
--

LOCK TABLES `recipe_ingredients` WRITE;
/*!40000 ALTER TABLE `recipe_ingredients` DISABLE KEYS */;
INSERT INTO `recipe_ingredients` VALUES (_binary '°\╥\⌠■Ü\╚\∩ƒ&B¼\0','Tomato'),(_binary '°\╥\⌠■Ü\╚\∩ƒ&B¼\0','Basil'),(_binary '°\╥\⌠■Ü\╚\∩ƒ&B¼\0','Olive oil'),(_binary '°\╥\⌠■Ü\╚\∩ƒ&B¼\0','Shrimp'),(_binary '°\╥\⌠■Ü\╚\∩ƒ&B¼\0','Butter'),(_binary '°\╥\⌠■Ü\╚\∩ƒ&B¼\0','Garlic'),(_binary '°\╥\⌠■Ü\╚\∩ƒ&B¼\0','Parsley'),(_binary '°\╥\⌠■Ü\╚\∩ƒ&B¼\0','Chicken breast'),(_binary '°\╥\⌠■Ü\╚\∩ƒ&B¼\0','Romaine lettuce'),(_binary '°\╥\⌠■Ü\╚\∩ƒ&B¼\0','Croutons'),(_binary '°\╥\⌠■Ü\╚\∩ƒ&B¼\0','Caesar dressing'),(_binary '°\╥\⌠■Ü\╚\∩ƒ&B¼\0','Parmesan cheese'),(_binary '°\╥\⌠■Ü\╚\∩ƒ&B¼\0','Ground beef'),(_binary '°\╥\⌠■Ü\╚\∩ƒ&B¼\0','Taco seasoning'),(_binary '°\╥\⌠■Ü\╚\∩ƒ&B¼\0','Tortillas'),(_binary '°\╥\⌠■Ü\╚\∩ƒ&B¼\0','Cheese'),(_binary '°\╥\⌠■Ü\╚\∩ƒ&B¼\0','Lettuce'),(_binary '°\╥\⌠■Ü\╚\∩ƒ&B¼\0','Tomatoes');
/*!40000 ALTER TABLE `recipe_ingredients` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recipes`
--

DROP TABLE IF EXISTS `recipes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `recipes` (
  `recipe_id` binary(16) NOT NULL,
  `content` varchar(255) DEFAULT NULL,
  `date_published` date DEFAULT NULL,
  `reading_time` int DEFAULT NULL,
  `summary` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`recipe_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recipes`
--

LOCK TABLES `recipes` WRITE;
/*!40000 ALTER TABLE `recipes` DISABLE KEYS */;
INSERT INTO `recipes` VALUES (_binary '\ß\╩úOCBⁿÑÇñ[ú\τƒ','Boil pasta, prepare sauce, mix, and serve.','2024-11-04',5,'A simple and tasty tomato basil pasta recipe.','Tomato Basil Pasta'),(_binary '°\╥\⌠■Ü\╚\∩ƒ&B¼\0','Heat ingredients, blend, and serve.','2024-11-04',10,'Delicious and easy soup','Tomato Basil Soup'),(_binary '°\╥\⌠■Ü\╚\∩ƒ&B¼\0','Melt butter, add garlic, then shrimp. Cook until pink. Serve hot.','2024-11-04',10,'A delicious and simple garlic butter shrimp recipe.','Garlic Butter Shrimp'),(_binary '°\╥\⌠■Ü\╚\∩ƒ&B¼\0','Grill chicken, chop romaine lettuce, add croutons, and toss with Caesar dressing.','2024-11-04',15,'A healthy Caesar salad with grilled chicken.','Chicken Caesar Salad'),(_binary '°\╥\⌠■Ü\╚\∩ƒ&B¼\0','Cook ground beef with taco seasoning. Warm tortillas, add beef, toppings, and serve.','2024-11-04',20,'Easy and delicious beef tacos for your next taco night.','Beef Tacos');
/*!40000 ALTER TABLE `recipes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-11-04 18:14:15
