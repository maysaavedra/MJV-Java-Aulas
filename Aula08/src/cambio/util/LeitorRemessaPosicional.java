package cambio.util;

import java.util.List;

import cambio.model.Transacao;

public class LeitorRemessaPosicional extends LeitorRemessa{
	public List<Transacao> converter (String caminhoArquivo){
		System.out.println("IMPLEMENTACAO POSICIONAL");
		
		List<String> conteudos = ler(caminhoArquivo);
		
		
		return null;
	}
}
