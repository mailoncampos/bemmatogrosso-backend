-- + flyway

-- File: V1__CREATE_TABLE_CATEGORIA_AND_TIPO.sql

CREATE TABLE
    categoria (
        id SERIAL PRIMARY KEY,
        nome VARCHAR(50) NOT NULL
    );

CREATE TABLE
    tipo (
        id SERIAL PRIMARY KEY,
        nome VARCHAR(50) NOT NULL
    );