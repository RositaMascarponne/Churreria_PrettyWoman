-- MySQL dump 10.13  Distrib 8.0.36, for Linux (x86_64)
--
-- Host: localhost    Database: churreria_pretty_woman
-- ------------------------------------------------------
-- Server version	8.4.2

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
-- Table structure for table `bebidas`
--

DROP TABLE IF EXISTS `bebidas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bebidas` (
  `bebidaID` int NOT NULL AUTO_INCREMENT,
  `bebidaNombre` varchar(45) NOT NULL,
  PRIMARY KEY (`bebidaID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bebidas`
--

LOCK TABLES `bebidas` WRITE;
/*!40000 ALTER TABLE `bebidas` DISABLE KEYS */;
/*!40000 ALTER TABLE `bebidas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `churros`
--

DROP TABLE IF EXISTS `churros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `churros` (
  `churroID` int NOT NULL AUTO_INCREMENT,
  `churroNombre` varchar(90) NOT NULL,
  `churroPrecio` decimal(2,0) NOT NULL,
  `tipoID` int NOT NULL,
  `saborID` int NOT NULL,
  PRIMARY KEY (`churroID`),
  KEY `FK_tipo_id_idx` (`tipoID`),
  KEY `FK_sabor_id_idx` (`saborID`),
  CONSTRAINT `FK_sabor_id` FOREIGN KEY (`saborID`) REFERENCES `sabores` (`saborID`),
  CONSTRAINT `FK_tipo_id` FOREIGN KEY (`tipoID`) REFERENCES `tipos` (`tipoID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `churros`
--

LOCK TABLES `churros` WRITE;
/*!40000 ALTER TABLE `churros` DISABLE KEYS */;
/*!40000 ALTER TABLE `churros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estados`
--

DROP TABLE IF EXISTS `estados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estados` (
  `estadoID` int NOT NULL AUTO_INCREMENT,
  `estadoNombre` varchar(45) NOT NULL,
  PRIMARY KEY (`estadoID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estados`
--

LOCK TABLES `estados` WRITE;
/*!40000 ALTER TABLE `estados` DISABLE KEYS */;
/*!40000 ALTER TABLE `estados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidos`
--

DROP TABLE IF EXISTS `pedidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedidos` (
  `pedidoID` int NOT NULL AUTO_INCREMENT,
  `churroID` int NOT NULL,
  `bebidaID` int NOT NULL,
  `estado_ID` int DEFAULT NULL,
  PRIMARY KEY (`pedidoID`),
  KEY `FK_estado_id_idx` (`estado_ID`),
  CONSTRAINT `FK_estado_id` FOREIGN KEY (`estado_ID`) REFERENCES `estados` (`estadoID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidos`
--

LOCK TABLES `pedidos` WRITE;
/*!40000 ALTER TABLE `pedidos` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidos_bebidas`
--

DROP TABLE IF EXISTS `pedidos_bebidas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedidos_bebidas` (
  `pedido_id` int NOT NULL,
  `bebida_id` int NOT NULL,
  PRIMARY KEY (`pedido_id`,`bebida_id`),
  KEY `FK_PB_BEBIDAS_idx` (`bebida_id`),
  CONSTRAINT `FK_PB_BEBIDAS` FOREIGN KEY (`bebida_id`) REFERENCES `bebidas` (`bebidaID`),
  CONSTRAINT `FK_PB_PEDIDOS` FOREIGN KEY (`pedido_id`) REFERENCES `pedidos` (`pedidoID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidos_bebidas`
--

LOCK TABLES `pedidos_bebidas` WRITE;
/*!40000 ALTER TABLE `pedidos_bebidas` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedidos_bebidas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidos_churros`
--

DROP TABLE IF EXISTS `pedidos_churros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedidos_churros` (
  `pedido_id` int NOT NULL,
  `churro_id` int NOT NULL,
  PRIMARY KEY (`churro_id`,`pedido_id`),
  KEY `FK_PC_PEDIDOS_idx` (`pedido_id`),
  CONSTRAINT `FK_PC_CHURROS` FOREIGN KEY (`churro_id`) REFERENCES `churros` (`churroID`),
  CONSTRAINT `FK_PC_PEDIDOS` FOREIGN KEY (`pedido_id`) REFERENCES `pedidos` (`pedidoID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidos_churros`
--

LOCK TABLES `pedidos_churros` WRITE;
/*!40000 ALTER TABLE `pedidos_churros` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedidos_churros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sabores`
--

DROP TABLE IF EXISTS `sabores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sabores` (
  `saborID` int NOT NULL AUTO_INCREMENT,
  `saborNombre` varchar(45) NOT NULL,
  PRIMARY KEY (`saborID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sabores`
--

LOCK TABLES `sabores` WRITE;
/*!40000 ALTER TABLE `sabores` DISABLE KEYS */;
/*!40000 ALTER TABLE `sabores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipos`
--

DROP TABLE IF EXISTS `tipos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipos` (
  `tipoID` int NOT NULL AUTO_INCREMENT,
  `tipoNombre` varchar(45) NOT NULL,
  PRIMARY KEY (`tipoID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipos`
--

LOCK TABLES `tipos` WRITE;
/*!40000 ALTER TABLE `tipos` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'churreria_pretty_woman'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-10-03 17:13:51
