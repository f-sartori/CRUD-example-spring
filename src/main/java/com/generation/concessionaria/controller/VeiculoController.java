package com.generation.concessionaria.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generation.concessionaria.model.Veiculo;
import com.generation.concessionaria.service.VeiculoService;
import com.generation.concessionaria.service.impl.VeiculoServiceImpl;

@CrossOrigin("*")
@RestController
public class VeiculoController {

	VeiculoService veiculoService = new VeiculoServiceImpl();

	@GetMapping("/veiculo")
	public List<Veiculo> getAll() {
		return veiculoService.getAll();
	}

	@GetMapping("/veiculo/{id}")
	public ResponseEntity<Veiculo> getById(@PathVariable int id) {

		Veiculo veiculo = veiculoService.getById(id);
		if (veiculo == null)
			ResponseEntity.notFound();

		return ResponseEntity.ok(veiculo);
	}

	@PostMapping("/veiculo")
	public ResponseEntity<Veiculo> insert(@RequestBody Veiculo veiculo) {
		if (veiculo.getId() != 0)
			return ResponseEntity.badRequest().body(veiculo);

		veiculoService.insert(veiculo);
		return ResponseEntity.ok(veiculo);
	}

	@PutMapping("/veiculo")
	public Veiculo alterar(@RequestBody Veiculo veiculo) {
		veiculoService.update(veiculo);
		return veiculo;
	}
	
	@DeleteMapping("/veiculo/{id}")
	public void delete(@PathVariable int id) {
		veiculoService.delete(id);
	}

}
