package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import modelo.Reserva;

public class ReservaDAO {
	private Connection connection;

	public ReservaDAO(Connection connection) {
		this.connection = connection;
	}

	public void salvar(Reserva reserva) {
		String sql = "INSERT INTO reservas (data_entrada, data_saida, valor, formaPagamento) VALUES (?,?,?,?)";

		try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			pstm.setString(1, reserva.getDataEntrada());
			pstm.setString(2, reserva.getDataSaida());
			pstm.setDouble(3, reserva.getValor());
			pstm.setString(4, reserva.getFormaDePagamento());

			pstm.executeUpdate();

			try (ResultSet rst = pstm.getGeneratedKeys()) {
				while (rst.next()) {
					reserva.setId(rst.getInt(1));

				}
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void deletar(Integer id) {
		try {
			String sql = "DELETE FROM reservas WHERE id = ?";
			try (PreparedStatement pstm = this.connection.prepareStatement(sql)) {
				pstm.setInt(1, id);
				pstm.executeUpdate();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

public void alterar(Reserva reserva) {
	try {
		String sql ="UPDATE reservas SET data_entrada = ?, data_saida = ?, valor = ?, formaPagamento = ? WHERE id = ? ";
		try (PreparedStatement pstm = this.connection.prepareStatement(sql)){
			pstm.setString(1, reserva.getDataEntrada());
			pstm.setString(2,reserva.getDataSaida());
			pstm.setDouble(3, reserva.getValor());
			pstm.setString(4, reserva.getFormaDePagamento());
			pstm.setInt(5, reserva.getId());
			pstm.executeUpdate();
		}
	}catch(SQLException e) {
		throw new RuntimeException(e);
}
}
private void buscar(List<Reserva>reservas, PreparedStatement preparedStatement) {
	try( ResultSet result = preparedStatement.getResultSet()){
		while(result.next()) {
			Reserva reserva = new Reserva(result.getInt(1), result.getString(2) result.getString(3), result.getDouble(5), result.getString(5));
			reservas.add(reserva);
		}
	}catch(SQLException e) {
		throw new RuntimeException(e);
}
}
}
