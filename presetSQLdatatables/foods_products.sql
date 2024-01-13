-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: foods
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `food_id` int NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `imageDirectory` varchar(255) NOT NULL,
  `price` double NOT NULL,
  `type` varchar(255) NOT NULL,
  `ingredients` varchar(255) NOT NULL,
  PRIMARY KEY (`food_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'Triple Cheese','A thick, strechy, creamy, cheesy pizza. Warm right out the oven. Any mouse\'s dream.','C:\\\\Users\\\\m_che\\\\Documents\\\\NetBeansProjects\\\\Pizza Cashier Interference\\\\src\\\\pizza\\\\cashier\\\\interference\\\\images\\\\pizza.jpg',11.95,'Specialty Pizza','Yeast, Bread flour, Olive oil, Salt, Sugar, Tomato sauce, Mozzarella cheese, Cheddar cheese, Brie cheese'),(2,'Milk','Straight from the cow, with a little extra magic. Who doesn\'t like cold milk?','C:\\\\Users\\\\m_che\\\\Documents\\\\NetBeansProjects\\\\Pizza Cashier Interference\\\\src\\\\pizza\\\\cashier\\\\interference\\\\images\\\\milk.png',1.45,'Cold Drink','Milk'),(3,'Tea','Ah. Nice warm tea.','C:\\\\Users\\\\m_che\\\\Documents\\\\NetBeansProjects\\\\Pizza Cashier Interference\\\\src\\\\pizza\\\\cashier\\\\interference\\\\images\\\\tea.png',1.45,'Hot Drink','Blended black teas, Bergamot Oil'),(4,'Strawberry shake','Sweet, fruity, shake. Tastes as good as it looks.','C:\\\\Users\\\\m_che\\\\Documents\\\\NetBeansProjects\\\\Pizza Cashier Interference\\\\src\\\\pizza\\\\cashier\\\\interference\\\\images\\\\shake.png',3.59,'Shake','Strawberries, Sugar, Vanilla extract, Whole milk, Organic strawberry ice cream'),(5,'Strawberry ice cream','Strawberry ice cream with a touch of vanilla, with cut, real strawberries.','C:\\\\Users\\\\m_che\\\\Documents\\\\NetBeansProjects\\\\Pizza Cashier Interference\\\\src\\\\pizza\\\\cashier\\\\interference\\\\images\\\\icecream.png',3.3,'Ice Cream','Milk, Strawberries, Whipped cream, Sugar, Whey, Vegetable gum (tara)'),(6,'Chocolate chip cookie','A classic chocolate chip cookie from your childhood dreams, with the meltiest chocolate.','C:\\\\Users\\\\m_che\\\\Documents\\\\NetBeansProjects\\\\Pizza Cashier Interference\\\\src\\\\pizza\\\\cashier\\\\interference\\\\images\\\\cookie.png',1.79,'Cookie','Butter, Flour, Eggs, Vanilla Extract, Sugar, Brown sugar, Salt, Baking soda, Chocolate chips'),(7,'Caesar Salad','THE original, crunchy salad.','C:\\\\Users\\\\m_che\\\\Documents\\\\NetBeansProjects\\\\Pizza Cashier Interference\\\\src\\\\pizza\\\\cashier\\\\interference\\\\images\\\\salad.png',7.65,'Specialty Salad','Romaine lettuce, Parmesan cheese, Croutons, Garlic, Black pepper, Olive oil, Sea salt, Vinegar, Fresh lemon juice, Worcestershire sauce, Dijon mustard'),(8,'Sour Cream','Creamy, original sour cream. Makes any dish more refreshing and cool.','C:\\\\Users\\\\m_che\\\\Documents\\\\NetBeansProjects\\\\Pizza Cashier Interference\\\\src\\\\pizza\\\\cashier\\\\interference\\\\images\\\\sourcream.png',0.45,'Sauce','Heavy whipping cream, Whole milk, Lemon juice');
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-12 19:29:45
