CREATE DATABASE redes_S
DEFAULT CHARACTER SET UTF8MB4
DEFAULT COLLATE UTF8MB4_GENERAL_CI;

use redes_S;

create table usuarios (
id int not null auto_increment,
nome varchar(30),
email varchar(30),
primary key(id)
) default charset = utf8mb4;

insert into usuarios (nome,email) values
('Cleber','cleber@gmail.com'),
('Juana','juaninha@gmail.com'),
('Teteus','tete@gmail.com'),
('Vanderlei','vander@gmail.com');

create table posts(
id int not null auto_increment,
conteudo varchar(200) not null,
data_publicacao date,
usuario_id int,
primary key(id)
) default charset = utf8mb4;

insert into posts (conteudo,data_publicacao,usuario_id) values
('P:Eh os guri da academia não tem como!','2021-08-12',1),
('P:Ontem eu fui na feira, e um cara me perguntou, por que não existia flor preta, eu não soube responder, e preferia não saber a resposta','2023-08-09',2),
('P:Cada like neste post é um passo mais perto de deus','2020-09-13',3),
('P:Antigamente era bom, mas acho não pode nem mais cagar que te chamam de machista','2022-09-27',4),
('P:Ja meti o aquele whey, bo treinar','2023-08-22',1);

alter table posts
add foreign key(usuario_id)
references usuarios(id);

create table comentarios(
id int not null auto_increment,
conteudo varchar(200),
data_publicacao date,
post_id int,
usuario_id int,
primary key(id)
) default charset = utf8mb4;

alter table comentarios 
add foreign key(post_id)
references posts(id);

alter table comentarios 
add foreign key(usuario_id)
references usuarios(id);

insert into comentarios (conteudo,data_publicacao, post_id,usuario_id) values
('Dale cleber que essa eh tua!','2021-08-13',1,4),
('Dale cleber heroi','2021-08-13',1,3),
('Mo fraco esse ai','2021-08-14',1,2),
('Cala boca, deixa o muleke treinar','2021-08-14',1,4),
('Vlw rapaziada, so progreso','2021-08-15',1,1),
('Era so uma piada','2021-08-16',1,2),
('Eu sei porque não tem :)','2023-08-11',2,3),
('Pergunta estranha','2023-08-10',2,1),
('Eh meio sexista a piada','2023-08-11',2,2),
('Não eh racista?','2023-08-12',2,4),
('Olha senhor acho que não eh bem assim','2022-10-12',4,1),
('Vo te derruba de uma escada, seu velho','2022-10-13',4,2),
('Vai ficar sem like aparentemente','2020-09-18',3,2),
('Ninguem gosta de gente como voce','2020-09-18',3,2),
('Bo treinar junto','2023-09-18',5,3),
('Quem curte deus da like','2023-09-16',5,4),
('Algm bane esses mendigos de comentario','2023-09-16',5,2);

-- 40
select nome, email from usuarios;

-- 41
select conteudo,data_publicacao from posts;

-- 42
select u.nome, p.conteudo from usuarios as u
join posts as p on p.usuario_id = u.id;


-- 43

select p.conteudo, c.conteudo from posts as p
join comentarios as c on c.post_id = p.id;

-- 44 
select * from posts
where data_publicacao > '2023-01-01';

-- 45
select u.nome, c.conteudo from usuarios as u
join comentarios as c on c.usuario_id = u.id
where u.id = 3;

-- 46
select u.nome, count(p.id) from usuarios as u
join posts as p on p.usuario_id = u.id
group by u.nome having count(p.id);

-- 47
select u.nome, count(c.id) from usuarios as u
join comentarios as c on c.usuario_id = u.id
group by u.nome having count(c.id) > 5;

-- 48
update posts
set conteudo = 'Minha ideias mudaram, agora sou sigma'
where id = 3;

select * from posts
where id = 3;

--  49
delete from comentarios
where post_id = 5;

select p.conteudo, c.conteudo, p.usuario_id as 'post do usuario', c.usuario_id as 'comentarios' from posts as p
left join comentarios as c on c.post_id = p.id;

-- 50
delete from comentarios
where usuario_id = 3;

delete from comentarios
where post_id = 3;

delete from posts
where usuario_id = 3;

select p.conteudo, c.conteudo, p.usuario_id as 'post do usuario', c.usuario_id as 'comentarios' from posts as p
left join comentarios as c on c.post_id = p.id;





