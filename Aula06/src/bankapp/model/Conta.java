package bankapp.model;

import java.util.List;
import java.util.ArrayList;





public class Conta {
	private double saldo;
	
	private List<Historico> historicos = new ArrayList<Historico>();
	private String nomeCorrentista;
	private String numeroConta;
	
	

	public String getNomeCorrentista() {
		return nomeCorrentista;
	}

	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public List<Historico> getHistoricos() {
		
		return historicos;
	}

	
	@Override
	public String toString() {
		return "Conta [nomeCorrentista=" + nomeCorrentista + ", numeroConta=" + numeroConta + "]";
	}
	
}
