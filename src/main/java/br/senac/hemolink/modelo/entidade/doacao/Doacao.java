package br.senac.hemolink.modelo.entidade.doacao;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.senac.hemolink.modelo.entidade.usuario.doador.Doador;
import br.senac.hemolink.modelo.entidade.usuario.hemocentro.Hemocentro;
import br.senac.hemolink.modelo.enumeracao.TipoSanguineo;
import br.senac.hemolink.modelo.enumeracao.Status;

@Entity
@Table(name = "Doacao")
public class Doacao implements Serializable {

	private static final long serialVersionUID = -3011186404724313934L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_doacao")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_doador", referencedColumnName = "id_usuario")
	private Doador doador;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_hemocentro", referencedColumnName = "id_usuario")
	private Hemocentro hemocentro;

	@Column(name = "data_doacao", nullable = false)
	private LocalDate dataDoacao;

	@Column(name = "hora_doacao", nullable = false)
	private LocalTime horaDoacao;

	@Column(name = "tipo_sanguineo_doacao")
	@Enumerated(EnumType.STRING)
	private TipoSanguineo tipoSanguineo;

	@Column(name = "status_doacao")
	@Enumerated(EnumType.STRING)
	private Status status;

	public Doacao() {
	}

	public Doacao(Doador doador, Hemocentro hemocentro, LocalDate dataDoacao, LocalTime horaDoacao, Status status,
			TipoSanguineo tipoSanguineo) {
		this.doador = doador;
		this.hemocentro = hemocentro;
		this.dataDoacao = dataDoacao;
		this.horaDoacao = horaDoacao;
		this.status = status;
		this.tipoSanguineo = tipoSanguineo;
	}

	public TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

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
