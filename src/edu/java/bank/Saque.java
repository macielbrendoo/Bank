package edu.java.bank;

import java.sql.Date;

public class Saque extends Transacao {

	public Saque(double valor, Date data) {
		super(valor, data);
	}

	public boolean saque (double valor) {
		
		return true;
	}
}
