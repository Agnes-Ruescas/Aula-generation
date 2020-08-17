create database db_diversos;

use db_diversos;

-- Criando tabela
CREATE TABLE tb_escola(
id_alunos bigint(5) auto_increment,
nome varchar(50),
idade int(2),
turma varchar(20),
periodo varchar(20),
responsavel varchar(50),
 contato varchar(13),
primary key (id_alunos)
);

-- Todos os inserts
insert into tb_escola (nome, idade, turma, periodo, responsavel, contato) values ("Matheus Macedo", 10, "4° ano A", "Matutino", "Marcia Macedo", "(11)987229921"); 
insert into tb_escola (nome, idade, turma, periodo, responsavel, contato) values ("Yasmim Ruescas", 14, "8° ano B", "Vespertino", "Charlene Morais", "(11)988998877");
insert into tb_escola (nome, idade, turma, periodo, responsavel, contato) values ("Mario Silva", 8, "2° ano A", "Matutino", "Diogo Silva", "(11)985559333");
insert into tb_escola (nome, idade, turma, periodo, responsavel, contato) values ("Isabelly Pereira", 9, "3° ano C", "Vespertino", "Denise Pereira", "(11)933334444");
insert into tb_escola (nome, idade, turma, periodo, responsavel, contato) values ("Victor Morteira", 7, "1° ano A", "Integral", "Maria Moreira", "(11)984445555");
insert into tb_escola (nome, idade, turma, periodo, responsavel, contato) values ("Maria Eduarda Santos", 10, "4° ano C", "Matutino", "Marcia Santos", "(11)985556666");
insert into tb_escola (nome, idade, turma, periodo, responsavel, contato) values ("João Nunes Pereira", 11, "5° ano A", "Vespertino", "Gabriella Nunes Pereira", "(11)986664343");
insert into tb_escola (nome, idade, turma, periodo, responsavel, contato) values ("José Souza", 12, "6° ano A", "Matutino", "Barbara Souza", "(11)982223334");
insert into tb_escola (nome, idade, turma, periodo, responsavel, contato) values ("Amanda Amorim", 11, "5° ano A", "Matutino", "Diego Amorim", "(11)981115555");
insert into tb_escola (nome, idade, turma, periodo, responsavel, contato) values ("Vanessa Camargo", 12, "6° ano A", "Matutino", "George Camargo", "(11)984444555");
insert into tb_escola (nome, idade, turma, periodo, responsavel, contato) values ("André Souza Santos", 13, "7° ano B", "Matutino", "Daysi Souza Santos", "(11)986666888");
insert into tb_escola (nome, idade, turma, periodo, responsavel, contato) values ("Bernardo Sotto", 9, "3° ano A", "Matutino", "Beatriz Sotto", "(11)987787887");
insert into tb_escola (nome, idade, turma, periodo, responsavel, contato) values ("Angelina da Silva ", 10, "4° ano A", "Matutino", "Marcela da Silva", "(11)951515151");
insert into tb_escola (nome, idade, turma, periodo, responsavel, contato) values ("Maria Coutinho", 14, "8° ano A", "Matutino", "Ines Coutinho", "(11)989898989");
insert into tb_escola (nome, idade, turma, periodo, responsavel, contato) values ("Victoria Bernardes", 7, "1° ano A", "Integral", "Marcos Bernardes", "(11)982323232");

-- Todos select
select * from tb_escola WHERE idade>18;

select * from tb_escola WHERE idade<18;

select * from tb_escola WHERE idade between 20 and 25;