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
-- Table structure for table `room_seat`
--

DROP TABLE IF EXISTS `room_seat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `room_seat` (
  `id_room_seat` int NOT NULL AUTO_INCREMENT,
  `seat_column` varchar(45) NOT NULL,
  `seat_row` varchar(45) NOT NULL,
  `seat_code` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `price` int DEFAULT NULL,
  PRIMARY KEY (`id_room_seat`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room_seat`
--

LOCK TABLES `room_seat` WRITE;
/*!40000 ALTER TABLE `room_seat` DISABLE KEYS */;
INSERT INTO `room_seat` VALUES (1,'1','A','A1','Normal',5),(2,'1','B','B2','Normal',5),(3,'1','C','C1','Normal',5),(4,'1','D','D1','Normal',5),(5,'1','E','E1','Normal',5),(6,'2','A','A2','Normal',5),(7,'2','B','B2','Normal',5),(8,'2','C','C2','Vip',10),(9,'2','D','D2','Vip',10),(10,'2','E','E2','Normal',5),(11,'3','A','A3','Normal',5),(12,'3','B','B3','Normal',5),(13,'3','C','C3','Vip',10),(14,'3','D','D3','Vip',10),(15,'3','E','E3','Normal',5),(16,'4','A','A4','Normal',5),(17,'4','B','B4','Normal',5),(18,'4','C','C4','Vip',10),(19,'4','D','D4','Vip',10),(20,'4','E','E4','Normal',5),(21,'5','A','A5','Normal',5),(22,'5','B','B5','Normal',5),(23,'5','C','C5','Normal',5),(24,'5','D','D5','Normal',5),(25,'5','E','E5','Normal',5);
/*!40000 ALTER TABLE `room_seat` ENABLE KEYS */;
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
