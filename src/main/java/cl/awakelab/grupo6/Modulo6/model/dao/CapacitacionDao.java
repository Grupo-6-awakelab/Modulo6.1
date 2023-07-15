package cl.awakelab.grupo6.Modulo6.model.dao;

import cl.awakelab.grupo6.Modulo6.model.dto.Capacitacion;
import cl.awakelab.grupo6.Modulo6.model.mapper.CapacitacionMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CapacitacionDao implements ICapacitacionDao{


    JdbcTemplate jdbcTemplate;

    public CapacitacionDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<Capacitacion> obtenerCapacitaciones() {
        return jdbcTemplate.query("select id, nombre, detalle from capacitacion", new CapacitacionMapper());
    }

    @Override
    public boolean crearCapacitacion(Capacitacion c) {
return false;
    }

    @Override
    public Capacitacion obtenerPorId(int id) {
        return jdbcTemplate.queryForObject("select id, nombre, detalle from capacitacion where id = ?",
                new Object[] { id }, new CapacitacionMapper());
    }

}
