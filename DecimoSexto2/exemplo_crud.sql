create database exemplo_crud;

use exemplo_crud;

create table usuario
(
    id integer not null AUTO_INCREMENT primary key,
    nome varchar(50) not null,
    usuario varchar(50) not null,
    senha varchar(64) not null
)default charset = utf8mb4;

create table produto (
  id integer not null AUTO_INCREMENT primary key,
  nome varchar(50) not null,
  valor double
) default charset = utf8mb4;

Insert into produto (nome,valor) values ('lolo',13);

select nome, valor from produto where valor (1,20);

create table fornecedor
(
    id integer not null AUTO_INCREMENT primary key,
    razao_social varchar(50) not null,
    nome_fantasia varchar(50) not null,
    cnpj varchar(64) not null
)  default charset = utf8mb4;
