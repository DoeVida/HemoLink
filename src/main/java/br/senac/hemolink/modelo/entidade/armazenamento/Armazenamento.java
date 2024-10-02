package br.senac.hemolink.modelo.entidade.armazenamento;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.senac.hemolink.modelo.entidade.estoqueSangue.EstoqueSangue;
import br.senac.hemolink.modelo.entidade.usuario.hemocentro.Hemocentro;

@Entity
@Table(name = "Armazenamento")
public class Armazenamento implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_armazenamento")
	private int idArmazenamento;

	@OneToMany 
	@JoinColumn(name = "estoqueSangue_armazenamento")
	private List<EstoqueSangue> estoqueSangue = new ArrayList<>();

	@Column(name = "dataUltimaAtualizacao_armazenamento")
	private LocalDate dataUltimaAtualizacao;

	@ManyToOne
	@JoinColumn(name = "id_hemocentro")
	private Hemocentro hemocentro;

	public Armazenamento() {}

	public Armazenamento(int idArmazenamento, EstoqueSangue[] estoqueSangue, LocalDate dataUltimaAtualizacao,Hemocentro hemocentro) {
		this.idArmazenamento = idArmazenamento;
		this.estoqueSangue = estoqueSangue;
		this.dataUltimaAtualizacao = dataUltimaAtualizacao;
		this.hemocentro = hemocentro;
	}

	public int getIdArmazenamento() {
		return idArmazenamento;
	}

	public void setIdArmazenamento(int idArmazenamento) {
		this.idArmazenamento = idArmazenamento;
	}

	public EstoqueSangue[] getEstoqueSangue() {
		return estoqueSangue;
	}

	public void setEstoqueSangue(EstoqueSangue[] estoqueSangue) {
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
