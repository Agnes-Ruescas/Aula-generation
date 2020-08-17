use db_generation_game_online;

-- Criando tabela
create table tb_personagem(
id bigint(5) auto_increment,
nome varchar(20),
idade int(3),
cidade varchar(50),
ataque int(10),
defesa int(10),
id_cargo bigint NOT NULL, 
primary key(id),
foreign key(id_cargo) references tb_classe(id)
);

-- Todos os inserts 
insert into tb_personagem(nome, idade, cidade, ataque, defesa, id_cargo) values ("Camilla", 27, "São Paulo", 5000, 6000, 5);
insert into tb_personagem(nome, idade, cidade, ataque, defesa, id_cargo) values ("Marcelo", 30, "São Paulo", 8000, 9500, 2);
insert into tb_personagem(nome, idade, cidade, ataque, defesa, id_cargo) values ("Matheus", 22, "São Paulo", 3000, 2200, 1);
insert into tb_personagem(nome, idade, cidade, ataque, defesa, id_cargo) values ("Fernanda", 19, "Rio de Janeiro", 2500, 3000, 3);
insert into tb_personagem(nome, idade, cidade, ataque, defesa, id_cargo) values ("Jorge", 42, "Brasilia", 5200, 4680, 4);
insert into tb_personagem(nome, idade, cidade, ataque, defesa, id_cargo) values ("Victória", 33, "Dourados", 4900, 5100, 5);
insert into tb_personagem(nome, idade, cidade, ataque, defesa, id_cargo) values ("Diego", 38, "São Paulo", 3500, 3800, 1);
insert into tb_personagem(nome, idade, cidade, ataque, defesa, id_cargo) values ("Yasmim", 25, "São Paulo", 9000, 11000, 2);

-- Todos os selects
select * from tb_personagem where ataque>2000;

select * from tb_personagem where defesa between 1000 and 2000;

select * from tb_personagem where nome like "%c%";

select * from tb_personagem
	inner join tb_classe on tb_classe.id = tb_personagem.id_cargo;

select * from tb_personagem
	inner join tb_classe on tb_classe.id = tb_personagem.id_cargo
    where nivel = "junior";


