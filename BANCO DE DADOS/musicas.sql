CREATE DATABASE MUSICA
DEFAULT CHARACTER SET UTF8MB4
DEFAULT COLLATE UTF8MB4_GENERAL_CI;

USE MUSICA;

CREATE TABLE album (
id int not null auto_increment,
nome varchar(50),
artista varchar(30),
ano_lancamento date,
genero varchar(20),
primary key(id)
)DEFAULT CHARSET = utf8mb4;

insert into album values 
(default,'The Man Who Sold The World','David Bowie','1970-11-04', 'Rock'),
(default,'The Death of Slim Shady', 'Eminem', '2024-07-12', 'Hip Hop');

select * from album;

insert into album values 
(default,'Kinghsg Crisomunto','Nao sei','1980-12-22', 'Rocp'),
(default,'Crazut humbarguer', 'Tuco da grande famalia', '1997-03-21', 'Posiu');
insert into album values 
(default,'Chora','Tuco da grande famalia','2001-09-12', 'Rap'),
(default,'FNAF 2', 'SCOOT queto', '1989-01-21', 'Hip-Hop'),
(default,'FNAF', 'SCOOT queto', '1983-07-21', 'Hip-Hop'),
(default,'ELE TENTA', 'carlos silva', '2014-05-19', 'Sertanejo');

update album 
set nome = 'King Crismon', artista = ' Peter Sinfield', ano_lancamento = '1969-01-13', genero = 'Rock'
where id = 3;

update album 
set nome = 'Crazy Diamond', artista = 'David Gilmour', ano_lancamento = '1980-03-23', genero = 'Rock'
where id = 4;

delete from album
where nome = 'Crazy Diamond';

truncate album;

-- 1
select * from album;
-- 2
select nome from album;

-- 3
select nome from album
order by nome desc;

-- 4
select id, artista from album;

-- 5
select nome,ano_lancamento from album
where ano_lancamento >= '2016-03-22';

-- 6
select id,nome from album
where id > 2;

-- 7
select id,nome,artista from album
where id between 1 and 3;

-- 8 
select id, nome from album
where id between 2 and 4 or id between 3 and 4 and nome != 'The Death of Slim Shady';

-- 9
select * from album
where id in (3,6);

-- 10
select * from album
where id < 3 || nome = 'ELE TENTA';

-- 11
select * from album
where genero like 'R%';

-- 12
update album
set ano_lancamento = '1999-09-16'
where id = 5;

-- 13
insert into album values 
(default,'The Man Who Sold The World','David Bowie','1970-11-04', 'Rock');

select distinct nome from album;

-- 14
select count(genero) from album;

-- 15
select min(ano_lancamento) from album;
select max(ano_lancamento) from album;
select AVG(id) from album;





