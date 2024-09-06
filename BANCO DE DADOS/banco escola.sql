CREATE DATABASE escola
DEFAULT CHARACTER SET UTF8MB4
DEFAULT COLLATE UTF8MB4_GENERAL_CI;

USE escola;

DROP TABLE alunos;
CREATE TABLE alunos(
id int not null auto_increment,
nome varchar(60) not null,
nascimento date,
turma varchar(3),
email varchar(50),
PRIMARY KEY (id)
) DEFAULT CHARSET = utf8mb4;

insert into alunos values
(DEFAULT,'João Silve','2005-03-15','8A','"joao.silva@email.com');

DROP TABLE professores;
CREATE TABLE professores(
id int not null auto_increment,
nome varchar(255) not null,
displina varchar(30),
salario decimal(5,2),
PRIMARY KEY (id)
) DEFAULT CHARSET = utf8mb4;

insert into professores values 
(default,'Marcio','matematica','980.22'),
(default,'Regina', 'portugues','800.50');

select * from professores;



