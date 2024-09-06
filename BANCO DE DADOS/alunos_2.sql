CREATE DATABASE ESCOLA1
DEFAULT CHARACTER SET UTF8MB4
DEFAULT COLLATE UTF8MB4_GENERAL_CI;

USE ESCOLA1;

DROP TABLE alunos;
CREATE TABLE alunos(
id int not null auto_increment,
nome varchar(60),
turma varchar(3),
nascimento date,
primary key(id)
) default charset = utf8mb4;

insert into alunos values 
(DEFAULT,'Carlos Eduardo','2B','Tramandai','aluno@gmail.com','2008-04-11'),
(DEFAULT,'Roger Jerminilson','2B','Tramandai','aluno@gmail.com','2008-06-17'),
(DEFAULT,'Tuco Souza','3A','Tramandai','aluno@gmail.com','2007-04-26');

select * from alunos;

alter table alunos
add column cidade varchar(60);

insert into alunos values
(default, 'Ana','9B','Imbe','aluno@gmail.com','2011-09-14');

alter table alunos
drop column cidade;

alter table alunos
add column cidade varchar(60) first;

alter table alunos
add column cidade varchar(60) after turma;

alter table alunos
modify column nome varchar(30);

alter table alunos 
change column nome nomend varchar(40);

alter table alunos
change column nomend nome varchar(30);

alter table alunos
rename to alunos_senac;

alter table alunos_senac
rename to alunos;

drop table if exists cursos;
create table if not exists cursos(
nome varchar(60) not null unique,
carga int unsigned,
ano year default '2024'
) default charset = utf8mb4;

update alunos 
SET turma = '9A'
where id = 3;

insert into alunos values 
(default,'Ruinto','8B','Tramandai','aluno@gmail.com','2008-04-11'),
(default,'Vladeltermintom','8B','Tramandai','aluno@gmail.com','2008-01-30'),
(default,'Turtus','8B','Tramandai','aluno@gmail.com','2008-07-21');

delete from alunos
where turma = '8B'
limit 3;

alter table alunos
add column email varchar(30) after cidade;

insert into alunos values 
(default,'João Silva','8B','Tramandai','joaosilva@novoemail.com','2008-04-11');

delete from alunos
where id = 5
limit 1;

update alunos 
set nascimento = date_sub(nascimento, INTERVAL 1 YEAR);

update alunos 
set email = 'aluno@gmail.com'
where turma = '8B';

delete from alunos
where email is null;

truncate alunos;

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
(default,'Regina', 'portugues','800.50'),
(default,'Sandro','historia','700.00'),
(default,'Vini', 'redes','999.99');

alter table professores
modify column salario decimal(6,2);

update professores
set salario = salario * 1.1
where nome != null;

select * from professores;

delete from professores 
where id in (1,2,3)
limit 3;


insert into professores values 
(default,'Tuco','quimica','6080.22'),
(default,'Frederico', 'programacao','9800.50'),
(default,'Lopes','historia','700.00'),
(default,'Marcelo', 'redes','2999.99');

alter table professores 
add column cargo varchar(30);

insert into professores values
(default,'Fistafeito','quimica','3000.87','professor','professor@gmail.com'),
(default,'Lopestrofote','fisica','3000.87','professor','professor@gmail.com'),
(default,'Terafubins','matematica','3000.87','professor','professor@gmail.com'),
(default,'Bustotenquina','fisica','3000.87','professor','professor@gmail.com');


update professores
set cargo = 'professor'
where salario < 5000;

update professores
set cargo = 'gerente'
where salario > 5000;

-- 1
select * from alunos
where turma = '8B';

-- 2
alter table professores
add column email varchar(60);

update professores
set email = 'professor@gmail.com';

select nome, email from professores;

--------

select * from alunos
where nascimento > '2000-01-01';

select * from professores
where salario > 3000;

insert into alunos values 
(default,'Fristokt','9B','Tramandaí','aluno@gmail.com','2007-01-29'),
(default,'Juriscleiton','9B','Tramandaí','aluno@gmail.com','2004-08-23'),
(default,'Lana','9B','Tramandaí','aluno@gmail.com','1997-12-14'),
(default,'Opilacinto','9B','Tramandaí','aluno@gmail.com','2009-09-21');

select * from alunos
where turma = '9B' and nascimento > '2003-01-01';

select * from professores
where displina = 'matematica' || displina = 'fisica';

select * from alunos
where nome like 'A%';

select distinct(turma) from alunos;

select count(id) as 'Alunos' from alunos value;

select turma, count(turma) from alunos
group by turma having count(turma);	

select turma,count(turma) from alunos
group by turma having count(turma) >= 20;

