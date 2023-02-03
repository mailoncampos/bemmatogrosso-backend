-- + flyway
-- File: V1__CREATE_TABLE_MOLHOS.sql

CREATE TABLE molhos (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL
);

CREATE TABLE temperos (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL
);

CREATE TABLE adicional_massas (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL
);

CREATE TABLE tipo_massa (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL
);
