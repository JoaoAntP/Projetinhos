select * from cursos
where nome like 'P%';

select * from cursos
where nome like '%a';

select * from cursos
where nome not like '%a%';

update cursos set nome  = 'PáOO' where idcurso = 5;
update cursos set nome  = 'Java'where idcurso = 5;

select * from cursos
where nome like 'Ph%p';

select * from cursos
where nome like 'P_t%';

select * from gafanhotos
where nome like '%_Silva%';

select distinct nacionalidade from gafanhotos
order by nacionalidade;

select count(*) from cursos where carga >40;
select count(nome) from cursos where carga >40;

select max(carga) from cursos;

select max(totaulas) from cursos where ano = '2022';

select min(totaulas) from cursos where ano = '2022';
select min(totaulas) from cursos where ano = '2022';

select min(totaulas) from cursos;

select * from cursos where ano = '2016';


SELECT nome FROM cursos WHERE ano = 2021 AND totaulas = (
    SELECT MIN(totaulas)
    FROM cursos
    WHERE ano = 2021
  );

select sum(totaulas) from cursos;

select avg(totaulas)from cursos;


SELECT * FROM gafanhotos WHERE sexo = 'F';
SELECT * FROM gafanhotos WHERE nascimento BETWEEN '2000-01-01' AND '2015-12-31';
SELECT * FROM gafanhotos WHERE sexo = 'M' AND prof = 'Programador';
SELECT * FROM gafanhotos WHERE nacionalidade = 'Brasil' AND sexo = 'F' AND nome LIKE '%J%';
SELECT nome, nacionalidade FROM gafanhotos WHERE sexo = "M" AND nacionalidade <> 'Brasil' AND peso < 100;
SELECT MAX(altura) FROM gafanhotos WHERE sexo = 'M' AND nacionalidade = 'Brasil';
SELECT AVG(peso) FROM gafanhotos WHERE sexo = 'M';
SELECT MIN(peso) FROM gafanhotos WHERE sexo = 'F' AND nacionalidade <> 'Brasil' AND nascimento BETWEEN '1990-01-01' AND '2000-12-31';
SELECT COUNT(*) FROM gafanhotos WHERE altura > 1.90;