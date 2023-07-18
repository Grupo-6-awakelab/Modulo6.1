package cl.awakelab.grupo6.Modulo6.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contacto")
public class ContactoController {

    @GetMapping
    public String contacto() {

        return "contacto";
    }

    @PostMapping("/enviar")
    public String enviar(HttpServletRequest request) {
        String nombre = request.getParameter("nombre");
        String correo = request.getParameter("correo");
        String asunto = request.getParameter("asunto");
        String mensaje = request.getParameter("mensaje");

        System.out.println("Nombre: " + nombre+ "\nCorreo: " + correo + "\nAsunto: " +asunto +" \nMensaje: " +mensaje);
        return "index";
    }

}
