-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema pruebatecnica
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema pruebatecnica
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `pruebatecnica` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `pruebatecnica` ;

-- -----------------------------------------------------
-- Table `pruebatecnica`.`proveedores`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pruebatecnica`.`proveedores` (
  `id_proveedor` BIGINT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(255) NOT NULL,
  `fecha_de_alta` DATE NOT NULL,
  `id_cliente` BIGINT NULL DEFAULT NULL,
  PRIMARY KEY (`id_proveedor`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

INSERT INTO `pruebatecnica`.`proveedores` (`nombre`,`fecha_de_alta`,`id_cliente`) VALUES ('Coca-cola','2020-01-01',5);
INSERT INTO `pruebatecnica`.`proveedores` (`nombre`,`fecha_de_alta`,`id_cliente`) VALUES ('Pepsi','2020-02-01',5);
INSERT INTO `pruebatecnica`.`proveedores` (`nombre`,`fecha_de_alta`,`id_cliente`) VALUES ('Redbull','2020-03-01',6);


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
