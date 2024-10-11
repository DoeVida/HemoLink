package br.senac.hemolink.modelo.entidade.contato;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contato")
public class Contato implements Serializable {

	private static final long serialVersionUID = -6703668574524890052L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_contato")
	private Long idContato;

	@Column(name = "email_contato", length = 50, nullable = false, unique = false)
	private String email;

	@Column(name = "telefone_contato", length = 15, nullable = false, unique = false)
	private String telefone;

	public Contato() {
	}

	public Contato(Long idContato, String email, String telefone) {
		this.idContato = idContato;
		this.email = email;
		this.telefone = telefone;
	}

	public void setIdContato(Long idContato) {
		this.idContato = idContato;
	}

	public Long getIdContato() {
		return idContato;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefone() {
		return telefone;
	}
}
