package controller;

import java.sql.Connection;

import dao.ReservaDAO;
import factory.ConnectionFactory;
import modelo.Reserva;

public class ReservasController {

	private ReservaDAO reservaDAO;

	public ReservasController() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.reservaDAO = new ReservaDAO(connection);
	}

	public void salvar(Reserva reserva) {
		this.reservaDAO.salvar(reserva);
	}

	public List<Reserva> buscar() {
		return this.reservaDAO.buscar();
	}
}
