package cl.awakelab.grupo6.Modulo6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/capacitacion")
public class CapacitacionController {

    @GetMapping
    public String listarCapacitacion() {
        return "administrarcapacitacion";
    }
    @GetMapping("/crear")
    public String crearCapacitacion() {
        return "crearcapacitacion";
    }



}
