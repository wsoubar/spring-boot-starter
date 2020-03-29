package br.com.bradseg.suportessv.dao.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.bradseg.suportessv.dao.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
