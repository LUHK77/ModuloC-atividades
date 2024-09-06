CREATE DATABASE Desenhos
DEFAULT CHARACTER SET UTF8MB4
DEFAULT COLLATE UTF8MB4_GENERAL_CI;

USE desenhos;

DROP TABLE personagens;
CREATE TABLE personagens(
id int auto_increment not null,
nome varchar(50),
idade int,
id_desenho int,
primary key(id)
) DEFAULT CHARSET = utf8mb4;

DROP table desenho;
create table desenho(
id int not null auto_increment,
nome varchar(30),
criador varchar (30),
ano_lancamento year,
primary key(id)
) DEFAULT CHARSET = utf8mb4;

alter table personagens
add foreign key (id_desenho)
references desenho(id);

insert into desenho (nome,criador,ano_lancamento) values
('JuJutsu Kaisen','GeGe','2018'),
('One Piece','Oda','1997'),
('Chainsaw man','Fujimoto','2020');

insert into desenho (nome,criador,ano_lancamento) values
('Baki','Keisuke','2001');

insert into personagens (nome,idade,id_desenho) values
('Yujiro Hamma',37,4),
('Doppio',57,4),
('Myamoto',32,4);

select * from desenho;

insert into personagens (nome,idade,id_desenho) values
('Itadori',17,1),
('Gojou',29,1),
('Megumi',17,1),
('Luffy',19,2),
('Nami',20,2),
('Zoro',21,2),
('Denji',17,3),
('Makima',30,3),
('Kobeni',20,3);

select d.nome, p.nome from desenho as d join personagens as p on d.id = p.id_desenho;

insert into personagens (nome,idade) values
('Goku',59),
('Saitama',22);

insert into desenho (nome,criador) values
('Hora de Aventura','Um Carinha ai'),
('Apenas um Show','Cleber');

select d.nome, p.nome from personagens as p 
left join desenho as d
on d.id = p.id_desenho;

select d.nome, p.nome from desenho as d
left join personagens as p
on d.id = p.id_desenho;

select d.nome, p.nome, p.idade from personagens as p 
left join desenho as d
on d.id = p.id_desenho
where p.idade >= 18;

select d.nome, p.nome from desenho as d
left join personagens as p
on d.id = p.id_desenho
order by d.nome asc, p.nome asc;

select d.nome,count(p.id_desenho) 
from desenho as d 
left join personagens as p 
on p.id_desenho = d.id
group by d.nome; 

select d.nome,avg(p.idade) as 'media de idade'
from personagens as p 
 join desenho as d 
on p.id_desenho = d.id
group by d.nome having avg(p.idade);


select d.nome,avg(p.idade) as 'media de idade'
from personagens as p 
 join desenho as d 
on p.id_desenho = d.id
group by d.nome having avg(p.idade) > 30;  

update personagens
set id_desenho = 9
where id_desenho = 4;

