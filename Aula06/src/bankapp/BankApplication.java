package bankapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import bankapp.model.Conta;
import bankapp.repostory.ContaRepository;
import bankapp.service.ContaService;

public class BankApplication {

	public static void main(String[] args) {
		exemplo4();
		

	}
	
	private static void exemplo4() {
		List<String>nomes= new ArrayList();
		nomes.add("Glayson");
		nomes.add("Mayara");
		nomes.add("Diego");
		nomes.add("Lucas");
		nomes.add("Aline");
		
		Collections.sort(nomes);
		for(String nome : nomes) {
			System.out.println(nome);
				
			}
		
	}
	private static void exemplo3() {
		ContaRepository repository = new ContaRepository();
		Conta contaMayara = new Conta();
		Conta contaIrineu = new Conta();
		
		contaMayara.setNomeCorrentista("Mayara");
		contaMayara.setNumeroConta("6551-x");
		repository.adicionarConta(contaMayara);
		
		contaIrineu.setNomeCorrentista("Irineu");
		contaIrineu.setNumeroConta("12345-x");
		repository.adicionarConta(contaIrineu);
		
		//o Set é um array mesm
		Set<Conta> contas = repository.getContas();
		for(Conta conta : contas) {
		System.out.println(conta);
			
		}
			
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
		
//		repository.imprimirContas();
			
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


