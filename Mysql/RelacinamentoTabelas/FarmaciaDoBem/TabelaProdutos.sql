use db_farmacia_do_bem;

-- Criando tabela
create table tb_produtos(
id bigint(5) auto_increment,
nome varchar(20),
quantidade int,
preco double(10,2),
fornecedor varchar(50),
desconto varchar(4),
categoria_id bigint,
primary key(id),
foreign key(categoria_id) references tb_categoria(id)
);

-- Todos insert
insert into tb_produtos(nome, quantidade, preco, fornecedor, desconto, categoria_id) values("Piroxicam", 1, 17.99, "Neo Quimica", "10%", 1);
insert into tb_produtos(nome, quantidade, preco, fornecedor, desconto, categoria_id) values("Desodorante", 1, 19.99, "Rexona", "0%", 5);
insert into tb_produtos(nome, quantidade, preco, fornecedor, desconto, categoria_id) values("Sabonete", 1, 2.99, "Dove", "10%", 5);
insert into tb_produtos(nome, quantidade, preco, fornecedor, desconto, categoria_id) values("Plasil", 1, 9.99, "Sanofi", "10%", 1); 
insert into tb_produtos(nome, quantidade, preco, fornecedor, desconto, categoria_id) values("Artroflan", 1, 59.99, "Hypera", "15%", 2);
insert into tb_produtos(nome, quantidade, preco, fornecedor, desconto, categoria_id) values("Cime Gripe", 1, 20.99, "", "5%", 1);
insert into tb_produtos(nome, quantidade, preco, fornecedor, desconto, categoria_id) values("Shampo", 1, 10.99, "Elseve", "10%", 5);
insert into tb_produtos(nome, quantidade, preco, fornecedor, desconto, categoria_id) values("Condicionador", 1, 15.99, "Elseve", "10%", 5);

-- Todos os selects
select * from tb_produtos where preco > 50;

select * from tb_produtos where preco between 3 and 60;

select * from tb_produtos where nome like "%B%";

select * from tb_produtos
inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id;

select * from tb_produtos
inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id
where setor = "Medicamentos";