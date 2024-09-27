package br.senac.hemolink.modelo.entidade.demanda;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.senac.hemolink.modelo.enumeracao.Capacidade;
import br.senac.hemolink.modelo.enumeracao.TipoSanguineo;

@Entity
@Table(name = "demanda")
public class Demanda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "tipo_sanguineo_id", nullable = false)
	private TipoSanguineo tipoSanguineo;
	
	@ManyToOne
	@JoinColumn(name = "capacidade_id", nullable = false)
	private Capacidade capacidade;
	
	@Column(name = "quantidade_litros", precision = 10, scale = 2, columnDefinition = "DOUBLE DEFAULT 0.0")
	private double quantidadeLitros;

	public Demanda() {

	}

	public Demanda(int id, TipoSanguineo tipoSanguineo, Capacidade capacidade, double quantidadeLitros) {
		super();
		this.id = id;
		this.tipoSanguineo = tipoSanguineo;
		this.capacidade = capacidade;
		this.quantidadeLitros = quantidadeLitros;
	}

	public int getIdDemanda() {
		return id;
	}

	public void setIdDemanda(int idDemanda) {
		this.id = idDemanda;
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
