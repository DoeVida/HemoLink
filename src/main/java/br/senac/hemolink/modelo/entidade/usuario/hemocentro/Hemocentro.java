package br.senac.hemolink.modelo.entidade.usuario.hemocentro;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalTime;
import java.util.List;

<<<<<<< HEAD
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

@Entity 
@Table(name = "Hemocentro")
public class Hemocentro extends Usuario implements Serializable {
=======
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.senac.hemolink.modelo.entidade.campanha.Campanha;
import br.senac.hemolink.modelo.entidade.demanda.Demanda;
import br.senac.hemolink.modelo.entidade.doacao.Doacao;
import br.senac.hemolink.modelo.entidade.endereco.Endereco;
import br.senac.hemolink.modelo.entidade.estoqueSangue.EstoqueSangue;
import br.senac.hemolink.modelo.entidade.usuario.Usuario;

@Entity
@Table(name = "hemocentro")
public class Hemocentro extends Usuario implements Serializable {

	private static final long serialVersionUID = 5082517849085199550L;

	@MapsId
	@Column(name = "id_usuario")
	private Usuario usuario;

	@Column(name = "cnpj_hemocentro", length = 14, nullable = false, unique = true)
	private String cnpj;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hemocentro", cascade = CascadeType.REMOVE)
	private List<Demanda> demanda;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hemocentro", cascade = CascadeType.REMOVE)
	private List<EstoqueSangue> estoqueSangue;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	private List<Campanha> campanha;

	@Column(name = "horario_abertura_hemocentro", nullable = false)
	private LocalTime horarioInicio;

	@Column(name = "horario_fechamento_hemocentro", nullable = false)
	private Duration horarioDuracao;

	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "id_endereco")
	private Endereco endereco;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hemocentro", cascade = CascadeType.DETACH)
	private List<Doacao> doacoes;
>>>>>>> 3368cdeb553153204f4aa6c34a960d890c9fe77f

	@Id
	@Column(name = "id_cnpj", length = 14, nullable = false, unique = true)
	private String cnpj;
	
	@OneToOne(fetch = FetchType.LAZY) 
	@MapsId
	@Column(name = "id_demanda")
	private List<Demanda> demanda;
	
	@OneToOne(fetch = FetchType.LAZY) 
	@MapsId
	@Column(name = "id_estoqueSangue")
	private List<EstoqueSangue> estoqueSangue;
	
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

<<<<<<< HEAD
	public Hemocentro(String cnpj, List<Demanda> demanda, List<EstoqueSangue> estoqueSangue, List<Campanha> campanha,
			LocalTime horarioInicio, Duration horarioDuracao, List<Doacao> doacoes) {

=======
	public Hemocentro(Usuario usuario, String cnpj, List<Demanda> demanda, List<EstoqueSangue> estoqueSangue,
			List<Campanha> campanha, LocalTime horarioInicio, Duration horarioDuracao, List<Doacao> doacoes) {
		this.usuario = usuario;
>>>>>>> 3368cdeb553153204f4aa6c34a960d890c9fe77f
		this.cnpj = cnpj;
		this.demanda = demanda;
		this.estoqueSangue = estoqueSangue;
		this.campanha = campanha;
		this.horarioInicio = horarioInicio;
		this.horarioDuracao = horarioDuracao;
		this.doacoes = doacoes;
	}

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

	public List<EstoqueSangue> getEstoqueSangue() {
		return estoqueSangue;
	}

	public void setEstoqueSangue(List<EstoqueSangue> estoqueSangue) {
		this.estoqueSangue = estoqueSangue;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Doacao> getDoacoes() {
		return doacoes;
	}

	public void setDoacoes(List<Doacao> doacoes) {
		this.doacoes = doacoes;
	}
}