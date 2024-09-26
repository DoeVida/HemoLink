package br.senac.hemolink.modelo.entidade.doacao;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.senac.hemolink.modelo.entidade.usuario.doador.Doador;
import br.senac.hemolink.modelo.entidade.usuario.hemocentro.Hemocentro;

@Entity
@Table(name = "Doacao")
public class Doacao implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JoinColumn (name = "id_doacao", nullable = false, unique = true)
	private int idDoacao;

	@OneToOne
	@JoinColumn(name = "id_doador", nullable = false, unique = true)
	private Doador doador;

	@OneToOne
	@JoinColumn(name = "id_hemocentro", nullable = false, unique = true)
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

	public int getIdDoacao() {
		return idDoacao;
	}

	public void setId(int idDoacao) {
		this.idDoacao = idDoacao;
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
