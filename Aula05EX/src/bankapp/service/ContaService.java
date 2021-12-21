package bankapp.service;

import bankapp.model.Conta;

public class ContaService {
	
	//+2 a 3 recursos que poderia realizar com uma conta
	
	public void depositar(Conta conta, double valorDepositado){
		
		conta.setSaldo(conta.getSaldo() + valorDepositado);
		
	}
	public void sacar(Conta conta, double valorSacado, double chequeEspecial) {
		
		if (conta.getSaldo() + chequeEspecial < valorSacado ) {
			System.out.println("Saldo insuficiente\n"+"Seu saldo é de:"+ conta.getSaldo() +"\n" + "Seu limite do cheque Especial é:"+ conta.getChequeEspecial());
		}else {
			if (conta.getSaldo() < valorSacado) {
				conta.setChequeEspecial(conta.getSaldo() + conta.getChequeEspecial() - valorSacado);
				conta.setSaldo(0.0);
			}else {
				conta.setSaldo(conta.getSaldo()-valorSacado);
			}
		}
		
		
	}
	 public void tranferir(Conta conta, Conta contaDestino, double valortransferido) {
		 if (conta.getSaldo() + conta.getChequeEspecial() < valortransferido){
				System.out.println("Saldo insuficiente\n"+"Seu saldo é de:"+ conta.getSaldo() +"\n" + "Seu limite do cheque Especial é:"+ conta.getChequeEspecial());
			}else {
				if (conta.getSaldo() < valortransferido) {
					conta.setChequeEspecial(conta.getSaldo() - valortransferido);
					conta.setSaldo(0.0);
					contaDestino.setSaldo(conta.getSaldo()+ valortransferido);
					
				}else {
					conta.setSaldo(conta.getSaldo() - valortransferido);
					contaDestino.setSaldo(conta.getSaldo()+ valortransferido);
				}
			}
	 }

}
