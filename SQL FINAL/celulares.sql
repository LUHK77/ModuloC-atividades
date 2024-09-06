CREATE DATABASE celulares
DEFAULT CHARACTER SET UTF8MB4
DEFAULT COLLATE UTF8MB4_GENERAL_CI;

use celulares;

drop table celulares; 
create table celulares (
id int not null auto_increment,
marca varchar(30) not null,
modelo varchar(30) not null,
sistema_operacional varchar(30),
propretario_id int,
primary key(id) 
) default charset = utf8mb4;

create table propretarios (
id int not null auto_increment,
nome varchar(30) not null,
primary key(id)
) default charset = utf8mb4;

insert into celulares (marca,modelo,sistema_operacional,propretario_id) values
('lg','LGK10','android',1),
('motorola','moto g 10','android',1),
('Xiaomi','poco c65', 'android',3),
('Xiaomi','poco c40', 'android',1),
('iphone','iphone 4s', 'IOS',2),
('iphone','iphone 7', 'IOS',2),
('iphone','iphone 13', 'IOS',4),
('motorola','moto g 21','android',4);

insert into celulares (marca,modelo,sistema_operacional,propretario_id) values
('samsung','Samsung j4', 'android',3),
('samsung','Samsung j7', 'android',1);


insert into propretarios
(nome) values ('Claudia'), ('Jorge'),('Robertinho'),('Joao');

alter table celulares 
add foreign key(propretario_id)
references propretarios(id);

-- 32

select marca,modelo from celulares;

-- 33
select p.nome,c.modelo from celulares as c
join propretarios as p on c.propretario_id = p.id;

-- 34

select * from celulares
where sistema_operacional = 'android';

-- 35

select p.nome from propretarios as p
join celulares as c on c.propretario_id = p.id
where c.marca = 'samsung';

-- 36

select sistema_operacional, count(id) from celulares
group by sistema_operacional having count(id);

-- 37

select sistema_operacional, count(id) from celulares
group by sistema_operacional having count(id) > 10;

-- 38 

update celulares
set sistema_operacional = 'IOS'
where id = 4;

-- 39

delete from celulares
where id = 9;



 

