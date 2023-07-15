CREATE DATABASE modulo6;
USE modulo6;

CREATE TABLE capacitacion (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(100) NOT NULL,
  detalle TEXT
);

INSERT INTO capacitacion(nombre,detalle)
VALUES('Capacitacion 1', 'Detalle1'),
('Capacitacion 2', 'Detalle 2'),
('Capacitacion 3','Detalle 3');