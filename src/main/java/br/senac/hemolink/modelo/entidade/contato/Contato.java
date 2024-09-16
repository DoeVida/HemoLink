package br.senac.hemolink.modelo.entidade.contato;

import java.io.Serializable;
import javax.persistence.*;
import br.senac.hemolink.modelo.entidade.estoqueSangue.Entity;
import br.senac.hemolink.modelo.entidade.estoqueSangue.GeneratedValue;
import br.senac.hemolink.modelo.entidade.estoqueSangue.Id;
import br.senac.hemolink.modelo.entidade.estoqueSangue.Table;

@Entity
@Table (name = "contato")

public class Contato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_contato", nullable = false, unique = true)
	private int idContato;
	
	@Column(name = "email", length = 45, nullable = false, unique = false)
	private String email;
	
	@Column(name = "telefone", length = 12, nullable = false, unique = false)
	private String telefone;
	
	public void Contato () {
	
	}
	
	public void Contato (int idContato, String email, String telefone) {
		this.idContato = idContato;
		this.email = email;
		this.telefone = telefone;
	}
	
	public void setIdContato (int idContato) {
		this.idContato = idContato;
	}
	
	public int getIdContato () {
		return this.idContato;
	}
	
	public void setEmail (String email) {
		this.email = email;
	}
	
	public String getEmail () {
		return this.email;
	}
	
	public void setTelefone (String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone () {
		return this.telefone;
	}
}
