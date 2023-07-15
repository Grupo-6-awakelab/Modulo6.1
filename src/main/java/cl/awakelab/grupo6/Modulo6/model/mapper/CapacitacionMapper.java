package cl.awakelab.grupo6.Modulo6.model.mapper;
import cl.awakelab.grupo6.Modulo6.model.dto.Capacitacion;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CapacitacionMapper implements RowMapper<Capacitacion> {

    @Override
    public Capacitacion mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Capacitacion(
                rs.getInt("id"),
                rs.getString("nombre"),
                rs.getString("detalle"));
    }
}
