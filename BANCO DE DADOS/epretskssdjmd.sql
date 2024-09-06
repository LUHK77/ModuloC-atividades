CREATE DATABASE rh
DEFAULT CHARACTER SET UTF8MB4
DEFAULT COLLATE UTF8MB4_GENERAL_CI;

USE rh;

CREATE TABLE funcionarios(
nome varchar(40),
cargo varchar(20),
salario decimal(6,2)
) default charset = utf8mb4;

alter table funcionarios
add column id int auto_increment primary key first;

select * from funcionarios;

insert into funcionarios values (default,'Vanderlei','PEDREIRO','1600.00');