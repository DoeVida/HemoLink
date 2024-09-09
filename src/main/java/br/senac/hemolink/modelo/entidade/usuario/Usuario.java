package br.senac.hemolink.modelo.entidade.usuario;

import br.senac.hemolink.modelo.entidade.papel.Papel;
import br.senac.hemolink.modelo.entidade.contato.Contato;

abstract public class Usuario {
	
	private String nome;
	private String senha;
	private Papel papel;
	private Contato contato;
	
	public void Usuario () {
		
	}
	
	public void Usuario (String nome, String senha, Papel papel, Contato contato) {
		this.nome = nome;
		this.senha = senha;
		this.papel = papel;
		this.contato = contato;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome () {
		return this.nome;
	}
	
	public void setSenha (String senha) {
		this.senha = senha;
	}
	
	public String getSenha () {
		return this.senha;
	}
	
	public void setPapel (Papel papel) {
		this.papel = papel;
	}
	
	public Papel getPapel () {
		return this.papel;
	}
	
	public void setContato (Contato contato) {
		this.contato = contato;
	}
	
	public Contato getContato () {
		return this.contato;
	}
}
