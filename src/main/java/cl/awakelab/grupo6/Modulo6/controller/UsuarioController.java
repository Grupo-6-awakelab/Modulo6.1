package cl.awakelab.grupo6.Modulo6.controller;

import cl.awakelab.grupo6.Modulo6.model.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    private UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @GetMapping
    public String listarUsuarios(Model model) {
        model.addAttribute("usuarios", service.ListarUsuarios());
        return "usuarios";
    }
}
