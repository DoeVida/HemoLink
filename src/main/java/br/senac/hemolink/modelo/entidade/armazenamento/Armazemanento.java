package br.senac.hemolink.modelo.entidade.armazenamento;

import java.time.LocalDate;
import javax.persistence.*;
import br.senac.hemolink.modelo.entidade.usuario.hemocentro.Hemocentro;
import br.senac.hemolink.modelo.entidade.estoqueSangue.EstoqueSangue;

@Entity
@Table(name = "armazenamento")
public class Armazenamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_armazenamento")
	private int idArmazenamento;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "armazenamento_id")
	private EstoqueSangue[] estoqueSangue = new EstoqueSangue[8];

	@Column(name = "data_ultima_atualizacao")
	private LocalDate dataUltimaAtualizacao;

	@ManyToOne
	@JoinColumn(name = "hemocentro_id")
	private Hemocentro hemocentro;

	// Construtores
	public Armazenamento() {
	}

	public Armazenamento(int idArmazenamento, EstoqueSangue[] estoqueSangue, LocalDate dataUltimaAtualizacao,
			Hemocentro hemocentro) {
		this.idArmazenamento = idArmazenamento;
		this.estoqueSangue = estoqueSangue;
		this.dataUltimaAtualizacao = dataUltimaAtualizacao;
		this.hemocentro = hemocentro;
	}

	// Getters e Setters
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
