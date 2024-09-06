CREATE DATABASE Empresa12
DEFAULT CHARACTER SET UTF8MB4
DEFAULT COLLATE UTF8MB4_GENERAL_CI;

use Empresa12;	

DROP table funcionarios;
CREATE TABLE funcionarios (
id int not null auto_increment,
nome varchar(60),
cargo varchar(30),
salario decimal(6,2),
data_admissao date,
primary key(id)
) DEFAULT CHARSET = utf8mb4;

insert into funcionarios values 
(default, 'Jairton', 'DESENVOLVEDOR','2300.68','2019-07-16'),
(default, 'Jonathan', 'DESENVOLVEDOR','2300.89','2020-06-12'),
(default, 'Clebinho', 'DESENVOLVEDOR','2300.89','2020-02-26'),
(default, 'Juana', 'SUPORTE','1900.89','2021-06-12'),
(default, 'Ana', 'SUPORTE','2100.89','2018-02-16');
select * from funcionarios;

SELECT nome, id from funcionarios
where cargo = 'DESENVOLVEDOR';

select nome, salario from funcionarios 
where cargo = 'SUPORTE' && salario > 2000.00;

select * from funcionarios 
where id between 1 and 3;

SELECT cargo, salario from funcionarios
where salario in ('2300.68', '2300.89');

update funcionarios 
set salario = '3000.90'
where id = 3;

select nome from funcionarios
where cargo LIKE '%o%';

select * from funcionarios
where cargo like '_UPORT_';

select distinct cargo from funcionarios;

select count(*) from funcionarios
where salario > 2000;

select max(nome) from funcionarios; 

select min(salario) from funcionarios;

select SUM(salario) from funcionarios;

select AVG(salario) from funcionarios;

select  salario,count(*) from funcionarios
group by salario having count(salario) > 2000; 

select nome,salario from funcionarios
order by salario desc;

select * from funcionarios
where data_admissao < '2022-01-01';

insert into funcionarios values
(default, 'Fustosous', 'ANALISTA','2200.68','2019-03-11'),
(default, 'Judas', 'GERENTE','7000.98','2020-01-27'),
(default, 'ferndanbinho', 'ANALISTA','2200.68','2020-08-21'),
(default, 'Torivalda', 'GERENTE','7500.98','2018-09-13');

select * from funcionarios
where cargo in('ANALISTA','GERENTE');

select * from funcionarios
where cargo like '%R';

select cargo as 'Cargos',AVG(salario) as 'media dos salarios' from funcionarios
group by cargo having AVG(salario);

