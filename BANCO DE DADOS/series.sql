CREATE DATABASE streaming
DEFAULT CHARACTER SET UTF8MB4
DEFAULT COLLATE UTF8MB4_GENERAL_CI;

USE streaming;

drop table series;
create table series(
id int auto_increment,
titulo varchar(60),
primary key(id)
)default charset = utf8mb4;

insert into series values
(default,'twin peaks'),
(default,'Fallout');




