package br.senac.hemolink.modelo.entidade.usuario.hemocentro;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;

import br.senac.hemolink.modelo.entidade.demanda.Demanda;
import br.senac.hemolink.modelo.entidade.estoque.Estoque;
import br.senac.hemolink.modelo.entidade.campanha.Campanha;
import br.senac.hemolink.modelo.entidade.doacao.Doacao;

class Hemocentro extends Usuario {
	private String CNPJ;
	private List<Demanda> demanda;
	private List<Estoque> estoque;
	private List<Campanha> campanha;
	private LocalTime horarioAInicio;
	private Duration horarioADuracao;
	private List<Doacao> doacoes;

	public Hemocentro() {

	}

	public Hemocentro(String cNPJ, List<Demanda> demanda, List<Estoque> estoque, List<Campanha> campanha,
			LocalTime horarioAInicio, Duration horarioADuracao, List<Doacao> doacoes) {
		super();
		CNPJ = cNPJ;
		this.demanda = demanda;
		this.estoque = estoque;
		this.campanha = campanha;
		this.horarioAInicio = horarioAInicio;
		this.horarioADuracao = horarioADuracao;
		this.doacoes = doacoes;
	}
	//

	// Get Set
	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
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

	public LocalTime getHorarioAInicio() {
		return horarioAInicio;
	}

	public void setHorarioAInicio(LocalTime horarioAInicio) {
		this.horarioAInicio = horarioAInicio;
	}

	public Duration getHorarioADuracao() {
		return horarioADuracao;
	}

	public void setHorarioADuracao(Duration horarioADuracao) {
		this.horarioADuracao = horarioADuracao;
	}

	public List<Doacao> getDoacoes() {
		return doacoes;
	}

	public void setDoacoes(List<Doacao> doacoes) {
		this.doacoes = doacoes;
	}
}
