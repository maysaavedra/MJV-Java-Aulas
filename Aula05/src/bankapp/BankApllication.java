package bankapp;

import bankapp.model.Conta;
import bankapp.service.ContaService;

public class BankApllication {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		ContaService terminal = new ContaService();
		terminal.depositar(conta, 50.0);
		
		
		
		System.out.println(conta.getSaldo());

	}

}
