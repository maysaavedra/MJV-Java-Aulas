package mjv.easyjobJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mjv.easyjobJPA.model.Cadastro;
import mjv.easyjobJPA.repository.CadastroRepository;

@RestController
@RequestMapping("/cadastros")
public class CadastroController {
	
	@Autowired
	private CadastroRepository  repository;
	
	@GetMapping
	public List<Cadastro> GetCadastros(){
		return repository.findAll();
		
	}
	

}
