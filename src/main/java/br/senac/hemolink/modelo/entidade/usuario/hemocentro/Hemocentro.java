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
import br.senac.hemolink.modelo.entidade.estoque.Estoque;
import br.senac.hemolink.modelo.entidade.campanha.Campanha;
import br.senac.hemolink.modelo.entidade.doacao.Doacao;


@Entity 
@Table(name = "Hemocentro")
class Hemocentro extends Usuario implements Serializable {
	
	@Id
	@Column(name = "id_cnpj", length = 14, nullable = false, unique = true) 
	private String cnpj;
	
	@OneToOne(fetch = FetchType.LAZY) 
	@MapsId
	@Column(name = "id_demanda") 
	private List<Demanda> demanda;
	
	@OneToOne(fetch = FetchType.LAZY) 
	@MapsId
	@Column(name = "id_estoque")
	private List<Estoque> estoque;
	
	@OneToOne(fetch = FetchType.LAZY) 
	@MapsId
	@Column(name = "id_campanha")
	private List<Campanha> campanha;
	
	@Column(name = "id_horarioInicio", nullable = false) 
	private LocalTime horarioInicio;
	
	@Column(name = "id_horarioDuracao", nullable = false)
	private Duration horarioDuracao;
	
	@OneToOne(fetch = FetchType.LAZY) 
	@MapsId
	@Column(name = "id_doacoes")
	private List<Doacao> doacoes;

	public Hemocentro() {

	}

	public Hemocentro(String cnpj, List<Demanda> demanda, List<Estoque> estoque, List<Campanha> campanha,
			LocalTime horarioInicio, Duration horarioDuracao, List<Doacao> doacoes) {
		super();
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