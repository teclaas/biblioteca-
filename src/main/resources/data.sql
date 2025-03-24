--Datos para carga inicial de la base de datos

--Para giis.demo.tkrun:


INSERT INTO libro(ISBN,titulo,autor,edicion) VALUES

2598,"LOS Pilares de la tierra", "Ken follet",2);

insert into socio(numSocio,FechaNacimiento,nombreCompleto, Trabajador, masInfo) values
(10201412, "24-02-78, Carlos Garcia Perez",0, "mas informacion del socio");

INSERT INTO Prestamo(Libro,Socio,fechadevencimiento,fechaDevolucion) VALUES 
(2598,1201412,0104020,8294489);

