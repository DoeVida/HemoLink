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
	private Long id;

	@Column(name = "email_contato", length = 50, nullable = false, unique = false)
	private String email;

	@Column(name = "telefone_contato", length = 15, nullable = false, unique = false)
	private String telefone;

	public Contato() { }

	public Contato(Long id, String email, String telefone) {
		this.id = id;
		this.email = email;
		this.telefone = telefone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
	
}