CREATE DATABASE Empresa24
DEFAULT CHARACTER SET UTF8MB4
DEFAULT COLLATE UTF8MB4_GENERAL_CI;

use Empresa24;	

DROP table funcionarios;
CREATE TABLE funcionarios (
id int not null auto_increment,
nome varchar(60),
cargo varchar(30),
salario decimal(6,2),
primary key(id)
) DEFAULT CHARSET = utf8mb4;

CREATE TABLE departamento (
id int not null auto_increment,
nome varchar(30),
primary key(id)
) default charset = utf8mb4;

insert into funcionarios values 
(default, 'Jairton', 'Vendedor','4300.68',1),
(default, 'Jonathan', 'Vendedor','3300.89',1),
(default, 'Clebinho', 'Gerente','6300.89',2),
(default, 'Juana', 'Estoquista','1900.89',3),
(default, 'Ana', 'ADMINISTRAÇÂO','2100.89',2);

insert into funcionarios (nome,cargo,salario,departamento_id)
values 
('lioldo','Marketing','5300.21',4), 
('isono','Marketing','2100.12',4);


select * from funcionarios
where salario between 3000 and 5000;

drop table departamento;
insert into departamento (nome) values 
('Vendas'),
('Administração'),
('Estoque');

insert into departamento (nome) values ('Marketing'), ('Ti');

delete from departamento
where id > 1;

alter table funcionarios 
add column departamento_id int;

alter table funcionarios
add foreign key(departamento_id)
references departamento(id);

-- 1
select nome from funcionarios;
-- 2
select f.nome , f.cargo from funcionarios as f 
JOIN departamento as d on f.departamento_id = d.id
where d.nome = 'Vendas';

-- 3
select d.nome, count(f.id) from departamento as d 
join funcionarios as f on d.id =  f.departamento_id
group by d.nome having count(f.id); 

-- 4
select f.nome , d.nome from funcionarios as f 
JOIN departamento as d on f.departamento_id = d.id;

-- 5
select nome from funcionarios
where salario > 5000;

-- 6
select f.nome from funcionarios as f 
join departamento as d on d.id = f.departamento_id
where d.nome in ('Marketing','Ti');

-- 7 
alter table funcionarios
add column data_admissao date;

update funcionarios 
set data_admissao = '2019-03-12'
where id between 1 and 5;

update funcionarios 
set data_admissao = '2021-05-22'
where id > 6;

select nome from funcionarios
where data_admissao between '2020-01-01' and '2022-12-31';

-- 8 
select nome from funcionarios 
where nome like 'M%' or nome like 'm%';

-- 9
select distinct cargo from funcionarios;

-- 10
select avg(salario) from funcionarios;

-- 11
select max(salario) from funcionarios;

-- 12
select d.nome, count(f.id) from departamento as d 
join funcionarios as f on d.id =  f.departamento_id
group by d.nome having count(f.id); 

-- 13
select d.nome, count(f.id) from departamento as d 
join funcionarios as f on d.id =  f.departamento_id
group by d.nome having count(f.id) > 10;

-- 14
update funcionarios
set cargo = 'Analista de Sistemas'
where id = 5;
select * from funcionarios
where id = 5;

-- 15
delete from funcionarios
where id = 10;
select * from funcionarios; 

