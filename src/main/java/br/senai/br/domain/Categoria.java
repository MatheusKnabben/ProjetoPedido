package br.senai.br.domain;

public class Categoria {
//Atributos: id e nome
	private Integer id;
	private String nome;
	
	public Categoria() {
		
	}
	
	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}