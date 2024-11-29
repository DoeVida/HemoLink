package br.senac.hemolink.modelo.entidade.conquista;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.senac.hemolink.modelo.entidade.aquisicaoConquista.AquisicaoConquista;

@Entity
@Table(name = "conquista")
public class Conquista implements Serializable {

	private static final long serialVersionUID = -5949909897149816799L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_conquista")
	private Long id;

	@Column(name = "nome_conquista", length = 35, nullable = false, unique = true)
	private String nome;

	@Column(name = "descricao_conquista", length = 100, nullable = false, unique = true)
	private String descricao;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "conquista", cascade = CascadeType.REMOVE)
	private List<AquisicaoConquista> aquisicaoConquista;

	public Conquista() {
	}

	public Conquista(Long idConquista, String nomeConquista, String descricaoConquista,
			List<AquisicaoConquista> aquisicoesConquista) {
		this.id = idConquista;
		this.nome = nomeConquista;
		this.descricao = descricaoConquista;
		this.aquisicaoConquista = aquisicoesConquista;
	}

	public List<AquisicaoConquista> getAquisicaoConquista() {
		return aquisicaoConquista;
	}

	public void setAquisicaoConquista(List<AquisicaoConquista> aquisicaoConquista) {
		this.aquisicaoConquista = aquisicaoConquista;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}