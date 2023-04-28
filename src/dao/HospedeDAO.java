package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.Hospede;

public class HospedeDAO {
	private  Connection connection;

    public HospedeDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void salvar(Hospede hospede) {
		String sql = "INSERT INTO hospedes (nome, sobrenome, data_nascimento, nacionalidade, telefone, id_reserva) VALUES (?, ?, ?, ?, ?, ?)";
		try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			pstm.setString(1, hospede.getNome());
			pstm.setString(2, hospede.getSobrenome());
			pstm.setString(1, hospede.getDataNascimento());
			pstm.setString(1, hospede.getNacionalidade());
			pstm.setString(1, hospede.getTelefone());
			pstm.setInt(1, hospede.getIdReserva());
			
			pstm.executeUpdate();
			try (ResultSet result = pstm.getGeneratedKeys()) {
				while (result.next()) {
					hospede.setId(result.getInt(1));
				}
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
}
}
