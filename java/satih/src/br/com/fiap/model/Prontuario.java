package br.com.fiap.model;

import java.time.LocalDateTime;

public class Prontuario {

	private long id;
	private LocalDateTime data;
	private String observacoes;
	private Triagem triagem;
	private Funcionario funcionario;
	private Paciente paciente;
	
	
	public Triagem getTriagem() {
		return triagem;
	}
	public void setTriagem(Triagem triagem) {
		this.triagem = triagem;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	
}
