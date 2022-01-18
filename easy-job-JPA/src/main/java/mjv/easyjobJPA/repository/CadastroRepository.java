package mjv.easyjobJPA.repository;

import mjv.easyjobJPA.model.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroRepository extends JpaRepository<Cadastro, Integer>{
	boolean existsByNome(String nome);
}
