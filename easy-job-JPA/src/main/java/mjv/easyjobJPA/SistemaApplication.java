package mjv.easyjobJPA;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import mjv.easyjobJPA.model.Cadastro;
import mjv.easyjobJPA.repository.CadastroRepository;

@Component
public class SistemaApplication implements CommandLineRunner {
	
	
	@Autowired
	private CadastroRepository repository;
	
	
	@Override
	public void run(String... args) throws Exception {
		String nome ="Camila";
		Cadastro usuario = new Cadastro();
		usuario.setNome(nome);
		usuario.setAniversario(LocalDate.of(2020, 01, 15));
		
		
		boolean exists = repository.existsByNome(nome);
		if(exists)
			System.out.println("Já existe esse nome na base de dados");
		else
			repository.save(usuario);
		
	}

}
