package br.senac.hemolink.modelo.entidade.doacao;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.*;
import br.senac.hemolink.modelo.entidade.hemocentro.Hemocentro;
import br.senac.hemolink.modelo.entidade.doador.Doador;

@Entity
@Table(name = "doacao")
public class Doacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "doador_id", nullable = false)
	private Doador doador;

	@ManyToOne
	@JoinColumn(name = "hemocentro_id", nullable = false)
	private Hemocentro hemocentro;

	@Column(name = "data_doacao", nullable = false)
	private LocalDate dataDoacao;

	@Column(name = "hora_doacao", nullable = false)
	private LocalTime horaDoacao;

	public Doacao() {
	}

	public Doacao(Doador doador, Hemocentro hemocentro, LocalDate dataDoacao, LocalTime horaDoacao) {
		this.doador = doador;
		this.hemocentro = hemocentro;
		this.dataDoacao = dataDoacao;
		this.horaDoacao = horaDoacao;
	}

	// Getters e Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Doador getDoador() {
		return doador;
	}

	public void setDoador(Doador doador) {
		this.doador = doador;
	}

	public Hemocentro getHemocentro() {
		return hemocentro;
	}

	public void setHemocentro(Hemocentro hemocentro) {
		this.hemocentro = hemocentro;
	}

	public LocalDate getDataDoacao() {
		return dataDoacao;
	}

	public void setDataDoacao(LocalDate dataDoacao) {
		this.dataDoacao = dataDoacao;
	}

	public LocalTime getHoraDoacao() {
		return horaDoacao;
	}

	public void setHoraDoacao(LocalTime horaDoacao) {
		this.horaDoacao = horaDoacao;
	}
}
