package br.senac.hemolink.modelo.entidade.demanda;

import br.senac.hemolink.modelo.enumeracao.TipoSanguineo;
import br.senac.hemolink.modelo.enumeracao.Capacidade;

public class Demanda {
	
	private int id;
	private TipoSanguineo tipoSanguineo;
	private Capacidade capacidade;
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
