package cl.awakelab.grupo6.Modulo6.controller;

import cl.awakelab.grupo6.Modulo6.model.dto.Capacitacion;
import cl.awakelab.grupo6.Modulo6.model.service.CapacitacionService;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/capacitacion")
public class CapacitacionController {
    private CapacitacionService service;

    public CapacitacionController(CapacitacionService service) {
        this.service = service;
    }
    Log logger = LogFactory.getLog(CapacitacionController.class);





    @GetMapping
    public String listarCapacitacion(Model model) {


        model.addAttribute("capacitaciones", service.obtenerCapacitaciones());

        return "administrarcapacitacion";
    }

    @GetMapping("/crear")
    public String crearCapacitacion() {

        return "crearcapacitacion";

    }

    @PostMapping("/crear")
    public String guardarCapacitacion(@ModelAttribute Capacitacion c) {

        logger.info(c.toString());



        boolean ok = service.crearCapacitacion(c);
        if (ok) {
            return "redirect:/capacitacion";
        }
        return null;

    }


}
