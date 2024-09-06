CREATE DATABASE megabarzar
DEFAULT CHARACTER SET UTF8MB4
DEFAULT COLLATE UTF8MB4_GENERAL_CI;

use megabarzar;

drop table antiquario;
create table antiquario(
id int auto_increment,
categoria varchar(30),
tipo varchar(30),
quantidade int,
ano year,
primary key(id)
)default charset = utf8mb4;

insert into antiquario values
(default,'Múzica','Dico de Viniu','40','1960'),
(default,'Espelios','Vidro','20','1980'),
(default,'Video games','Fita','10','1970'),
(default,'Xícaras','Argila','40','1960'),
(default,'Bebidja','Vodka','10','1950');

UPDATE antiquario
SET categoria = 'Música'
where id = '1';

select * from antiquario;

truncate antiquario;


update antiquario 
set categoria = 'Espelho', quantidade = '40'
where id = '2'
limit 1;

delete from antiquario 
where ano > 1930
limit 2;	

update antiquario
where set  