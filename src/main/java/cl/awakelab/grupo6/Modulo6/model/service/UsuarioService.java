package cl.awakelab.grupo6.Modulo6.model.service;

import cl.awakelab.grupo6.Modulo6.model.dao.IUsuarioDao;
import cl.awakelab.grupo6.Modulo6.model.dto.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    IUsuarioDao dao;

    public UsuarioService(IUsuarioDao dao) {
        this.dao = dao;
    }

    public List<Usuario> ListarUsuarios() {
        return dao.ListarUsuarios();
    }
}
