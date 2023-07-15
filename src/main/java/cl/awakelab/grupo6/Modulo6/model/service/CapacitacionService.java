package cl.awakelab.grupo6.Modulo6.model.service;

import cl.awakelab.grupo6.Modulo6.model.dao.ICapacitacionDao;
import cl.awakelab.grupo6.Modulo6.model.dto.Capacitacion;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CapacitacionService {
    ICapacitacionDao dao;


    public CapacitacionService(ICapacitacionDao dao) {
        this.dao = dao;
    }

    public List<Capacitacion> obtenerCapacitaciones(){
        return dao.obtenerCapacitaciones();
    }

    public boolean crearCapacitacion(Capacitacion c){
        return dao.crearCapacitacion(c);

    }

    public Capacitacion obtenerPorId(int id){
        return dao.obtenerPorId(id);
    }
}
