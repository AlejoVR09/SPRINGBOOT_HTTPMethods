create database vollmed;
use vollmed;


select * from medicos;
select * from pacientes;

insert into medicos(nombre, email,documento,especialidad,calle,distrito,complemento,numero,ciudad,telefono) 
values("Alejo","alejo1@gmail.com","123456","CARDIOLOGIA","calle 2","distrito 2","b","1","cali","1326897069"),
("Bernando","alejo3@gmail.com","223456","GINECOLOGIA","calle 2","distrito 2","b","1","cali","1326897069") ;

insert into pacientes(nombre, email,documento,calle,distrito,complemento,numero,ciudad) 
values("Alejo","alejo1@gmail.com","123456","calle 2","distrito 2","b","1","cali"),
("blejo1","aleo1@gmail.com","223456","calle 2","distrito 2","b","1","cali"),
("Viejo","alej1@gmail.com","323456","calle 2","distrito 2","b","1","cali")
;

delete from flyway_schema_history where success = 0;
delete from medicos where id=7;