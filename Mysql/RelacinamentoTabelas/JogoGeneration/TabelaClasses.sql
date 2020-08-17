create database db_generation_game_online;

use db_generation_game_online;

-- Criando tabela
create table tb_classe(
id bigint(5) auto_increment,
nivel varchar(20),
linguagem varchar(30),
especialidade varchar(20),
primary key(id)
);

-- Todos os inserts
insert into tb_classe(nivel, linguagem, especialidade) values ("junior", "java", "back-end");
insert into tb_classe(nivel, linguagem, especialidade) values ("senior", "java", "back-end");
insert into tb_classe(nivel, linguagem, especialidade) values ("junior", "html", "front-end");
insert into tb_classe(nivel, linguagem, especialidade) values ("pleno", "python", "back-end");
insert into tb_classe(nivel, linguagem, especialidade) values ("pleno", "java", "full stack");
