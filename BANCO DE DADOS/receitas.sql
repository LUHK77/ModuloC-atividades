CREATE DATABASE Receitas
DEFAULT CHARACTER SET UTF8MB4
DEFAULT COLLATE UTF8MB4_GENERAL_CI;

use receitas;

DROP database Receitas;

DROP table receitas;
CREATE TABLE receitas (
id int not null auto_increment,
nome varchar(60),
ingredientes text,
preparo text,
tempo time,
primary key(id)
) DEFAULT CHARSET = utf8mb4;

insert into receitas values 
(default,'Marido Gelado', 
'2 caixinhas de leite condensado, 3 caixinhas de creme de leite,2 barras de chocolate 
meio amargo, um maracuja,2 limao',
'05:00',26);
insert into receitas values 
(default, 'brownie','Manteiga – 115g (ou 1/2 xícara), derretida
Açúcar – 200g (ou 1 xícara)
Ovos – 2 grandes
Extrato de baunilha – 1 colher de chá
Cacau em pó – 50g (ou 1/2 xícara), sem açúcar
Farinha de trigo – 65g (ou 1/2 xícara)
Sal – 1/4 colher de chá
Fermento em pó – 1/4 colher de chá (opcional, para brownies mais fofos)
Chocolate em pedaços – 100g (ou 1/2 xícara), opcional para adicionar textura e sabor', 
'01:00',18),
(default,'Pao de alho', 
'Pão francês ou ciabatta – 1 unidade (ou 1 baguete, cortada ao meio)
Manteiga – 100g (ou 1/2 xícara), em temperatura ambiente
Alho – 4-6 dentes, picados ou amassados
Queijo parmesão ralado – 50g (ou 1/2 xícara), opcional para uma camada crocante
Sal – a gosto
Pimenta-do-reino – a gosto
Azeite de oliva 1-2 colheres de sopa (opcional, para um toque extra de sabor)', '00:30',12);

select * from receitas;

alter table receitas
add column valor_estimado decimal(6.2);

alter table receitas
drop column preparo;


