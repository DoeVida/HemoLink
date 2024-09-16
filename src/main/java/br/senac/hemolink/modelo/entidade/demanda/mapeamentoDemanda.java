package br.senac.hemolink.modelo.entidade.demanda;

import javax.persistence.*;
import br.senac.hemolink.modelo.enumeracao.TipoSanguineo;
import br.senac.hemolink.modelo.enumeracao.Capacidade;

@Entity
@Table(name = "demanda")
public class mapeamentoDemanda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_sanguineo", nullable = false)
	private TipoSanguineo tipoSanguineo;

	@Enumerated(EnumType.STRING)
	@Column(name = "capacidade", nullable = false)
	private Capacidade capacidade;

	@Column(name = "quantidade_litros", nullable = false)
	private double quantidadeLitros;

	public mapeamentoDemanda() {
	}

	public mapeamentoDemanda(int id, TipoSanguineo tipoSanguineo, Capacidade capacidade, double quantidadeLitros) {
		this.id = id;
		this.tipoSanguineo = tipoSanguineo;
		this.capacidade = capacidade;
		this.quantidadeLitros = quantidadeLitros;
	}

	// Getters e Setters

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

public double getQuantidadeLitros()
