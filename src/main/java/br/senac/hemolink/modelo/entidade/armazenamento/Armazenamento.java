package br.senac.hemolink.modelo.entidade.armazenamento;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.senac.hemolink.modelo.entidade.estoqueSangue.EstoqueSangue;
import br.senac.hemolink.modelo.entidade.usuario.hemocentro.Hemocentro;

@Entity
@Table(name = "armazenamento")
public class Armazenamento implements Serializable {

	private static final long serialVersionUID = -3368069000446318432L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_armazenamento", length = 200)
	private Long id;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "armazenamento", cascade = CascadeType.REMOVE)
	private List<EstoqueSangue> estoqueSangue;

	@Column(name = "data_ultima_atualizacao_armazenamento")
	private LocalDate dataUltimaAtualizacao;

	@ManyToOne
	@JoinColumn(name = "id_hemocentro", referencedColumnName = "id_usuario")
	private Hemocentro hemocentro;

	public Armazenamento() {
	}

	public Armazenamento(Long id, List<EstoqueSangue> estoqueSangue, LocalDate dataUltimaAtualizacao,
			Hemocentro hemocentro) {
		this.id = id;
		this.estoqueSangue = estoqueSangue;
		this.dataUltimaAtualizacao = dataUltimaAtualizacao;
		this.hemocentro = hemocentro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<EstoqueSangue> getEstoqueSangue() {
		return estoqueSangue;
	}

	public void setEstoqueSangue(List<EstoqueSangue> estoqueSangue) {
		this.estoqueSangue = estoqueSangue;
	}

	public LocalDate getDataUltimaAtualizacao() {
		return dataUltimaAtualizacao;
	}

	public void setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
		this.dataUltimaAtualizacao = dataUltimaAtualizacao;
	}

	public Hemocentro getHemocentro() {
		return hemocentro;
	}

	public void setHemocentro(Hemocentro hemocentro) {
		this.hemocentro = hemocentro;
	}
}