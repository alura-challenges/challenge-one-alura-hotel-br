package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.Reserva;

public class ReservaDAO {
	private Connection connection;

	public ReservaDAO(Connection connection) {
		this.connection = connection;
	}

	public List<Reserva> listar() {
		try {
			List<Reserva> reservas = new ArrayList<>();
			String sql = "SELECT * FROM RESERVAS";
			try (PreparedStatement pstm = this.connection.prepareStatement(sql)) {
				pstm.execute();
				resultEmReserva(reservas, pstm);
			}
			return reservas;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Reserva> pesquisar(String pesquisa) {
		try {
			String sql = "SELECT * FROM RESERVAS WHERE ID = ?";
			List<Reserva> reservas = new ArrayList<>();
			try (PreparedStatement pstm = this.connection.prepareStatement(sql)) {
				pstm.setString(1, pesquisa);
				pstm.execute();
				resultEmReserva(reservas, pstm);
			}
			return reservas;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public void reserva(Reserva reserva) {
		String sql = "INSERT INTO RESERVAS (DATA_ENTRADA, DATA_SAIDA, VALOR, FORMA_PAGAMENTO) VALUES (?, ?, ?, ?);";
		try (PreparedStatement pstm = this.connection.prepareStatement(sql,
				Statement.RETURN_GENERATED_KEYS)) {
			pstm.setString(1, reserva.getDataEntrada());
			pstm.setString(2, reserva.getDataSaida());
			pstm.setDouble(3, reserva.getValor());
			pstm.setString(4, reserva.getFormaDePagamento());
			pstm.executeUpdate();

			try (ResultSet resultSet = pstm.getGeneratedKeys()) {
				while (resultSet.next()) {
					reserva.setId(resultSet.getInt(1));
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
			String sql = "UPDATE reservas SET data_entrada = ?, data_saida = ?, valor = ?, formaPagamento = ? WHERE id = ? ";
			try (PreparedStatement pstm = this.connection.prepareStatement(sql)) {
				pstm.setString(1, reserva.getDataEntrada());
				pstm.setString(2, reserva.getDataSaida());
				pstm.setDouble(3, reserva.getValor());
				pstm.setString(4, reserva.getFormaDePagamento());
				pstm.setInt(5, reserva.getId());
				pstm.executeUpdate();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	private void resultEmReserva(List<Reserva> reservas, PreparedStatement preparedStatement) {
		try (ResultSet result = preparedStatement.getResultSet()) {
			while (result.next()) {
				Reserva reserva = new Reserva(result.getInt(1), result.getString(2), result.getString(3),
						result.getDouble(4), result.getString(5));
				reservas.add(reserva);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
