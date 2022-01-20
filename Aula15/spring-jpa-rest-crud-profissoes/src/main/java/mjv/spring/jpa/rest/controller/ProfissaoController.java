package mjv.spring.jpa.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mjv.spring.jpa.rest.model.Profissao;
import mjv.spring.jpa.rest.repository.ProfissaoRepository;

@RestController
@RequestMapping("/profissao")
public class ProfissaoController {
	
	@Autowired
	private ProfissaoRepository repository;

	
	@GetMapping
	public List<Profissao> listarProfissao() {
		return repository.findAll();
	}

	@GetMapping(path = "/{id}")
	public Optional<Profissao> buscar(@PathVariable("id") Integer id){
		repository.existsById(id);
		return repository.findById(id);
    }
			
	@GetMapping("/nome/{nome}")
	public List<Profissao> buscar(@PathVariable("nome") String nome){
		return repository.findByNome(nome);			
	}
	@DeleteMapping(path = "/{id}")
	public void alterar(@PathVariable("id") Integer id) {// pegadinha
		repository.deleteById(id);
	}
	// GET: select
	// POST: insert
	// PUT: update
	// DELETE: delete
}
