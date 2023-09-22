-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: project2
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
-- Table structure for table `bill`
--

DROP TABLE IF EXISTS `bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bill` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_movie` int NOT NULL,
  `id_room_seat` int NOT NULL,
  `price` int NOT NULL,
  `day_started` date NOT NULL,
  `time_started` time NOT NULL,
  `time_bill` datetime NOT NULL,
  `id_users` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_movie_idx` (`id_movie`),
  KEY `id_users_idx` (`id_users`),
  KEY `id_room_seat_idx` (`id_room_seat`),
  CONSTRAINT `id_movie` FOREIGN KEY (`id_movie`) REFERENCES `movie` (`id_movie`),
  CONSTRAINT `id_room_seat` FOREIGN KEY (`id_room_seat`) REFERENCES `room_seat` (`id_room_seat`),
  CONSTRAINT `id_users` FOREIGN KEY (`id_users`) REFERENCES `users` (`id_users`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill`
--

LOCK TABLES `bill` WRITE;
/*!40000 ALTER TABLE `bill` DISABLE KEYS */;
INSERT INTO `bill` VALUES (1,2,2,5,'2023-09-09','19:00:00','2023-09-08 17:45:03',1),(2,1,2,5,'2023-09-09','22:00:00','2023-09-08 17:46:28',1),(3,1,2,5,'2023-09-09','19:00:00','2023-09-08 17:46:37',1),(4,1,8,10,'2023-09-09','22:00:00','2023-09-08 17:47:53',1),(5,1,8,10,'2023-09-08','22:00:00','2023-09-08 17:48:04',1),(6,2,3,5,'2023-09-15','21:00:00','2023-09-15 15:08:06',1),(7,2,19,10,'2023-09-16','22:00:00','2023-09-15 15:21:14',1),(8,9,9,10,'2023-09-18','21:00:00','2023-09-16 14:24:08',1),(9,9,8,10,'2023-09-18','21:00:00','2023-09-16 14:24:16',1),(10,6,8,10,'2023-09-18','21:00:00','2023-09-16 14:24:20',1),(11,5,4,5,'2023-09-30','19:00:00','2023-09-17 23:18:56',1);
/*!40000 ALTER TABLE `bill` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-18 21:01:35
