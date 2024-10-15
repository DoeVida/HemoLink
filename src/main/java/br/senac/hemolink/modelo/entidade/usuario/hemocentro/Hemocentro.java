package br.senac.hemolink.modelo.entidade.usuario.hemocentro;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.senac.hemolink.modelo.entidade.armazenamento.Armazenamento;
import br.senac.hemolink.modelo.entidade.campanha.Campanha;
import br.senac.hemolink.modelo.entidade.contato.Contato;
import br.senac.hemolink.modelo.entidade.demanda.Demanda;
import br.senac.hemolink.modelo.entidade.doacao.Doacao;
import br.senac.hemolink.modelo.entidade.endereco.Endereco;
import br.senac.hemolink.modelo.entidade.foto.Foto;
import br.senac.hemolink.modelo.entidade.papel.Papel;
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

	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "id_armazenamento")
	private Armazenamento armazenamento;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	private List<Campanha> campanhas;

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

	public Hemocentro() {
	}


	public Hemocentro(String apelido, String nome, Foto foto, String senha, Papel papel, Contato contato, String cnpj,
			List<Demanda> demanda, Armazenamento armazenamento, List<Campanha> campanha, LocalTime horarioInicio,
			Duration horarioDuracao, List<Doacao> doacoes) {

		super(apelido, nome, foto, senha, papel, contato);
		this.cnpj = cnpj;
		this.demanda = demanda;
		this.armazenamento = armazenamento;
		this.campanhas = campanha;
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

	public Armazenamento getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(Armazenamento armazenamento) {
		this.armazenamento = armazenamento;
	}

	public List<Campanha> getCampanhas() {
		return campanhas;
	}

	public void setCampanhas(List<Campanha> campanhas) {
		this.campanhas = campanhas;
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