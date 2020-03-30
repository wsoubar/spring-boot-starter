package br.com.bradseg.suportessv.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.bradseg.suportessv.dao.entity.Servidor;
import br.com.bradseg.suportessv.dao.repository.ServidorRepository;

/**
 * UserDaoImpl
 */
@Component
public class ServidorDaoImpl {

    @Autowired
    private ServidorRepository serverRepository;

    public String addServidor(Servidor s) {
    	serverRepository.save(s);
        return "sucesso";
    }
    
    /**
     * Exclui o servidor com o ID enviado
     * @param id ID do servidor a ser removido
     */
    public void deleteServidor(Integer id) {
    	serverRepository.deleteById(id);
    }
    
    @Deprecated
    public List<Servidor> getAllServidores() {
    	List<Servidor> result = new ArrayList<>();
    	Iterator<Servidor> it = serverRepository.findAll().iterator();
    	it.forEachRemaining(result::add);
        return result;
    }
    
    /**
     * retorna todos os servidores ordenados por ambente e nome
     * @return
     */
    public List<Servidor> getAll() {
    	return serverRepository.findAllOrderAmbienteNome();
    }
    
    public List<Servidor> getAllByAmbiente(String ambiente) {
    	return serverRepository.findAllByAmbiente(ambiente);
    }

    
    
}