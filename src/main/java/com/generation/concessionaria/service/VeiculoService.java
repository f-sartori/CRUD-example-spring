package com.generation.concessionaria.service;

import java.util.List;

import com.generation.concessionaria.model.Veiculo;

public interface VeiculoService {
	
	Veiculo insert(Veiculo veiculo);
	
	Veiculo update(Veiculo veiculo);
	
	void delete(Veiculo veiculo);
	
	void delete(int id);
	
	Veiculo getById(int id);
	
	List<Veiculo> getAll();
	
}
