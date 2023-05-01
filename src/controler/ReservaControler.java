package controler;

import java.sql.Connection;
import java.util.List;

import dao.ReservaDAO;
import factory.ConnectionFactory;
import modelo.Reserva;

public class ReservaControler {
	private ReservaDAO reservaDAO;

	public ReservaControler() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.reservaDAO = new ReservaDAO(connection);
	}

	public void reserva(Reserva reserva) {
		this.reservaDAO.reserva(reserva);
	}

	public List<Reserva> listar() {
		return this.reservaDAO.listar();
	}

	public void deletar(Integer id) {
		this.reservaDAO.deletar(id);
	}

	public void alterar(Reserva reserva) {
		this.reservaDAO.alterar(reserva);
	}

	public List<Reserva> pesquisar(String pesquisa) {
		return this.reservaDAO.pesquisar(pesquisa);
	}
}
