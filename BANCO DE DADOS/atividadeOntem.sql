CREATE DATABASE encommerce
DEFAULT CHARACTER SET UTF8MB4
DEFAULT COLLATE UTF8MB4_GENERAL_CI;

USE encomerce;

CREATE TABLE if not exists produtos(
id int auto_increment,
nome varchar(120),
preco decimal(8,2),
primary key(id)
) default charset = utf8mb4;

select * from produtos;

alter table produtos 
add column descricao tinytext;

alter table produtos
drop column descricao;

insert into produtos values
(default,'Camiseta','29.90','Camiseta de algodão, tamanho M');


DROP TABLE clientes;
CREATE TABLE clientes(
id int not null auto_increment,
nome varchar(60),
primary key(id)
) default charset = utf8mb4;

select * from clientes;
alter table clientes
add column email varchar(40) first,
add column telefone decimal(20,0) UNSIGNED;

insert into clientes values 
('wolater12@gmail.com',default,'walter',551198827765),
('geraldinho12@gmalil.com',default,'geraldo',555198735586);

alter table clientes
rename to usuarios;





