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
	
	try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
		pstm.setDate(1, reserva.getDataEntreda());
		pstm.setDate(2,reserva.getDataSaida());
		pstm.setString(3, reserva.getValor());
		pstm.setString(4, reserva.getFormaPagamento());
		
		pstm.executeUpdate();
		
		try(ResultSet rst = pstm.getGeneratedKeys()){
			while (rst.next()) {
				reserva.setId(rst.getInt(1));
			}
		}
	}catch (SQLException e) {
		throw new RuntimeException(e);
	}
}
public List<Reserva> buscar() {
	// TODO Auto-generated method stub
	return null;
}


}
