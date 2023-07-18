CREATE DATABASE modulo6;
USE modulo6;

CREATE TABLE capacitacion (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(100) NOT NULL,
  detalle TEXT
);

CREATE TABLE usuario (
id INT PRIMARY KEY AUTO_INCREMENT,
nombre varchar(100) NOT NULL,
apellido varchar (100) NOT NULL,
direccion varchar (100) NOT NULL
);

INSERT INTO usuario (nombre, apellido, direccion)
VALUES ('Usuario 1', 'Apellido 1', 'Direccion 1'),
('Usuario 2','Apellido 2', 'Direccion 2'),
('Usuario 3', 'Apelldio 3', 'Direccion 3');


INSERT INTO capacitacion(nombre,detalle)
VALUES('Capacitacion 1', 'Detalle1'),
('Capacitacion 2', 'Detalle 2'),
('Capacitacion 3','Detalle 3');