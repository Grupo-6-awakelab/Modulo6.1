package cl.awakelab.grupo6.Modulo6.model.dao;

import cl.awakelab.grupo6.Modulo6.model.dto.Capacitacion;

import java.util.List;

public interface ICapacitacionDao {

    List<Capacitacion> obtenerCapacitaciones();
    boolean crearCapacitacion(Capacitacion c);



}
