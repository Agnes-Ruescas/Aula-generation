use db_diversos;

-- Criando tabela
create table tb_varejo(
id_produto bigint(5) auto_increment,
nome varchar(20),
preco decimal(10,2),
categoria varchar(20),
marca varchar(20),
cor varchar(20),
desconto varchar(3),
primary key(id_produto)
)

-- Todos os inserts
INSERT INTO tb_varejo(nome, preco, categoria, marca, cor, desconto) VALUES ("Air Zoom Pegasus", 529.99, "Calçados", "Nike", "Branco", "10%");
INSERT INTO tb_varejo(nome, preco, categoria, marca, cor, desconto) VALUES ("Fritadeira Elétrica Turbofryer", 1529.89, "Eletrodomésticos", "Philips Walita", "Preta", "5%");
INSERT INTO tb_varejo(nome, preco, categoria, marca, cor, desconto) VALUES ("Galaxy S10", 2799.99, "Tecnologia", "Sansung", "Azul", "0%");
INSERT INTO tb_varejo(nome, preco, categoria, marca, cor, desconto) VALUES ("Bola Futsal", 55.99, "Esporte", "Topper", "Preta/Branca", "0%");
INSERT INTO tb_varejo(nome, preco, categoria, marca, cor, desconto) VALUES ("Brinquedo Mordedo", 10.99, "Pet", "Pampet", "Rosa", "0%");
INSERT INTO tb_varejo(nome, preco, categoria, marca, cor, desconto) VALUES ("Edredom Casal", 175.99, "Casa", "Bia", "Verde", "0%");
INSERT INTO tb_varejo(nome, preco, categoria, marca, cor, desconto) VALUES ("Redmi Note 9", 1499.99, "Tecnologia", "Xiaomi", "Preto", "0%");
INSERT INTO tb_varejo(nome, preco, categoria, marca, cor, desconto) VALUES ("Frost Free Inverse", 4529.89, "Eletrodomésticos", "Brastemp", "Inox", "7%");
INSERT INTO tb_varejo(nome, preco, categoria, marca, cor, desconto) VALUES ("Moto G8", 1399.99, "Tecnologia", "Motorola", "Preto", "0%");
INSERT INTO tb_varejo(nome, preco, categoria, marca, cor, desconto) VALUES ("Cortina Blackout", 59.99, "Casa", "Moreira", "Azul", "0%");
INSERT INTO tb_varejo(nome, preco, categoria, marca, cor, desconto) VALUES ("One Fusion", 1999.99, "Tecnologia", "Motorola", "Preto", "0%");
INSERT INTO tb_varejo(nome, preco, categoria, marca, cor, desconto) VALUES ("Fritadeira Elétrica", 1529.89, "Eletrodomésticos", "Philips Walita", "Preta", "5%");
INSERT INTO tb_varejo(nome, preco, categoria, marca, cor, desconto) VALUES ("Base Liquida", 59.99, "Beleza", "Mary Kay", "Beige 2", "12%");
INSERT INTO tb_varejo(nome, preco, categoria, marca, cor, desconto) VALUES ("Forno Elétrico", 2799.99, "Eletrodomésticos", "Brastemp", "Preto", "0%");
INSERT INTO tb_varejo(nome, preco, categoria, marca, cor, desconto) VALUES ("Paleta De Maquiagem", 299.99, "Beleza", "Make B", "Preto", "0%");
INSERT INTO tb_varejo(nome, preco, categoria, marca, cor, desconto) VALUES ("Iphone 11", 4529.89, "Tecnologia", "Apple", "Preta", "5%");

-- Todos os selects
select * from tb_varejo WHERE nome like 'A%';

select * from tb_varejo WHERE categoria = "Eletrodomésticos";

select * from tb_varejo WHERE categoria = "Tecnologia" AND preco>=100 and preco<=1500;

select * from tb_varejo WHERE categoria like "Beleza";



