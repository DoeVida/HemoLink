package br.senac.hemolink.modelo.entidade.usuario;

public class Usuario {
	
	private String nome;
	private String senha;
	private Papel papel;
	private Contato contato;
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome () {
		return this.nome;
	}
	
	public void setSenha (String senha) {
		this.senha =  senha;
	}
	
	public String getSenha () {
		return this.senha;
	}
	
	public void setPapel (String papel) {
		this.papel = new Papel(papel);
	}
	
	public Papel getPapel () {
		return this.papel;
	}
	
	public void setContato (String contato) {
		this.contato = new Contato(contato);
	}
	
	public Contato getContato () {
		return this.contato;
	}
 
}
