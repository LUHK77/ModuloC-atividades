CREATE DATABASE cinema
DEFAULT CHARACTER SET UTF8MB4
DEFAULT COLLATE UTF8MB4_GENERAL_CI;

use cinema;

create table filmes(
id int not null auto_increment,
titulo varchar(60),
diretor varchar(50),
genero varchar (30),
duracao_minutos int,
primary key(id)
)DEFAULT CHARSET = utf8mb4;

insert into filmes values 
(default,'Homen Aranha', 'Sam Raimi', 'super heroi',121),
(default,'Mascara', ' Mike Richardson', 'acao', 101);

select * from filmes;
