package br.senac.hemolink.modelo.entidade.usuario.hemocentro;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.senac.hemolink.modelo.entidade.demanda.Demanda;
import br.senac.hemolink.modelo.entidade.estoqueSangue.EstoqueSangue;
import br.senac.hemolink.modelo.entidade.campanha.Campanha;
import br.senac.hemolink.modelo.entidade.doacao.Doacao;

class Hemocentro extends Usuario {
	private String cnpj;
	private List<Demanda> demanda;
	private List<Estoque> estoque;
	private List<Campanha> campanha;
	private LocalTime horarioInicio;
	private Duration horarioDuracao;
	private List<Doacao> doacoes;

	public Hemocentro() {

	}

	public Hemocentro(String cnpj, List<Demanda> demanda, List<Estoque> estoque, List<Campanha> campanha,
			LocalTime horarioInicio, Duration horarioDuracao, List<Doacao> doacoes) {

		this.cnpj = cnpj;
		this.demanda = demanda;
		this.estoque = estoque;
		this.campanha = campanha;
		this.horarioInicio = horarioInicio;
		this.horarioDuracao = horarioDuracao;
		this.doacoes = doacoes;
	}
	//

	// Get Set
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Demanda> getDemanda() {
		return demanda;
	}

	public void setDemanda(List<Demanda> demanda) {
		this.demanda = demanda;
	}

	public List<Estoque> getEstoque() {
		return estoque;
	}

	public void setEstoque(List<Estoque> estoque) {
		this.estoque = estoque;
	}

	public List<Campanha> getCampanha() {
		return campanha;
	}

	public void setCampanha(List<Campanha> campanha) {
		this.campanha = campanha;
	}

	public LocalTime getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(LocalTime horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	public Duration getHorarioDuracao() {
		return horarioDuracao;
	}

	public void setHorarioDuracao(Duration horarioDuracao) {
		this.horarioDuracao = horarioDuracao;
	}

	public List<Doacao> getDoacoes() {
		return doacoes;
	}

	public void setDoacoes(List<Doacao> doacoes) {
		this.doacoes = doacoes;
	}
}