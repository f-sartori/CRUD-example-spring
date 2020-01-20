package com.generation.concessionaria.model;

public class Veiculo {
	
	private int id;
	private String nome;
	private double preco;
	private String marca;
	
	public Veiculo() {
		super();
		
	}
	
	public Veiculo( String nome, double preco, String marca) {
		super();
		
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	
	
}
