package bankappi;

import bankapp.model.Conta;
import bankapp.service.ContaService;

public class BankApplication {

	public static void main(String[] args) {
		
		Conta conta = new Conta();		
		ContaService terminal = new ContaService();
		
		terminal.depositar(conta, 100);			
		terminal.sacar(conta, 10);
		terminal.sacar(conta, 12);
		terminal.sacar(conta, 15);
	
		terminal.exibirExtrato(conta);
		System.out.println("Saldo da Conta:" + conta.getSaldo());
		
		
		
		
		
		

	}

}