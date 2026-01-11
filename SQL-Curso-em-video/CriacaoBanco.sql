create database cadastro
default character set utf8
collate utf8_unicode_ci;

create table pessoas (
id int not null auto_increment,
nome varchar(30) not null,
nascimento date,
sexo enum('M','F'),
peso decimal(5,2),
altura decimal(3,2),
nacionalidade varchar(20) DEFAULT 'Brasil',
primary key(id)
) DEFAULT CHARSET = utf8;


drop database cadastro;