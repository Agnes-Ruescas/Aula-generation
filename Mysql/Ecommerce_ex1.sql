create database db_ecommerce;


use db_ecommerce;

-- Criar tabela
CREATE TABLE tb_produtos(
 id bigint(5) AUTO_INCREMENT,
nome varchar(100) NOT NULL,
categoria varchar(50) NOT NULL,
marca varchar(20) NOT NULL,
preco  decimal(10,2),
PRIMARY KEY (id) 
);

-- Todos os inserts
INSERT INTO tb_produtos (nome, categoria, marca, preco) VALUES (" Air Zoom Pegasus", "Calçados", "Nike", 529.99);
INSERT INTO tb_produtos (nome, categoria, marca, preco) VALUES ("Fritadeira Elétrica Turbofryer", "Eletrodomésticos", "Philips Walita", 1529.89);
INSERT INTO tb_produtos (nome, categoria, marca, preco) VALUES ("Galaxy S10", "Tecnologia", "Sansung", 2799.99);
INSERT INTO tb_produtos (nome, categoria, marca, preco) VALUES (" Base Liquida Timewise Matte", "Beleza", "Mary Kay", 59.99);
INSERT INTO tb_produtos (nome, categoria, marca, preco) VALUES ("Bola Futsal", "Esporte", "Topper", 55.99);
INSERT INTO tb_produtos (nome, categoria, marca, preco) VALUES (" Brinquedo Mordedo", "Pet", "Pampet", 10.99);


-- Todos os select
select * from tb_produtos WHERE preco>500.00;

select * from tb_produtos WHERE preco<500.00;

UPDATE tb_produtos SET preco = 499.99 WHERE id = 1;

