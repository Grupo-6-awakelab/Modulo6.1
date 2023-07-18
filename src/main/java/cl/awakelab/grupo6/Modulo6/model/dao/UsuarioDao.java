package cl.awakelab.grupo6.Modulo6.model.dao;

import cl.awakelab.grupo6.Modulo6.model.dto.Usuario;
import cl.awakelab.grupo6.Modulo6.model.mapper.CapacitacionMapper;
import cl.awakelab.grupo6.Modulo6.model.mapper.UsuarioMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsuarioDao implements IUsuarioDao{

    JdbcTemplate jdbcTemplate;

    public UsuarioDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Usuario> ListarUsuarios() {
        return jdbcTemplate.query("select id, nombre, apellido, direccion from usuario", new UsuarioMapper());
    }
}
