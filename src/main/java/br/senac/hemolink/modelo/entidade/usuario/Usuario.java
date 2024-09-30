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
<<<<<<< HEAD
@Table(name = "Usuario")

public abstract class Usuario implements Serializable {

=======
@Table (name = "Usuario")
public abstract class Usuario implements Serializable  {
	
>>>>>>> 6c7b6552ae442b22a79311b967ae058796a39e54
	private static final long serialVersionUID = 1L;

	@Id
<<<<<<< HEAD
	@Column(name = "apelido", length = 30, nullable = false)
	private String apelido;

	@Column(name = "nome", length = 45, nullable = false)a
	private String nome;

	@Column(name = "senha", length = 45, nullable = false)
	private String senha;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_papel")
	private Papel papel;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_contato")
	private Contato contato;

	public Usuario() {}

	public Usuario(String apelido, String nome, String senha, Papel papel, Contato contato) {
		this.apelido = apelido;
=======
	@Column(name = "nickname_usuario", length = 25, nullable = false)
	private String nickname;
	
	@Column(name = "nome_usuario", length = 50, nullable = false)
	private String nome;
	
	@Column(name = "senha_usuario", length = 35, nullable = false)
	private String senha;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_papel")
	private Papel papel;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_contato")
	private Contato contato;
	
	public Usuario () {
		
	}
	
	public Usuario (String nome, String senha, Papel papel, Contato contato) {
>>>>>>> 6c7b6552ae442b22a79311b967ae058796a39e54
		this.nome = nome;
		this.senha = senha;
		this.papel = papel;
		this.contato = contato;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Papel getPapel() {
		return papel;
	}

	public void setPapel(Papel papel) {
		this.papel = papel;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

}
