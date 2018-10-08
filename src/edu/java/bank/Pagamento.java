package edu.java.bank;

import java.sql.Date;

public class Pagamento extends Transacao {

	private String boleto;

	public Pagamento(double valor, Date data) {
		super(valor, data);
	}
	
	public boolean pagamento (String boleto, double valor) {
		this.boleto = boleto;
		return true;
	}

}
