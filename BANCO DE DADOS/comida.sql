CREATE DATABASE restaurante
DEFAULT CHARACTER SET UTF8MB4
DEFAULT COLLATE UTF8MB4_GENERAL_CI;

USE restaurante;

create table pratos (
nome varchar(60),
descricao tinytext,
preco decimal(5.2)
) default charset = utf8mb4;

alter table pratos
add column id int auto_increment primary key first;

insert into pratos values (default, 'moço gelado', 'musse de morango com cobertura de chocolate branco');
