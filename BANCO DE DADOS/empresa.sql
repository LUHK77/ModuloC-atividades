CREATE DATABASE empresa
DEFAULT CHARACTER SET UTF8MB4
DEFAULT COLLATE UTF8MB4_GENERAL_CI;

USE empresa;

DROP table funcionarios;
CREATE TABLE funcionarios (
id int not null auto_increment,
nome varchar(60),
cargo varchar(30),
salario decimal(6,2),
data_admissao date,
primary key(id)
) DEFAULT CHARSET = utf8mb4;

insert into funcionarios values (default, 'Jairton', 'DESENVOLVEDOR','2300.68','2019-07-16');
select * from funcionarios;

