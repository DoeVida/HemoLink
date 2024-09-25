package br.senac.hemolink.modelo.entidade.conquista;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Conquista")
public class Conquista implements Serializable {
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_conquista",nullable = false, unique = true)
	private int idConquista;

	@Column(name = "nome_conquista", length = 20, nullable = false, unique = false)	
	private String nomeConquista;

	@Column(name = "descricao_conquista", length = 100, nullable = false, unique = false)
	private String descricaoConquista;

	public Conquista () {

	}

	public Conquista (int idConquista, String nomeConquista, String descricaoConquista) {
		this.idConquista = idConquista;
		this.nomeConquista = nomeConquista;
		this.descricaoConquista = descricaoConquista;
	}

	public void setIdConquista (int idConquista) {
		this.idConquista = idConquista;
	}

	public int getIdConquista() {
		return idConquista;
	}

	public void setNomeConquista (String nomeConquista) {
		this.nomeConquista = nomeConquista;
	}
	
	public String getNomeConquista () {
		return nomeConquista;
	}

	public void setDescricaoConquista (String descricaoConquista) {
		this.descricaoConquista = descricaoConquista;
	}

	public String getDescricaoConquista (){
		return descricaoConquista;
	}
}