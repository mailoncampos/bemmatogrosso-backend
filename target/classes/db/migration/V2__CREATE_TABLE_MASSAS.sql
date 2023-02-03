-- + flyway
-- File: V1__CREATE_TABLE_MASSAS.sql

CREATE TABLE massas (
id SERIAL PRIMARY KEY,
nome VARCHAR(255) NOT NULL,
time_preparo INTERVAL NOT NULL,
preco DECIMAL(10,2) NOT NULL
);

CREATE TABLE massas_molhos (
massa_id INT NOT NULL,
molho_id INT NOT NULL,
PRIMARY KEY (massa_id, molho_id),
FOREIGN KEY (massa_id) REFERENCES massas(id),
FOREIGN KEY (molho_id) REFERENCES molhos(id)
);

CREATE TABLE massas_temperos (
massa_id INT NOT NULL,
tempero_id INT NOT NULL,
PRIMARY KEY (massa_id, tempero_id),
FOREIGN KEY (massa_id) REFERENCES massas(id),
FOREIGN KEY (tempero_id) REFERENCES temperos(id)
);

CREATE TABLE massas_adicional_massas (
massa_id INT NOT NULL,
adicional_massas_id INT NOT NULL,
PRIMARY KEY (massa_id, adicional_massas_id),
FOREIGN KEY (massa_id) REFERENCES massas(id),
FOREIGN KEY (adicional_massas_id) REFERENCES adicional_massas(id)
);

CREATE TABLE massas_tipo_massa (
massa_id INT NOT NULL,
tipo_massa_id INT NOT NULL,
PRIMARY KEY (massa_id, tipo_massa_id),
FOREIGN KEY (massa_id) REFERENCES massas(id),
FOREIGN KEY (tipo_massa_id) REFERENCES tipo_massa(id)
);
