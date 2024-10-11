package br.senac.hemolink.modelo.entidade.campanha;

import br.senac.hemolink.modelo.entidade.demanda.Demanda;
import br.senac.hemolink.modelo.entidade.doacao.Doacao;

import java.util.List;

public class Campanha {
	private int idCampanha;
	private String titulo;
	private String descricaoCampanha;
	private List<Doacao> doacoes;
	private Demanda demanda;

	public Campanha() {

	}

	public Campanha(int idCampanha, String titulo, String descricaoCampanha, List<Doacao> doacoes, Demanda demanda) {
	    super();
	    this.idCampanha = idCampanha;
	    this.titulo = titulo;
	    this.descricaoCampanha = descricaoCampanha;
	    this.doacoes = doacoes;
	    this.demanda = demanda;
	}

	public int getIdCampanha() {
		return idCampanha;
	}

	public void setIdCampanha(int idCampanha) {
		this.idCampanha = idCampanha;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricaoCampanha() {
		return descricaoCampanha;
	}

	public void setDescricaoCampanha(String descricaoCampanha) {
		this.descricaoCampanha = descricaoCampanha;
	}

	public List<Doacao> getDoacoes() {
		return doacoes;
	}

	public void setDoacoes(List<Doacao> doacoes) {
		this.doacoes = doacoes;
	}

	public Demanda getDemanda() {
		return demanda;
	}

	public void setDemanda(Demanda demanda) {
		this.demanda = demanda;
	}

}