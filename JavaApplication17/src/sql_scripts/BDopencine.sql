DROP SCHEMA if exists Opencine ;
CREATE DATABASE Opencine;
USE Opencine;
CREATE TABLE filmes (
    nome_filme VARCHAR(100) NOT NULL,
    des_filme VARCHAR(350) NOT NULL,
    gen_filme VARCHAR(50) NOT NULL,
    ano_filme INT NOT NULL,
    id_filme INT PRIMARY KEY AUTO_INCREMENT 
);

CREATE TABLE sala (
    cod_sala INT PRIMARY KEY,
    nome_sala VARCHAR(100)
);

CREATE TABLE sessao (
    id_filme INT NOT NULL,
    cod_sala INT NOT NULL,
    hora_sessao INT NOT NULL,
    minuto_sessao INT NOT NULL,
    preco_sessao DECIMAL(6,2) NOT NULL,
    id_sessao INT PRIMARY KEY AUTO_INCREMENT, 
    FOREIGN KEY(id_filme) REFERENCES filmes(id_filme),
    FOREIGN KEY(cod_sala) REFERENCES sala(cod_sala) 
);

CREATE TABLE cliente (
    nome_cliente VARCHAR(50) NOT NULL,
    idade_cliente INT NOT NULL,
    sexo_cliente VARCHAR(10) NOT NULL,
    endereco_cliente VARCHAR(300) NOT NULL,
    cpf_cliente VARCHAR(11) NOT NULL,
    id_cliente INT PRIMARY KEY AUTO_INCREMENT
);

CREATE TABLE gerente (
    login_ger VARCHAR(100) PRIMARY KEY,
    senha_ger VARCHAR(100) NOT NULL
);

CREATE TABLE vendedor (
    login_vend VARCHAR(100) PRIMARY KEY,
    senha_vend VARCHAR(100) NOT NULL,
    cpf_vend VARCHAR(12) NOT NULL,
    turno_vend VARCHAR(12) NOT NULL,
    email_vend VARCHAR(100) NOT NULL
);

--SELECT * from cliente;
--SELECT * from vendedor;
--SELECT * from gerente;
--SELECT * from sala;
--SELECT * from filmes;