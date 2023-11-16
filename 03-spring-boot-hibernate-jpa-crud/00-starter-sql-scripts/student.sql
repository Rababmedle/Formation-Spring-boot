-- Création de la base de données
CREATE DATABASE IF NOT EXISTS student_tracker;
USE student_tracker;

-- Création de la table "student"
CREATE TABLE IF NOT EXISTS student (
    id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL
);
