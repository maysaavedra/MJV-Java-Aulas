package bankapp.model;

import java.util.List;
import java.util.ArrayList;





public class Conta {
	private double saldo;
	private List<Historico> historicos = new ArrayList<Historico>();

	

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public List<Historico> getHistoricos() {
		
		return historicos;
	}

	
	
	
}
