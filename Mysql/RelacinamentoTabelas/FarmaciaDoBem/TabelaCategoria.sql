create database db_farmacia_do_bem;

use db_farmacia_do_bem;

-- Criando tabela 
create table tb_categoria(
id bigint(5) auto_increment,
setor varchar(20),
prescricao boolean,
disponivel boolean,
primary key(id)
);

-- Todos inserts
insert into tb_categoria(setor, prescricao, disponivel) values("Medicamentos", false, true);
insert into tb_categoria(setor, prescricao, disponivel) values("Medicamentos", true, true);
insert into tb_categoria(setor, prescricao, disponivel) values("Medicamentos", false, false);
insert into tb_categoria(setor, prescricao, disponivel) values("Medicamentos", true, false);
insert into tb_categoria(setor, prescricao, disponivel) values("Cosméticos", false, true);
