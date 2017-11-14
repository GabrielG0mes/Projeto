package com.app.Projeto;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

@org.springframework.stereotype.Repository
public interface CarroDao extends CrudRepository<Carro, Long> {

	public Carro save(Carro carro);

	public List<Carro> findAll();

}
