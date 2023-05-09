package controler;

import java.sql.Connection;
import java.util.List;

import dao.HospedeDAO;
import factory.ConnectionFactory;
import modelo.Hospede;

public class HospedeControler {
	private HospedeDAO hospedeDAO;

	public HospedeControler() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.hospedeDAO = new HospedeDAO(connection);
	}

	public void salvar(Hospede hospede) {
		this.hospedeDAO.salvar(hospede);
	}

	public List<Hospede> listar() {
		return this.hospedeDAO.listar();
	}

	public void deletar(Integer id) {
		this.hospedeDAO.deletar(id);
	}

	public void alterar(Hospede hospede) {
		this.hospedeDAO.alterar(hospede);
	}

	public List<Hospede> pesquisar(String pesquisa) {
		return this.hospedeDAO.pesquisar(pesquisa);
	}
}
