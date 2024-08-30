package br.senac.hemolink.modelo.entidade;

public class Usuario {
	
	private String nome;
	private String senha;
	private Papel papel;
	private Contato contato;
	
	public Usuario () {
		
	}
	
	public Usuario (String nome, String senha, Papel papel, Contato contato) {
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
	
	public void setPapel (String papel) {
		this.papel = new Papel(papel);
	}
	
	public Papel getPapel () {
		return this.papel;
	}
	
	public void setContato (String contato) {
		this.contato = new Contato(contato);
	}
	
	public Contato () {
		return this.contato;
	}
}
