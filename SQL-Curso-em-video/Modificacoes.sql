alter table pessoas
drop column profissao;

alter table pessoas
drop column codigo;

alter table pessoas
drop column religiao;
---------------------------------------------------------
alter table pessoas
add column profissao varchar(10) after nome;

alter table pessoas
add column codigo int first;

alter table pessoas
add column religiao varchar(10) not null default '';

alter table pessoas
change column religiao exp varchar(1) not null default '';

alter table pessoas
rename to gafanhotos;
-----------------------------------------------------------
alter table pessoas
modify column profissao varchar(20);
-----------------------------------------------------------

desc pessoas;
select* from pessoas;
