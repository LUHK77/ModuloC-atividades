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
