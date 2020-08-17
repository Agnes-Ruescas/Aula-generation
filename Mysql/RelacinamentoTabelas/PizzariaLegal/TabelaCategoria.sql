create database db_pizzaria_legal;

use db_pizzaria_legal;

-- Criando tabelas
create table tb_categoria(
id bigint(5) auto_increment,
Tamanho varchar(20),
Tipo varchar(20),
Borda varchar(50),
primary key(id)
);

-- Todos os inserts
insert into tb_categoria (Tamanho, Tipo, Borda) values("Grande", "Salgada", "Normal");
insert into tb_categoria (Tamanho, Tipo, Borda) values("Grande", "Doce", "Normal");
insert into tb_categoria (Tamanho, Tipo, Borda) values("Grande", "Salgada", "Recheado com catupiry");
insert into tb_categoria (Tamanho, Tipo, Borda) values("Broto", "Salgada", "Normal");
insert into tb_categoria (Tamanho, Tipo, Borda) values("Broto", "Doce", "Normal");
