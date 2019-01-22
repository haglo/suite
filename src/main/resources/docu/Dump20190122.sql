CREATE DATABASE  IF NOT EXISTS `pilger` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `pilger`;
-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: pilger
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `elytron_role`
--

DROP TABLE IF EXISTS `elytron_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `elytron_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `comment` varchar(255) DEFAULT NULL,
  `puuid` binary(255) DEFAULT NULL,
  `optlock` int(11) NOT NULL DEFAULT '0',
  `rolename` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_nsqfai1rutgl254atta6rbfol` (`rolename`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `elytron_role`
--

LOCK TABLES `elytron_role` WRITE;
/*!40000 ALTER TABLE `elytron_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `elytron_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `elytron_user`
--

DROP TABLE IF EXISTS `elytron_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `elytron_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `comment` varchar(255) DEFAULT NULL,
  `puuid` binary(255) DEFAULT NULL,
  `optlock` int(11) NOT NULL DEFAULT '0',
  `default_language` varchar(255) DEFAULT NULL,
  `default_theme` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_jff4ympod7iujr59f30qocfas` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `elytron_user`
--

LOCK TABLES `elytron_user` WRITE;
/*!40000 ALTER TABLE `elytron_user` DISABLE KEYS */;
INSERT INTO `elytron_user` VALUES (1,NULL,_binary 's.⁄å:¢N/≠DiP5`\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0',1,'german','Dark','123atgfd','N-U-T'),(2,NULL,_binary 'ﬁõO±öÇC2≥∏\ÿô\‡D\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0',1,'german','Dark','123atgfd','Admin1'),(3,NULL,_binary 'A\\ø=}GD≥#\√¿_\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0',1,'german','Dark','123atgfd','Admin2'),(4,NULL,_binary 'öÒE]@\\êcm5toq\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0',1,'german','Dark','123atgfd','haglo');
/*!40000 ALTER TABLE `elytron_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `euser_erole`
--

DROP TABLE IF EXISTS `euser_erole`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `euser_erole` (
  `euser_id` bigint(20) NOT NULL,
  `erole_id` bigint(20) NOT NULL,
  KEY `FKm8c8s0nvsjlo8k3u3n70xfvx8` (`erole_id`),
  KEY `FKtpw9d2sbufcr9d945hwb1sd4p` (`euser_id`),
  CONSTRAINT `FKm8c8s0nvsjlo8k3u3n70xfvx8` FOREIGN KEY (`erole_id`) REFERENCES `elytron_role` (`id`),
  CONSTRAINT `FKtpw9d2sbufcr9d945hwb1sd4p` FOREIGN KEY (`euser_id`) REFERENCES `elytron_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `euser_erole`
--

LOCK TABLES `euser_erole` WRITE;
/*!40000 ALTER TABLE `euser_erole` DISABLE KEYS */;
/*!40000 ALTER TABLE `euser_erole` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (7),(7);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pmail`
--

DROP TABLE IF EXISTS `pmail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `pmail` (
  `id` int(11) NOT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `uuid` varchar(255) DEFAULT NULL,
  `optlock` int(11) NOT NULL DEFAULT '0',
  `pattachment_file_full_name` longtext,
  `pattachment_file_name` longtext,
  `pattachment_file_path` varchar(255) DEFAULT NULL,
  `pattachment_number` int(11) DEFAULT NULL,
  `pcontent` longtext,
  `pflags` varchar(255) DEFAULT NULL,
  `pfrom` varchar(255) DEFAULT NULL,
  `pimapid` bigint(20) DEFAULT NULL,
  `plabels` varchar(255) DEFAULT NULL,
  `pmessage` longtext,
  `pmessageid` varchar(255) DEFAULT NULL,
  `preceive_date` varchar(255) DEFAULT NULL,
  `precipientbcc` longtext,
  `precipientcc` longtext,
  `precipientto` longtext,
  `preply_toid` varchar(255) DEFAULT NULL,
  `psend_date` varchar(255) DEFAULT NULL,
  `psubject` varchar(255) DEFAULT NULL,
  `folder_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKgwh6uxmhkufjbwv92tgumb3l2` (`folder_id`),
  CONSTRAINT `FKgwh6uxmhkufjbwv92tgumb3l2` FOREIGN KEY (`folder_id`) REFERENCES `pmail_folder` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pmail`
--

LOCK TABLES `pmail` WRITE;
/*!40000 ALTER TABLE `pmail` DISABLE KEYS */;
/*!40000 ALTER TABLE `pmail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pmail_folder`
--

DROP TABLE IF EXISTS `pmail_folder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `pmail_folder` (
  `id` int(11) NOT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `uuid` varchar(255) DEFAULT NULL,
  `optlock` int(11) NOT NULL DEFAULT '0',
  `pfolder_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_rhfqil97et3pf8mocpwcc2ud5` (`pfolder_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pmail_folder`
--

LOCK TABLES `pmail_folder` WRITE;
/*!40000 ALTER TABLE `pmail_folder` DISABLE KEYS */;
INSERT INTO `pmail_folder` VALUES (1,NULL,'a032d2d0-b1f0-455d-ade9-025255ddb8c9',0,'Inbox'),(2,NULL,'c45db4f2-0af9-4575-b034-950ddd4adaee',0,'Sent'),(3,NULL,'64be291f-e52a-464c-aae0-358fe39df995',0,'Draft'),(4,NULL,'78ea6bb5-701f-447e-8eac-d2e216616be3',0,'Template'),(5,NULL,'c88094d7-dce5-4416-be8d-55429b04f9b0',0,'Trash'),(6,NULL,'56e054b7-58a1-4af4-9c37-0dd05b0c72a8',0,'Archive');
/*!40000 ALTER TABLE `pmail_folder` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-01-22 11:33:39
