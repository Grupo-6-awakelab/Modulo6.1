package cl.awakelab.grupo6.Modulo6.model.dao;

import cl.awakelab.grupo6.Modulo6.model.dto.Capacitacion;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CapacitacionDao implements ICapacitacionDao{

    private List<Capacitacion> list = new ArrayList<Capacitacion>();

    public CapacitacionDao() {
        list.add(new Capacitacion(1,"Capacitacion 1", "Detalle 1"));
        list.add(new Capacitacion(2,"Capacitacion 2", "Detalle 2"));
        list.add(new Capacitacion(3,"Capacitacion 3", "Detalle 3"));

    }
    @Override
    public List<Capacitacion> obtenerCapacitaciones() {
        return list;
    }

    @Override
    public boolean crearCapacitacion(Capacitacion c) {

        int id = c.getId();
        String name = c.getName();
        String detalle = c.getDetalle();
        return list.add(new Capacitacion(id, name, detalle));
    }

    @Override
    public Capacitacion obtenerPorId(int id) {
        return list.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }

}
