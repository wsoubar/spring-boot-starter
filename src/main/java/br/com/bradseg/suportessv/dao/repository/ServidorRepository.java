package br.com.bradseg.suportessv.dao.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.bradseg.suportessv.model.Servidor;

public interface ServidorRepository extends CrudRepository<Servidor, Integer> {

	@Query("SELECT s FROM Servidor s ORDER BY s.ambiente, s.nome")
	public List<Servidor> findAllOrderAmbienteNome();

	@Query("SELECT s FROM Servidor s WHERE s.ambiente = ?1 ORDER BY s.nome")
	public List<Servidor> findAllByAmbiente(String ambiente);

	@Query("SELECT s FROM Servidor s WHERE s.ambiente = ?1 ORDER BY s.nome")
	public Map<String, Servidor> getxpto();

}
