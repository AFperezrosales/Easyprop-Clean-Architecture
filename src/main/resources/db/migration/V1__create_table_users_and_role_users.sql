-- v1_create_table_users.sql

CREATE TYPE role_users AS ENUM('ADMIN','USER', 'OWNER');

CREATE TABLE user_tb (
    id VARCHAR(255) PRIMARY KEY,
    email VARCHAR(150) UNIQUE NOT NULL ,
    password VARCHAR(150),
    birthdate TIMESTAMP,
    name VARCHAR(150),
    lastName VARCHAR(150),
    phoneNumber VARCHAR(150),
    role role_users
);

