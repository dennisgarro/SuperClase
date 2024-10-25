create database estructuras
use estructuras 
create table estudiantes
(
id int identity(1,1) primary key,
cedula int,
nombres varchar(30),
apellidos varchar(30),
correo varchar(40)
)

insert into estudiantes( cedula,nombres,apellidos,correo)
values(71228300,'dennis arlex','garro agudelo','sistemasitm@hotmail.com')

insert into estudiantes( cedula,nombres,apellidos,correo)
values(71228301,'harold','bona parte','harold@hotmail.com')

select * from estudiantes