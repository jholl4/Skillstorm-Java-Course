-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema bookstore
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bookstore
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bookstore` DEFAULT CHARACTER SET utf8 ;
USE `bookstore` ;

-- -----------------------------------------------------
-- Table `bookstore`.`BookstoreLocation`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bookstore`.`BookstoreLocation` (
  `BusinessID` INT NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(45) NULL,
  `Address` VARCHAR(80) NULL,
  PRIMARY KEY (`BusinessID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bookstore`.`BookstoreLocation_has_Customer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bookstore`.`BookstoreLocation_has_Customer` (
  `BookstoreLocation_BusinessID` INT NOT NULL,
  `Customer_CustomerID` INT NOT NULL,
  PRIMARY KEY (`BookstoreLocation_BusinessID`, `Customer_CustomerID`),
  INDEX `fk_BookstoreLocation_has_Customer_Customer1_idx` (`Customer_CustomerID` ASC) VISIBLE,
  INDEX `fk_BookstoreLocation_has_Customer_BookstoreLocation_idx` (`BookstoreLocation_BusinessID` ASC) VISIBLE,
  CONSTRAINT `fk_BookstoreLocation_has_Customer_BookstoreLocation`
    FOREIGN KEY (`BookstoreLocation_BusinessID`)
    REFERENCES `bookstore`.`BookstoreLocation` (`BusinessID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_BookstoreLocation_has_Customer_Customer1`
    FOREIGN KEY (`Customer_CustomerID`)
    REFERENCES `bookstore`.`Customer` (`CustomerID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bookstore`.`Customer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bookstore`.`Customer` (
  `CustomerID` INT NOT NULL AUTO_INCREMENT,
  `First_Name` VARCHAR(45) NULL,
  `Last_name` VARCHAR(45) NULL,
  `Address` VARCHAR(45) NULL,
  `Home_Store` INT NULL,
  PRIMARY KEY (`CustomerID`),
  INDEX `Home_Store_idx` (`Home_Store` ASC) VISIBLE,
  CONSTRAINT `Home_Store`
    FOREIGN KEY (`Home_Store`)
    REFERENCES `bookstore`.`BookstoreLocation_has_Customer` (`BookstoreLocation_BusinessID`)
    ON DELETE SET NULL
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bookstore`.`Book`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bookstore`.`Book` (
  `BookID` INT NOT NULL AUTO_INCREMENT,
  `Title` VARCHAR(45) NULL,
  `Author` VARCHAR(45) NULL,
  `Genre` VARCHAR(45) NULL,
  `Price` DECIMAL NULL,
  `ISBN` VARCHAR(45) NULL,
  `BookstoreLocation_BusinessID` INT NOT NULL,
  PRIMARY KEY (`BookID`, `BookstoreLocation_BusinessID`),
  INDEX `fk_Book_BookstoreLocation1_idx` (`BookstoreLocation_BusinessID` ASC) VISIBLE,
  CONSTRAINT `fk_Book_BookstoreLocation1`
    FOREIGN KEY (`BookstoreLocation_BusinessID`)
    REFERENCES `bookstore`.`BookstoreLocation` (`BusinessID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
