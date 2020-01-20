package com.generation.concessionaria.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.generation.concessionaria.model.Veiculo;
import com.generation.concessionaria.service.VeiculoService;

public class VeiculoServiceImpl implements VeiculoService {

	static List<Veiculo> veiculos = new ArrayList<Veiculo>();
	private static int inc = 0;

	@Override
	public Veiculo insert(Veiculo veiculo) {

		inc++;
		veiculo.setId(inc);
		this.veiculos.add(veiculo);
		return veiculo;
	}

	@Override
	public Veiculo update(Veiculo veiculo) {

		Veiculo aux = getById(veiculo.getId());
		if (aux != null) {
			aux.setMarca(veiculo.getMarca());
			aux.setNome(veiculo.getNome());
			aux.setPreco(veiculo.getPreco());
		}
		return aux;
	}

	@Override
	public void delete(Veiculo veiculo) {

		delete(veiculo.getId());
	}

	@Override
	public void delete(int id) {

		for (Iterator<Veiculo> i = veiculos.iterator(); i.hasNext();) {
			Veiculo veiculoDelete = i.next();

			if (veiculoDelete.getId() == id) {
				i.remove();

			}

		}

	}

	@Override
	public Veiculo getById(int id) {

		for (Veiculo veiculo : veiculos) {
			if (veiculo.getId() == id) {
				return veiculo;
			}
		}
		return null;
	}

	@Override
	public List<Veiculo> getAll() {

		return veiculos;
	}

}
