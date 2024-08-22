CREATE DATABASE meu_Banco
DEFAULT CHARACTER SET UTF8MB4
DEFAULT COLLATE UTF8MB4_GENERAL_CI;


USE meu_Banco;



DROP TABLE cachorros;
CREATE TABLE cachorros (
id int not null auto_increment,
nome varchar(255) not null,
nascimento date,
sexo enum ('M','F'),
peso DECIMAL (6,2),
altura DECIMAL (3,2),
PRIMARY KEY (id) -- registro unico
) DEFAULT CHARSET = utf8mb4;

INSERT INTO cachorros (id,nome,nascimento,sexo,peso,altura) values 
(DEFAULT,'Ricardinho','2015-12-09','M','23.4','1.20'),
 (DEFAULT,'Valter','2018-08-11','M','21.5','0.90'),
(DEFAULT,'Gus','2015-12-09','F','17.9','0.87'),
(DEFAULT,'Choichou','2012-03-09','M','21.3','0.74');

DESCRIBE cachorros; 

SELECT * from cachorros;