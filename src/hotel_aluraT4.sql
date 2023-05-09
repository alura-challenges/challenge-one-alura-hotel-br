CREATE DATABASE  IF NOT EXISTS `hotel_alura` CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `hotel_alura`;


CREATE TABLE `reservas` (
  `id_reserva` varchar(36) NOT NULL,
  `data_entrada` date NOT NULL,
  `data_saida` date NOT NULL,
  `valor` decimal(9,2) NOT NULL,
  `forma_pago` varchar(20) NOT NULL,
  PRIMARY KEY (`id_reserva`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

CREATE TABLE `hospede` (
  `id_hospede` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(25) NOT NULL,
  `sobrenome` varchar(25) NOT NULL,
  `data_nascimiento` date NOT NULL,
  `nacionalidade` varchar(35) NOT NULL,
  `telefone` varchar(30) NOT NULL,
  `id_reserva` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`id_hospede`),
   KEY `id_reserva` (`id_reserva`),
  CONSTRAINT `hospedes_ibfk_1` FOREIGN KEY (`id_reserva`) REFERENCES `reservas` (`id_reserva`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

CREATE TABLE `usuarios` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `nome_usuario` varchar(25) NOT NULL,
  `categoria_usuario` varchar(25) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

INSERT INTO `usuarios` VALUES (1,'Paulo_J','Gerente','1234'),(2,'Eduarda','Recepcionista','123');