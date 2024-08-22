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

select * from livros;