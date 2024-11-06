package br.senac.hemolink.modelo.entidade.campanha;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.senac.hemolink.modelo.entidade.demanda.Demanda;
import br.senac.hemolink.modelo.entidade.doacao.Doacao;
import br.senac.hemolink.modelo.entidade.usuario.hemocentro.Hemocentro;

@Entity
@Table(name = "campanha")
public class Campanha implements Serializable {

	private static final long serialVersionUID = 3240164749097482522L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_campanha")
	private Long id;

	@Column(name = "titulo", nullable = false, length = 45)
	private String titulo;

	@Column(name = "descricao_campanha", nullable = false, length = 255)
	private String descricaoCampanha;

	@ManyToOne
	@JoinColumn(name = "id_hemocentro", referencedColumnName = "id_usuario")
	private Hemocentro hemocentro;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	private List<Demanda> demandas;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
	private List<Doacao> doacoes;

	@Column(name = "data_inicio", nullable = false)
	private LocalDate dataInicio;

	@Column(name = "data_fim", nullable = false)
	private LocalDate dataFim;

	public Campanha() {}

	public Campanha(Long id, String titulo, String descricaoCampanha, Hemocentro hemocentro, List<Demanda> demandas,
			List<Doacao> doacoes, LocalDate dataInicio, LocalDate dataFim) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricaoCampanha = descricaoCampanha;
		this.hemocentro = hemocentro;
		this.demandas = demandas;
		this.doacoes = doacoes;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Hemocentro getHemocentro() {
		return hemocentro;
	}

	public void setHemocentro(Hemocentro hemocentro) {
		this.hemocentro = hemocentro;
	}

	public List<Demanda> getDemandas() {
		return demandas;
	}

	public void setDemandas(List<Demanda> demandas) {
		this.demandas = demandas;
	}

	public List<Doacao> getDoacoes() {
		return doacoes;
	}

	public void setHemocentro(Hemocentro hemocentro) {
		this.hemocentro = hemocentro;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}

}