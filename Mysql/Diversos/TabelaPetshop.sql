use db_diversos;

-- Criando tabela 2
create table tb_petshop(
id_animal bigint(5) auto_increment,
especie varchar(20),
raca varchar(50),
nome varchar(20),
porte varchar(20),
peso decimal(5,2),
idade int(3),
primary key(id_animal)
);

-- Todos inserts
INSERT INTO tb_petshop (especie, raca, nome, porte, peso, idade) VALUES ("Cão", "Poodle Standart", "Bibi", "Médio", 13.5,9);
INSERT INTO tb_petshop (especie, raca, nome, porte, peso, idade) VALUES ("Gato", "Persa", "Lion", "Pequeno", 5.2, 10);
INSERT INTO tb_petshop (especie, raca, nome, porte, peso, idade) VALUES ("Iguana", "Iguana Verde", "Rex", "Pequeno", 6.9, 7);
INSERT INTO tb_petshop (especie, raca, nome, porte, peso, idade) VALUES ("Coelho", "Mini Lop", "Floquinho", "Pequeno", 1.5, 2);
INSERT INTO tb_petshop (especie, raca, nome, porte, peso, idade) VALUES ("Cão", "Pug", "Mike", "Médio", 1.5, 6);
INSERT INTO tb_petshop (especie, raca, nome, porte, peso, idade) VALUES ("Cão", "Husky siberiano", "Lola", "Grande", 20.5, 10);
INSERT INTO tb_petshop (especie, raca, nome, porte, peso, idade) VALUES ("Gato", "Siamês", "Kity", "Pequeno", 4.1, 13);
INSERT INTO tb_petshop (especie, raca, nome, porte, peso, idade) VALUES ("Cão", "Goldem Retriever", "Andy", "Grande", 32.3, 10);
INSERT INTO tb_petshop (especie, raca, nome, porte, peso, idade) VALUES ("Cão", "Shih-Tzu", "Nina", "Pequeno", 6.5, 8);
INSERT INTO tb_petshop (especie, raca, nome, porte, peso, idade) VALUES ("Cão", "Bichon frisé", "Bibi", "Pequeno", 3.5, 6);
INSERT INTO tb_petshop (especie, raca, nome, porte, peso, idade) VALUES ("Cão", "Chow-Chow", "Marley", "Grande", 27.9, 10);
INSERT INTO tb_petshop (especie, raca, nome, porte, peso, idade) VALUES ("Cão", "Poodle Standart", "Elsa", "Médio", 10.5, 5);
INSERT INTO tb_petshop (especie, raca, nome, porte, peso, idade) VALUES ("Cão", "Chow-Choow", "Minie", "Médio", 20.5, 6);
INSERT INTO tb_petshop (especie, raca, nome, porte, peso, idade) VALUES ("Coelho", "Mini Lop", "Babi", "Pequeno", 1.9, 3);
INSERT INTO tb_petshop (especie, raca, nome, porte, peso, idade) VALUES ("Gato", "Persa", "Garfield", "Pequeno", 5.56, 12);

-- Todos os selects
select * from tb_petshop where peso > 10;

select * from tb_petshop where peso < 10;

select * from tb_petshop where peso between 10 and 30;