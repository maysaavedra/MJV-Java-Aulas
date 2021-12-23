package bankapp.service;

import bankapp.model.*;

public class ContaService {	
	
	public void depositar(Conta conta, double valorDepositado){
		
		conta.setSaldo(conta.getSaldo() + valorDepositado);
		conta.getHistoricos().add( new Historico("20/12", valorDepositado, "Deposito"));
		
	}
	
	public void sacar(Conta conta, double valorDepositado){
		
		conta.setSaldo(conta.getSaldo() - valorDepositado);
		conta.getHistoricos().add( new Historico("20/12", valorDepositado, "Saque"));
		
	}
	 
	public void exibirExtrato(Conta conta) {
		System.out.println("Exibindo historico da conta xxx");
		for (Historico hst: conta.getHistoricos()) {
			System.out.println(hst.getData() + "-" + hst.getValor() + "-" + hst.getTipoOperacao() );
		}
	}
}
