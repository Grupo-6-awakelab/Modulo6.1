package cl.awakelab.grupo6.Modulo6.controller;

import cl.awakelab.grupo6.Modulo6.model.dto.Capacitacion;
import cl.awakelab.grupo6.Modulo6.model.service.CapacitacionService;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
      logger.info('Se han listado las capacitaciones');
      return "administrarcapacitacion";
    }


    @GetMapping("/editar/{capacitacionId}")
    public String editarCapacitacion(@PathVariable int capacitacionId, Model model) {
        model.addAttribute("isNew", false);
        model.addAttribute("capacitacion", service.obtenerPorId(capacitacionId));
        return "crearcapacitacion";
    }

    @GetMapping("/crear")
    public String crearCapacitacion(Model model) {
        model.addAttribute("isNew", true);
        model.addAttribute("capacitacion", new Capacitacion());
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
