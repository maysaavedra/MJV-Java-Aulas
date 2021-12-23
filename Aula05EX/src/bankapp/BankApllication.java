package bankapp;



import bankapp.model.Conta;
import bankapp.service.ContaService;

public class BankApllication {


	public static void main(String[] args) {
		
		Conta conta = new Conta();
		Conta contaDestino = new Conta();
		ContaService terminal = new ContaService();
		
		terminal.depositar(conta, 100);
		System.out.println("Saldo da Conta:" + conta.getSaldo());
		terminal.depositar(conta, 10);
		System.out.println("Saldo da Conta:" + conta.getSaldo());		
		terminal.sacar(conta, 50, 10);
		System.out.println("Saldo da Conta:" + conta.getSaldo());
		terminal.tranferir(conta, contaDestino, 40);
		System.out.println("Saldo da Conta:" + conta.getSaldo()+ " Saldo da Conta Destino: " + contaDestino.getSaldo());
		terminal.sacar(conta, 80, 10);
		System.out.println("Saldo da Conta:" + conta.getSaldo());		
		
		
		
		
		
		

	}

}
