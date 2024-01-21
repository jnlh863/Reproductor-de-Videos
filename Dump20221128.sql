-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: mydb
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `idusuarios` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  `apellidos` varchar(30) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `contraseña` varchar(30) NOT NULL,
  PRIMARY KEY (`idusuarios`),
  UNIQUE KEY `correo_UNIQUE` (`correo`),
  UNIQUE KEY `contraseña_UNIQUE` (`contraseña`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (12,'Tomas','Garza','trobledo01@hotmail.com','1234'),(13,'Prueba','prueba','prueba@gmail.com','A@12345678');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `videos`
--

DROP TABLE IF EXISTS `videos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `videos` (
  `idvideos` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(150) NOT NULL,
  `artista` varchar(30) NOT NULL,
  `ubivideo` varchar(250) NOT NULL,
  `ubimagen` varchar(45) NOT NULL,
  PRIMARY KEY (`idvideos`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `videos`
--

LOCK TABLES `videos` WRITE;
/*!40000 ALTER TABLE `videos` DISABLE KEYS */;
INSERT INTO `videos` VALUES (1,'Celestial','Ed Sheran','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos\\\\Download\\\\Celestial.mp4','/celestial.jpg'),(2,'That\'s What I Like','Bruno Mars','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos\\\\Download\\\\That\'s What I Like.mp4','/TWL.jpg'),(3,'El Triste','José José','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos\\\\Download\\\\El Triste.mp4','/triste.jpg'),(4,'Viva la Vida','Coldplay','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos\\\\Download\\\\Viva La Vida.mp4','/viva.jpg'),(5,'Counting Stars','One Republic','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos\\\\Download\\\\Counting Stars.mp4','/stars.jpg'),(6,'El poder nuestro es','Ricardo Silva','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos\\\\Download\\\\El poder nuestro es.mp4','/OPDBZ.jpg'),(7,'Daten','Creepy Nuts','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos\\\\Download\\\\Creepy Nuts.mp4','/nuts.jpg'),(8,'Sunroof','Nicky Youre, Dazy','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos\\\\Download\\\\sun.mp4','/sun.jpg'),(9,'Stuck on you','Nowlu','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos\\\\Download\\\\Stuck.mp4','/stuck.jpg'),(10,'Duro 2 horas, acto acto pide contacto','Faraón Love Shady','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos\\\\Download\\\\2 horas.mp4','/2h.jpg'),(11,'White & Nerdy','«Weird Al» Yankovic','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos\\\\Download\\\\WN.mp4','/WN.jpg'),(12,'Amish Paradise','«Weird Al» Yankovic','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos\\\\Download\\\\AP.mp4','/AP.jpg'),(13,'Smells Like Nirvana','«Weird Al» Yankovic','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos\\\\Download\\\\SLN.mp4','/SLN.jpg'),(14,'Sunflower','Post Malone, Swae Lee','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Sunflower.mp4','/sf.jpg'),(15,'The Power Of Love','Huey Lewis & The News','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\The Power Of Love.mp4','/POL.jpg'),(16,'Johnny B. Goode','Marty McFly','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Johnny B. Goode.mp4','/JBG.jpg'),(17,'Shot In The Dark','AC/DC','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Shot In The Dark.mp4','/SITD.jpg'),(18,'Crazy','Aerosmith','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Crazy.mp4','/crazy.jpg'),(19,'Cupid','Amy Winehouse','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Cupid.mp4','/cupid.jpg'),(20,'Be Yourself','Audioslave','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Be Yourself.mp4','/BY.jpg'),(21,'What\'s Up Danger','Blackway & Black Caviar','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\What\'s Up Danger.mp4','/WUD.jpg'),(22,'Hello, Goodbye','The Beatles','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\hello.mp4','/HG.jpg'),(23,'The Beautiful People','Marilyn Manson','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\The Beautiful People.mp4','/TBP.jpg'),(24,'Call me','Blondie','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Call me.mp4','/CM.jpg'),(25,'People Are Strange','The Doors','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\People Are Strange.mp4','/PAS.jpg'),(26,'Feel Good Inc.','Gorillaz','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Feel Good Inc.mp4','/FGI.jpg'),(27,'La Vida Va','Green Valley','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\La Vida Va.mp4\"','/LVV.jpg'),(28,'Yesterdays','Guns N\' Roses','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Yesterdays.mp4','/Yesterdays.jpg'),(29,'Que soy yo para ti','Hombres G','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Que soy yo para ti.mp4','/QSYPT.jpg'),(30,'On Top Of The World','Imagine Dragons','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\On Top Of The World.mp4','/OTOTW.jpg'),(31,'Ho Hey','The Lumineers','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Ho Hey.mp4','/Ho Hey.jpg'),(32,'Crybaby','Lil Peep','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Crybaby.mp4','/crybaby.jpg'),(33,'Angels Like You','Miley Cyrus','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Angels Like You.mp4','/ALY.jpg'),(34,'Rape Me','Nirvana','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Rape Me.mp4','/RM.jpg'),(35,'Dreamer','Ozzy Osbourne','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Dreamer.mp4','/dreamer.jpg'),(36,'Hey You','Pink Floyd','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Hey You.mp4','/Hey You.jpg'),(37,'Gone, Gone, Gone','Phillip Phillips','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Gone, Gone, Gone.mp4','/GGG.jpg'),(38,'People Get up Drive Your Funky Soul','James Brown','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\People Get up Drive Your Funky Soul.mp4','/PGUD.jpg'),(39,'Raindrops Keep Falling on my Head','B.J. Thomas','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Raindrops Keep Falling on my Head.mp4','/RKFH.jpg'),(40,'Killer Queen','Queen','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Killer Queen.mp4','/KQ.jpg'),(41,'Venezia','Hombres G','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Venezia.mp4','/V.jpg'),(42,'Dull Knives','Imagine Dragons','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Dull Knives.mp4','/DK.jpg'),(43,'Sharks','Imagine Dragons','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Sharks.mp4','/sharks.jpg'),(44,'Birds','Imagine Dragons','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Birds.mp4','/birds.jpg'),(46,'Baldur','Destripando la Historia','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Baldur.mp4','/baldur.jpg'),(47,'Hestia','Destripando la Historia','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Hestia.mp4','/hestia.jpg'),(48,'El Origen de GOKU','Destripando la Historia','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\El Origen de GOKU.mp4','/EOG.jpg'),(49,'Zeus','Destripando la Historia','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\ZEUS.mp4','/zeus.jpg'),(50,'Run','Joji','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Run.mp4','/run.jpg'),(51,'Die For You','Joji','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Die For You.mp4','/DFY.jpg'),(52,'Sanctuary','Joji','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Sanctuary.mp4','/sanct.jpg'),(54,'SLOW DANCING IN THE DARK','Joji','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\SLOW DANCING IN THE DARK.mp4','/slow.jpg'),(55,'YEAH RIGHT','Joji','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\YEAH RIGHT.mp4','/yeah.jpg'),(56,'Layla','Eric Clapton','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Layla.mp4','/layla.jpg'),(57,'No Se Va','Grupo Frontera','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\No Se Va.mp4','/nose.jpg'),(58,'It\'s Not Like I Like You!!','Emirichu, Static-P & Amree','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\It\'s Not Like I Like You!!.mp4','/tsundere.jpg'),(59,'I\'m Yours','Jason Mraz','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\I\'m Yours.mp4','/imy.jpg'),(60,'Let Her Go','Passenger','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Let Her Go.mp4','/LHG.jpg'),(61,'I Really Want to Stay At Your House','Rosa Walton ','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\I Really Want to Stay At Your House.mp4','/IRWSAYH.jpg'),(96,'Bang Bang','K\'NAAN,Adam Levine','D:\\\\OneDrive - Universidad Autonoma de Nuevo León\\\\libros facu\\\\tercer semestre\\\\POO\\\\Equipo03_PIA_POO\\\\videos2\\\\Download\\\\Bang Bang.mp4','/bang.jpg');
/*!40000 ALTER TABLE `videos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-28 14:41:50
