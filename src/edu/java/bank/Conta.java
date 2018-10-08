package edu.java.bank;

import java.util.Scanner;

public class Conta {
	private double saldo;
	private String numero;
	private String senha;
	private Transacao[] historico;
	Scanner scan = new Scanner(System.in);

	public boolean efetuarSaque() {
		return true;
	}

	public void efetuarDeposito() {

	}

	public void efetuarPagamento() {

	}

	public String getNumero() {
		return numero;
	}
	

}
