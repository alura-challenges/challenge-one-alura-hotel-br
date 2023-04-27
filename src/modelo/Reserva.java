package modelo;

import java.sql.Date;

public class Reserva {

	private Integer id;
	
	private Date dataEntreda;
	
	private Date dataSaida;
	
	private String valor;
	
	private String formaPagamento;
	
	public Reserva() {
		
	}

	public Reserva(Integer id, Date dataEntreda, Date dataSaida, String valor, String formaPagamento) {
		super();
		this.id = id;
		this.dataEntreda = dataEntreda;
		this.dataSaida = dataSaida;
		this.valor = valor;
		this.formaPagamento = formaPagamento;
	}

	public Reserva(Date dataEntreda, Date dataSaida, String valor, String formaPagamento) {
		super();
		this.dataEntreda = dataEntreda;
		this.dataSaida = dataSaida;
		this.valor = valor;
		this.formaPagamento = formaPagamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataEntreda() {
		return dataEntreda;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public String getValor() {
		return valor;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}
	
	

}
