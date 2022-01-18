package cambio;

import java.util.List;

import cambio.model.Transacao;
import cambio.util.LeitorRemessa;
import cambio.util.LeitorRemessaDelimitado;
import cambio.util.LeitorRemessaPosicional;
import cambio.util.TransacaoPrint;

public class cambioApp {

	public static void main(String[] args) {
		LeitorRemessa leitor=null;
		String caminho = "C:\\estudo\\remessas\\POSREMESSA.csv";
		
		if(caminho.contains("DEL"))
			leitor = new LeitorRemessaDelimitado();
		else
			leitor = new LeitorRemessaPosicional();
		
		List<Transacao> transacoes = leitor.converter(caminho);
	
		TransacaoPrint printer = new TransacaoPrint();
		printer.imprimir(transacoes.get(0));

	}

}
