package cl.awakelab.grupo6.Modulo6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crearcapacitacion")
public class CrearCapacitacionController {

    @GetMapping
    public String crearCapacitacion(){
        return "crearcapacitacion";
    }
}