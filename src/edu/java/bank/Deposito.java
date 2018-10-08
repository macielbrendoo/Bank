package edu.java.bank;

import java.sql.Date;

public class Deposito extends Transacao{

	public Deposito(double valor, Date data) {
		super(valor, data);
	}
	
	public boolean deposito (double valor) {
		return true;
	}

}
