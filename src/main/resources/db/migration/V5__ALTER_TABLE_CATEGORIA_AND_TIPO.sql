-- + flyway

-- File: V5__ALTER_TABLE_CATEGORIA_AND_TIPO.sql

ALTER TABLE categoria ADD COLUMN descricao VARCHAR(50);

ALTER TABLE tipo ADD COLUMN descricao VARCHAR(50);