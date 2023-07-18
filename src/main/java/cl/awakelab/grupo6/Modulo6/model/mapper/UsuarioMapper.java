package cl.awakelab.grupo6.Modulo6.model.mapper;

import cl.awakelab.grupo6.Modulo6.model.dto.Usuario;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioMapper implements RowMapper<Usuario> {


    @Override
    public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
       return new Usuario( rs.getInt("id"),
                rs.getString("nombre"),
                rs.getString("apellido"),
                rs.getString("direccion"));
    }
}
