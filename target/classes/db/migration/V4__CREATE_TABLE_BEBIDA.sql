-- + flyway

-- File: V1__CREATE_TABLE_BEBIDA.sql

CREATE TABLE
    bebida (
        id SERIAL PRIMARY KEY,
        nome VARCHAR(255) NOT NULL,
        categoria_id INTEGER REFERENCES categoria(id),
        preco NUMERIC NOT NULL,
        tipo_id INTEGER REFERENCES tipo(id)
    );