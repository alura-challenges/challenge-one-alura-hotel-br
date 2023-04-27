package modelo;

public class Hospede {
	private Integer id;
	private String nome;
	private String sobrenome;
	private String dataNascimento;
	private String nacionalidade;
	private String telefone;
	private Integer idReserva;

	public Hospede(String nome, String sobrenome, String dataNascimento, String nacionalidade, String telefone,
			Integer idReserva) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.nacionalidade = nacionalidade;
		this.telefone = telefone;
		this.idReserva = idReserva;
	}

	public Hospede(Integer id, String nome, String sobrenome, String dataNascimento, String nacionalidade,
			String telefone, Integer idReserva) {
		this(nome, sobrenome, dataNascimento, nacionalidade, telefone, idReserva);
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public String getSobrenome() {
		return this.sobrenome;
	}

	public String getDataNascimento() {
		return this.dataNascimento;
	}

	public String getNacionalidade() {
		return this.nacionalidade;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public Integer getIdReserva() {
		return this.idReserva;
	}

	@Override
	public String toString() {
		return "[Hospede: Nome: " + this.nome + ", Sobrenome: " + this.sobrenome + "]";
	}
}
