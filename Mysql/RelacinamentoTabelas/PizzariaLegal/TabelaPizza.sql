use db_pizzaria_legal;

-- Criando tabela
create table tb_pizza(
id bigint(5) auto_increment,
valor decimal(3,2),
sabor varchar(20),
alteracao varchar(20),
bebida boolean,
categoria_id bigint not null,
primary key(id),
foreign key(categoria_id) references tb_categoria(id)
);

-- Todos os insert
insert into tb_pizza(valor, sabor, alteracao, bebida, categoria_id) values(3.99, "Bauru", "Sem tomate", true, 3);
insert into tb_pizza(valor, sabor, alteracao, bebida, categoria_id) values(32.99, "Peperone", " ", false, 1);
insert into tb_pizza(valor, sabor, alteracao, bebida, categoria_id) values(36.99, "M&Ms", " ", true, 2);
insert into tb_pizza(valor, sabor, alteracao, bebida, categoria_id) values(18.99, "Portuguesa", "Sem ervilha", true, 4);
insert into tb_pizza(valor, sabor, alteracao, bebida, categoria_id) values(45.99, "Camarão com catupiry", " ", true, 3);
insert into tb_pizza(valor, sabor, alteracao, bebida, categoria_id) values(20.99, "Kit Kat", " ", false, 5);
insert into tb_pizza(valor, sabor, alteracao, bebida, categoria_id) values(32.99, "Frango com catupiry", " ", true, 1);
insert into tb_pizza(valor, sabor, alteracao, bebida, categoria_id) values(18.99, "Bauru", " ", true, 4);

-- Todos os selects
select * from tb_pizza where valor > 45.00;

select * from tb_pizza where valor between 29 and 60;

select * from tb_pizza where sabor like "%c%";

select * from tb_pizza
	inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id;
    
select * from tb_pizza
	inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id
    where tipo= "Doce";