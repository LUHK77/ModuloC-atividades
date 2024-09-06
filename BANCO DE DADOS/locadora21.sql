CREATE DATABASE LOCADORA
DEFAULT CHARACTER SET UTF8MB4
DEFAULT COLLATE UTF8MB4_GENERAL_CI;

use LOCADORA;	

drop table filmes;
create table filmes (
idfilme int not null auto_increment,
nome varchar(30) not null,
ano year,
primary key(idfilme)
) DEFAULT CHARSET = utf8mb4;

drop table clientes;
create table clientes(
idcliente int not null auto_increment,
nome varchar(30) not null,
primary key(idcliente)
) DEFAULT CHARSET = utf8mb4;

insert into filmes (nome,ano) values
('Matrix','1999'),
('Sherek','2004'),
('O FILME','2000');

select * from filmes;

insert into clientes (nome) values 
('Cleber'),
('Getulio Vargas'),
('Ortinda');

select * from clientes;

alter table clientes
drop column filme_comprado;

alter table clientes
add column filme_comprado int;

alter table clientes 
add foreign key (filme_comprado)
references filmes(idfilme);

update clientes set filme_comprado = '2'
where idcliente = 1;

delete from filmes
where idfilme = 2;

delete from filmes
where idfilme = 1;


select nome,filme_comprado from clientes;
select nome, ano from filmes;

select clientes.nome, clientes.filme_comprado, filmes.nome, filmes.ano
from clientes JOIN filmes on filmes.idfilme = clientes.filme_comprado;

select c.nome, f.nome, f.ano from clientes as C JOIN filmes as f 
on f.idfilme = c.filme_comprado;

select c.nome, c.filme_comprado, f.nome, f.ano 
from clientes as c left join filmes as f 
on f.idfilme = c.filme_comprado;

drop table cliente_assiste_filme;
create table cliente_assiste_filme(
id_caf int not null auto_increment,
date DATE,
idcliente_caf int,
idfilme_caf int,
primary key(id_caf),
foreign key(idcliente_caf) references clientes(idcliente),
foreign key(idfilme_caf) references filmes(idfilme)
) default charset = utf8mb4;

insert into cliente_assiste_filme;