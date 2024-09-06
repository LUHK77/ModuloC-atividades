CREATE DATABASE biblioteca
DEFAULT CHARACTER SET UTF8MB4
DEFAULT COLLATE UTF8MB4_GENERAL_CI;

USE biblioteca;

DROP TABLE livros;
CREATE TABLE livros (
id int not null auto_increment,
nome varchar (70),
autor varchar (50),
ano_publicacao date,
disponivel boolean default true,
PRIMARY KEY (id)
) DEFAULT CHARSET = utf8mb4;

insert into livros values 
(default, 'Pequeno Princepe', 'Antoine de Saint-Exupéry','1943-04-13', default),
(default, 'O Menino Maluquinho', 'Ziraldo', '1980-10-24', false),
(default,'Os Miseráveis', 'Victor Hugo', '2014-10-07', false),
(default,'Meridiano de Sangue', 'Cormac McCarthy', '1985-04-01', default);

insert into livros value(default,'ANOTHER NODE', 'Tilasca Vara', '1997-09-22',default);

select * from livros;

select * from livros 
where disponivel = true;

select * from livros
where ano_publicacao between '1990-01-01' and '2000-01-01';

insert into livros values 
(default,'The furt nos teng e amor', 'J.K. Rowling','1987-08-11',default),
(default,'Ta chuvendo forte com amor', 'George R.R. Martin','1954-05-21',default),
(default,'Noite amor', 'J.K. Rowling','1951-09-09',default),
(default,'Sexta so que troca o ta por o que vai vira amor', 'George R.R. Martin','1969-1-09',default);

select * from livros 
where autor in ('J.K. Rowling','George R.R. Martin');

select * from livros
where nome like '%amor%';

select distinct(genero) from alunos;

alter table livros
add column genero varchar(50) default 'comedia';

update livros
set genero = 'romance' where id between 1 and 4;

update livros
set genero = 'acao' where id between 5 and 8; 

select distinct(genero) from livros;


select min(ano_publicacao) from livros;

