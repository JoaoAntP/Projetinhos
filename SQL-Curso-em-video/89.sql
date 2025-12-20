select*from gafanhotos;

select nome, carga, ano from cursos
order by ano, nome;

select nome, carga, descricao, ano from cursos
where ano <= '2016'
order by nome, ano;

select nome, ano from cursos
where ano between 2013 and 2017
order by ano desc;

select nome, descricao, ano from cursos
where ano in(2014, 2016)
order by ano, nome;

select * from cursos
where carga > 35 and totaulas <=30
order by ano;