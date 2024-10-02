package br.senac.hemolink.modelo.entidade.papel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Papel")
public class Papel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_papel", nullable = false, unique = true)
	private int idPapel;

	@Column(name = "nome_papel", length = 15, nullable = false, unique = true)
	private String nomePapel;

	public Papel() {}

	public Papel(int idPapel, String nomePapel) {
		this.idPapel = idPapel;
		this.nomePapel = nomePapel;
	}

	public int getIdPapel() {
		return idPapel;
	}

	public void setIdPapel(int idPapel) {
		this.idPapel = idPapel;
	}

	public String getNomePapel() {
		return nomePapel;
	}

	public void setNomePapel(String nomePapel) {
		this.nomePapel = nomePapel;
	}
}
