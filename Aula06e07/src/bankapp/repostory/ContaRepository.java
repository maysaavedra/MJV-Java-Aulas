package bankapp.repostory;

import java.util.Set;
import java.util.HashSet;

import bankapp.model.Conta;

public class ContaRepository {
	private Set <Conta> contas = new HashSet<Conta>();
	
	
	
	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}
//	public void imprimirContas() {
//		for(int i=0; i<contas.length; i++) {
//			//toda vez que chegar no final, antes de repedir vai para o terceiro bloco
//			Conta contAtual = contas [i];
//			System.out.println(contAtual);
//						
//		}
//	}
	public Set <Conta> getContas() {
		return contas;
	}
	
}
