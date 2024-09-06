CREATE DATABASE computadores
DEFAULT CHARACTER SET UTF8MB4
DEFAULT COLLATE UTF8MB4_GENERAL_CI;

use computadores;

drop table computadores;
create table computadores(
id int not null auto_increment,
marca varchar(30),
modelo varchar (30),
processador varchar(50),
memoria_Ram int,
usuario_id int,
primary key(id)
) default charset = utf8mb4;

insert into computadores (marca,modelo,processador,memoria_Ram,usuario_id) 
values
('dell','DELL 198K','intel core i5 12400',16,1),
('amd','amd center','amd ryzen 5 5600u',16,1),
('intel','Intel desktop','intel core i3 11400',12,2),
('dell','DELL 198K','intel core i5 12400',8,3),
('dell','DELL 198K','intel core i5 12400',16,1),
('amd','amd center','amd ryzen 5 5600u',16,1),
('intel','Intel desktop','intel core i3 11400',12,2),
('dell','DELL 198K','intel core i5 12400',8,3);

create table usuarios
(
id int not null auto_increment,
nome varchar(30),
email varchar(30),
primary key(id)
) default charset = utf8mb4;

insert into usuarios
(nome,email) values
('Robertinho','Robs@gmail.com'),
('Roberto','robertoFudido@gmail.com'),
('Cleidisvaldo','Cleclei@gmail.com');

alter table computadores
add foreign key (usuario_id)
references usuarios(id);


select * from computadores 
where processador like 'intel core i5%' and memoria_Ram > 8;

-- 24
select modelo, processador from computadores;

-- 25

select u.nome, c.modelo from usuarios as u 
join computadores as c on c.usuario_id = u.id;

-- 26

select * from computadores
where memoria_Ram > 8;

-- 27

select * from computadores
where marca = 'dell';

-- 28

select marca, count(id) from computadores
group by marca having count(id);

-- 29 

select marca, count(id) from computadores
group by marca having count(id) < 3;

-- 30

update computadores
set processador = 'Intel Core i7'
where id = 2;

select * from computadores
where id = 2;

-- 31

delete from computadores
where id = 6;

select * from computadores;

  

