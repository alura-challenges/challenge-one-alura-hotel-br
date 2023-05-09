package controler;

import java.sql.Connection;

import dao.UsuarioDAO;
import factory.ConnectionFactory;


public class UsuarioControler {
	private UsuarioDAO  usuarioDAO;

	public UsuarioControler(String usuario, String password) {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.usuarioDAO = new UsuarioDAO (connection, usuario, password);
	}

	public boolean login() {
		return this.usuarioDAO.login();
	}
}
