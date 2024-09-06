CREATE DATABASE livraria2
DEFAULT CHARACTER SET UTF8MB4
DEFAULT COLLATE UTF8MB4_GENERAL_CI;

DROP DATABASE livraria2;

USE livraria2;

create table livros(
titulo varchar(70),
autor varchar(40),
ano_publicacao date
)default charset = utf8mb4;

alter table livros
add column id int auto_increment primary key first;

alter table livros
add column estoque int default 0;

select * from livros;

insert into livros values 
(default, 'Os cascoes', 'roberto fonseca', '1987-09-22',default),
(default, 'Ai, Alexandre de Morais!!', 'lula ensasio', '2011-09-30',99),
(default, 'Turco da Grande Familia','Mourizio de Souza','1870-01-09',1999999);

drop table if exists livros;