package br.senac.hemolink.modelo.entidade.usuario;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.senac.hemolink.modelo.entidade.contato.Contato;
import br.senac.hemolink.modelo.entidade.papel.Papel;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table (name = "Usuario")
public abstract class Usuario implements Serializable  {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "nickname", length = 30, nullable = false)
	private String nickname;
	
	@Column(name = "nome", length = 45, nullable = false)
	private String nome;
	
	@Column(name = "senha", length = 45, nullable = false)
	private String senha;
	// 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_papel")
	private Papel papel;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_contato")
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
