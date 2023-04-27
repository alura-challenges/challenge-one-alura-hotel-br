package dao;

import java.sql.Connection;

public class HospedeDAO {
	private  Connection connection;

    public HospedeDAO(Connection connection) {
        this.connection = connection;
    }
    
    public List<Hospede> buscar() {
        List<Hospede> buscarHospedes = new ArrayList<>();
        String sql = "SELECT id_hospede, nome, sobrenome, fecha_nacimiento, nacionalidad, telefono, id_reserva "
                + "FROM huespedes";
}
