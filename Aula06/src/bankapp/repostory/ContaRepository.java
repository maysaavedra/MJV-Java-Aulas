package bankapp.repostory;

import bankapp.model.Conta;

public class ContaRepository {
	private Conta [] contas = new Conta[5];
	private int contadorContas=0;
	
	
	public void adicionarConta(Conta conta) {
		contas [contadorContas] = conta;
		contadorContas = contadorContas+1;
	}
	public void imprimirContas() {
		for(int i=0; i<contas.length; i++) {
			//toda vez que chegar no final, antes de repedir vai para o terceiro bloco
			Conta contAtual = contas [i];
			System.out.println(contAtual);
						
		}
	}
	
}
