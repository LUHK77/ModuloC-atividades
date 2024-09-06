CREATE DATABASE MUSICA2
DEFAULT CHARACTER SET UTF8MB4
DEFAULT COLLATE UTF8MB4_GENERAL_CI;

USE MUSICA2;

drop table album;
CREATE TABLE album (
id int auto_increment not null,
titulo varchar(30),
ano_lancamento year,
artista_id int,
primary key(id)
) default charset = utf8mb4;

CREATE TABLE artista (
id int auto_increment not null,
nome varchar(30),
genero varchar(20),
primary key(id)
) default charset = utf8mb4;

alter table album
add foreign key (artista_id)
references artista(id);

insert into artista (nome, genero) values
('Young Lixo','Homem'),
('Tuco da Grande Familia','Homem'),
('Jurevalda','Mulher');

insert into artista (nome, genero) values
('Clebiriano','Homem'),
('Gustavo Lima','Homem');

insert into album (titulo,ano_lancamento,artista_id) values
('The Darkk','1998',2),
('Ratatulie','2020',1),
('Singnisgs','2017',3),
('Belivere?','2016',2),
('Mentos Fresh','2018',1),
('Banehiro do bar','2001',3);

insert into album (titulo,ano_lancamento) values
('Me desculpa','1988'),
('Honda Onix','2003');

insert into album (titulo,ano_lancamento,artista_id) values
('Fuzil musical','2011',1),
('The black happy','1987',3);

insert into album (titulo,ano_lancamento,artista_id) values
('Black Mamba','2009',1),
('Evening Cool','1981',3);

select al.titulo,a.nome,al.ano_lancamento 
from album as al 
join artista as a on al.artista_id = a.id; 

select al.titulo,a.nome,al.ano_lancamento 
from album as al 
left join artista as a on al.artista_id = a.id; 

select al.titulo,a.nome,al.ano_lancamento 
from artista as a 
left join album as al on al.artista_id = a.id; 

select al.titulo,a.nome,al.ano_lancamento 
from album as al 
left join artista as a on al.artista_id = a.id
where al.ano_lancamento < 2000;

select al.titulo,a.nome, al.ano_lancamento
from artista as a  join album as al on al.artista_id = a.id
order by al.ano_lancamento; 

select a.nome,count(al.artista_id)
from artista as a
join album as al on al.artista_id = a.id
group by a.nome having count(al.artista_id) > 3;

