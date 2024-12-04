package br.senac.hemolink.modelo.entidade.papel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "papel")
public class Papel implements Serializable {

	private static final long serialVersionUID = 6932779876314475336L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_papel")
	private Long idPapel;

	@Column(name = "nome_papel", length = 15, nullable = false, unique = true)
	private String nome;

	public Papel() {
	}

	public Papel(String nome) {
		this.nome = nome;
	}

	public Papel(Long id, String nome) {
		this.idPapel = id;
		this.nome = nome;
	}

	public Long getIdPapel() {
		return idPapel;
	}

	public void setIdPapel(Long id) {
		this.idPapel = id;
	}

	public String getNomePapel() {
		return nome;
	}

	public void setNomePapel(String nome) {
		this.nome = nome;
	}
}
