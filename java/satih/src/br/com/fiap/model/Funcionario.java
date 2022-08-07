package br.com.fiap.model;

import br.com.fiap.enums.TipoFuncionario;

public class Funcionario {
	
	private long id;
	private String nome;
	private TipoFuncionario tipo;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoFuncionario getTipo() {
		return tipo;
	}
	public void setTipo(TipoFuncionario tipo) {
		this.tipo = tipo;
	}
	
	
}
