package br.senac.hemolink.modelo.entidade.usuario;
 
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
 
import br.senac.hemolink.modelo.entidade.contato.Contato;
import br.senac.hemolink.modelo.entidade.papel.Papel;
 
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "usuario")
public abstract class Usuario implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	@Id
	@Column(name = "apelido_usuario", length = 30, nullable = false)
	private String apelido;
 
	@Column(name = "nome_usuario", length = 45, nullable = false)
	private String nome;
 
	@Column(name = "senha_usuario", length = 45, nullable = false)
	private String senha;
 
	@OneToOne
	@JoinColumn(name = "id_papel")
	private Papel papel;
 
	@OneToOne
	@JoinColumn(name = "id_contato")
	private Contato contato;
 
	public Usuario() {
		
	}
 
	public Usuario(String apelido, String nome, String senha, Papel papel, Contato contato) {
		this.apelido = apelido;
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