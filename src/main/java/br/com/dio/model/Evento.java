package br.com.dio.model;

import java.io.Serializable;

public class Evento implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String orgnizacao;
	private String local;
	private String data;
	private String horario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getOrgnizacao() {
		return orgnizacao;
	}
	public void setOrgnizacao(String orgnizacao) {
		this.orgnizacao = orgnizacao;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
}
