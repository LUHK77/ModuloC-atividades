CREATE DATABASE biblioteca2
DEFAULT CHARACTER SET UTF8MB4
DEFAULT COLLATE UTF8MB4_GENERAL_CI;

USE biblioteca2;

DROP TABLE livros;
CREATE TABLE livros (
id int not null auto_increment,
titulo varchar (30),
genero varchar (20),
autor_id int,
PRIMARY KEY (id)
) DEFAULT CHARSET = utf8mb4;

DROP table autores;
create table autores (
id int not null auto_increment,
nome varchar (30),
nacionalidade varchar(30),
primary key(id)
) default charset =  utf8mb4;

alter table livros
add foreign key(autor_id)
references autores(id);

insert into autores (nome,nacionalidade) 
values 
('Joao','Brasi'),
('Scott','Estados Unidos'),
('Julian','Canada');

insert into autores (nome,nacionalidade)
values 
('Akira','Japão'),
('Hujion','China');

insert into livros (titulo,genero,autor_id) 
values
('Romeu e Julio','Drama',1),
('The Plane','Açao',2),
('The Talk About Water','Terror',3),
('Dias de Gloria','Açao',1), 
('Another Book','Romance',3),
('EleTentaEleTenta','Horror',2);

insert into livros (titulo,genero) 
values
('Ontem de noite','Drama'),
('Luta Legal','Luta'),
('O dominio do Volei','Esporte');

select l.titulo,a.nacionalidade 
from livros as l join autores as a 
on l.autor_id = a.id;

select l.titulo,a.nome
from livros as l left join autores as a 
on l.autor_id = a.id;

select l.titulo,a.nome 
from autores as a left join livros as l 
on l.autor_id = a.id;

select l.titulo,a.nome
from livros as l left join autores as a 
on l.autor_id = a.id
order by l.titulo asc;

select a.nome, count(distinct l.genero)
from autores as a left join livros as l 
on l.autor_id = a.id
group by a.nome having count(l.genero) > 1;

