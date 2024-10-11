package br.senac.hemolink.modelo.entidade.conquista;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "conquista")
public class Conquista implements Serializable {

	private static final long serialVersionUID = -5949909897149816799L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_conquista")
	private Long idConquista;

	@Column(name = "nome_conquista", length = 35, nullable = false, unique = true)
	private String nomeConquista;

	@Column(name = "descricao_conquista", length = 100, nullable = false, unique = true)
	private String descricaoConquista;

	public Conquista() {
	}

	public Conquista(Long idConquista, String nomeConquista, String descricaoConquista) {
		this.idConquista = idConquista;
		this.nomeConquista = nomeConquista;
		this.descricaoConquista = descricaoConquista;
	}

	public void setIdConquista(Long idConquista) {
		this.idConquista = idConquista;
	}

	public Long getIdConquista() {
		return idConquista;
	}

	public void setNomeConquista(String nomeConquista) {
		this.nomeConquista = nomeConquista;
	}

	public String getNomeConquista() {
		return nomeConquista;
	}

	public void setDescricaoConquista(String descricaoConquista) {
		this.descricaoConquista = descricaoConquista;
	}

	public String getDescricaoConquista() {
		return descricaoConquista;
	}
}