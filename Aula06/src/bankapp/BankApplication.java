package bankapp;

import bankapp.model.Conta;
import bankapp.repostory.ContaRepository;
import bankapp.service.ContaService;

public class BankApplication {

	public static void main(String[] args) {
		exemplo2();
		

	}
	private static void exemplo2() {
		ContaRepository repository = new ContaRepository();
		Conta contaMayara = new Conta();
		Conta contaIrineu = new Conta();
		
		contaMayara.setNomeCorrentista("Mayara");
		contaMayara.setNumeroConta("6551-x");
		repository.adicionarConta(contaMayara);
		
		contaIrineu.setNomeCorrentista("Irineu");
		contaIrineu.setNumeroConta("12345-x");
		repository.adicionarConta(contaIrineu);
		
		repository.imprimirContas();
			
	}

	private static void exemplo1() {
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


