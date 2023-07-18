package cl.awakelab.grupo6.Modulo6.model.dao;

import cl.awakelab.grupo6.Modulo6.model.dto.Usuario;

import java.util.List;

public interface IUsuarioDao {
    List<Usuario> ListarUsuarios();
}
