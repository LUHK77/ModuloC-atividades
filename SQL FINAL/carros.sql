CREATE DATABASE carros
DEFAULT CHARACTER SET UTF8MB4
DEFAULT COLLATE UTF8MB4_GENERAL_CI;

use carros;	

drop table carros;
create table carros (
id int not null auto_increment,
modelo varchar (30),
marca varchar (30),
ano year,
propretario int,
primary key(id)
) default charset = utf8mb4;

insert into carros (modelo,marca,ano,propretario) values 
('Fusca 1959','Volkswagen','1959',1),
('Segmento Civic','Honda','2012',2),
('Jetta Corolla','Volkswagen','2017',2),
('Focus Corolla','Ford','2011',2),
('Elantra', 'Hyundai','2019',3),
('Jipinho', 'Toyota','2007',3),
('Camaro', 'Camaro','2009',4),
('Tesla 2022', 'Tesla','2022',4);

insert into carros (modelo,marca,ano,propretario_id) values 
('Fordcar 1959','Ford','1959',1),
('Honda 22','Toyota','2012',2),
('Fordcar 2010','Ford','2017',2),
('Fordcar 1999','Ford','2011',3),
('Fordcar 2001', 'Ford','2019',3),
('Jipinho 2', 'Toyota','2007',4),
('Honda new', 'Toyota','2009',4),
('Fordcar 2022', 'Ford','2022',4);

select * from carros;
create table propretario(
id int not null auto_increment,
nome varchar(30),
idade int,
primary key(id)
) default charset = utf8mb4;

insert into propretario (nome,idade) 
values 
('João',19), 
('Fastu',34),
('Higinho',28),
('Valdemiro',62);

alter table carros
rename column propretario to propretario_id;

alter table carros
add foreign key(propretario_id)
references propretario(id);

select * from carros
where modelo like '%Corolla' or modelo like '%Civic';

-- 16

select marca,modelo from carros;

-- 17

select p.nome, c.modelo from propretario as p
join carros as c on c.propretario_id = p.id;

-- 18

select modelo, ano from carros
where ano < 2010;

-- 19

select modelo, marca from carros
where marca = 'Toyota';

-- 20

select marca, count(id) from carros
group by marca having count(id);

-- 21

select marca, count(id) from carros
group by marca having count(id) > 5;

-- 22

update carros 
set ano = '2015'
where id = 5;

select * from carros
where id = 5;

-- 23
delete from carros
where id = 7;

select * from carros;

