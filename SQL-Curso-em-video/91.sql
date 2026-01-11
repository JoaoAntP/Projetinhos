select carga from cursos group by carga;
select carga, count(*) from cursos group by carga;

select * from cursos where totaulas = 40;

select * from cursos where totaulas >20;

select carga, totaulas from cursos where totaulas = 30;

select carga, count(nome) from cursos where totaulas = 30 group by carga;

select*from cursos where totaulas = 30;

select*from cursos;

select ano, count(*) from cursos 
group by ano 
having count(ano) <= 2016
order by count(*) asc;/*So funciona se o atriibuto usado no grop for o mesmo que no having
*/

select ano, count(*) 
from cursos 
where totaulas<20
 and ano  <= 2016
group by ano
order by count(*) asc;

select ano, count(*) 
from cursos 
where totaulas<20
 group by ano
 having count(ano) <= 2016 
 order by count(*) asc;
 
 select avg(carga) from cursos;
 
 select carga, count(*) from cursos
 where ano > 2013
 group by carga 
 having carga > ( select avg(carga) from cursos);
 
 SELECT prof, COUNT(*) FROM gafanhotos GROUP BY prof;

select sexo, count(nascimento) from gafanhotos
where nascimento > '2005-01-01'
group by sexo
order by count(nascimento) asc;

select nacionalidade, count(nacionalidade) from gafanhotos
where nacionalidade != 'Brasil'
group by nacionalidade
having count(nacionalidade) > 1
order by count(nacionalidade) asc;

SELECT altura, peso, COUNT(*)
FROM gafanhotos
WHERE peso > 80
GROUP BY altura, peso
HAVING altura > (SELECT AVG(altura) FROM gafanhotos)
ORDER BY altura;
