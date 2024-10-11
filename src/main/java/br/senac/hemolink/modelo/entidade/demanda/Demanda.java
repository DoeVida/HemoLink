package br.senac.hemolink.modelo.entidade.demanda;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.senac.hemolink.modelo.entidade.usuario.hemocentro.Hemocentro;
import br.senac.hemolink.modelo.enumeracao.Capacidade;
import br.senac.hemolink.modelo.enumeracao.TipoSanguineo;

@Entity
@Table(name = "demanda")
public class Demanda implements Serializable {

	private static final long serialVersionUID = -9017790866819682275L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_demanda")
	private Long id;

	@Column(name = "tipo_sanguineo_demanda")
	@Enumerated(EnumType.STRING)
	private TipoSanguineo tipoSanguineo;

	@ManyToOne
	@JoinColumn(name = "capacidade_demanda", nullable = false)
	private Capacidade capacidade;

	@Column(name = "quantidade_litros_demanda", nullable = false)
	private double quantidadeLitros;

	@ManyToOne
	@JoinColumn(name = "hemocentro_demanda", nullable = false)
	private Hemocentro hemocentro;

	public Demanda() {
	}

	public Demanda(Long id, TipoSanguineo tipoSanguineo, Capacidade capacidade, double quantidadeLitros,
			Hemocentro hemocentro) {
		this.id = id;
		this.tipoSanguineo = tipoSanguineo;
		this.capacidade = capacidade;
		this.quantidadeLitros = quantidadeLitros;
		this.hemocentro = hemocentro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Hemocentro getHemocentro() {
		return hemocentro;
	}

	public void setHemocentro(Hemocentro hemocentro) {
		this.hemocentro = hemocentro;
	}

	public TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public Capacidade getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Capacidade capacidade) {
		this.capacidade = capacidade;
	}

	public double getQuantidadeLitros() {
		return quantidadeLitros;
	}

	public void setQuantidadeLitros(double quantidadeLitros) {
		this.quantidadeLitros = quantidadeLitros;
	}
}