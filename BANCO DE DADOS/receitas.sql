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
'bata uma caixa de leite condensado com uma lata de creme de leite e com o suco do maracuja por cerca de 3 minutos numa liquidificador, depois reserve essa musse numa travessa, e coloque na geladeira por cerca de 2 horas, 
depois derreta o chocolate e adicione o creme de leite aos poucos e va mexendo, adicione na travessa depois que a musse ja estiver consistente  
repita o processo da musse porem ao inves de usar maracuja use os limoes, depois coloque em cima do chocolate e bote na geladeira por cerca de mais 2h, por adicione raspas de limao por cima do musse',
'05:00'),
(default, 'brownie','Manteiga – 115g (ou 1/2 xícara), derretida
Açúcar – 200g (ou 1 xícara)
Ovos – 2 grandes
Extrato de baunilha – 1 colher de chá
Cacau em pó – 50g (ou 1/2 xícara), sem açúcar
Farinha de trigo – 65g (ou 1/2 xícara)
Sal – 1/4 colher de chá
Fermento em pó – 1/4 colher de chá (opcional, para brownies mais fofos)
Chocolate em pedaços – 100g (ou 1/2 xícara), opcional para adicionar textura e sabor', 
'Preaqueça o forno a 180°C e unte uma forma com manteiga ou forre com papel manteiga.
Misture a manteiga derretida e o açúcar em uma tigela grande. Adicione os ovos e o extrato de baunilha, misturando bem.
Peneire o cacau em pó, a farinha, o sal e o fermento (se estiver usando) e adicione à mistura. Misture até incorporar, sem exagerar.
Adicione o chocolate em pedaços, se desejar, e misture até distribuir uniformemente.
Despeje a massa na forma preparada e alise a superfície com uma espátula.
Asse por 20-25 minutos. Faça o teste do palito para verificar se está no ponto: ele deve sair com algumas migalhas úmidas.
Deixe esfriar na forma antes de cortar em quadrados e servir.', '01:00'),
(default,'Pao de alho', 
'Pão francês ou ciabatta – 1 unidade (ou 1 baguete, cortada ao meio)
Manteiga – 100g (ou 1/2 xícara), em temperatura ambiente
Alho – 4-6 dentes, picados ou amassados
Queijo parmesão ralado – 50g (ou 1/2 xícara), opcional para uma camada crocante
Sal – a gosto
Pimenta-do-reino – a gosto
Azeite de oliva 1-2 colheres de sopa (opcional, para um toque extra de sabor)','Pré-aqueça o forno a 200°C.

Misture a manteiga amolecida com o alho picado e a salsinha picada em uma tigela até ficar bem combinado.

Corte o pão francês ou ciabatta ao meio, no sentido do comprimento.

Espalhe a mistura de manteiga e alho uniformemente sobre as metades do pão.

Coloque o pão em uma assadeira e leve ao forno.

Asse por 10-15 minutos, ou até que o pão esteja crocante e dourado nas bordas.

Retire do forno e deixe esfriar um pouco antes de servir.', '00:30');

select * from receitas;