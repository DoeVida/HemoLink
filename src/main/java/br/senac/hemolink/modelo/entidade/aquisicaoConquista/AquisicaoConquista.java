package br.senac.hemolink.modelo.entidade.aquisicaoConquista;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.senac.hemolink.modelo.entidade.conquista.Conquista;
import br.senac.hemolink.modelo.entidade.usuario.doador.Doador;

@Entity
@Table(name = "aquisicao_conquista")
public class AquisicaoConquista implements Serializable {

	private static final long serialVersionUID = 8824432177181946932L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_aquisicao")
	private Long id;

	@Column(name = "data_aquisicao", nullable = false)
	private LocalDate dataAquisicao;

	@ManyToOne
	@JoinColumn(name = "id_doador", referencedColumnName = "id_doador")
	private Doador doador;

	@ManyToOne
	@JoinColumn(name = "id_conquista", referencedColumnName = "id_conquista")
	private Conquista conquista;

	public AquisicaoConquista() {
	}

	public AquisicaoConquista(Long id, LocalDate dataAquisicao, Conquista conquista, Doador doador) {
		this.id = id;
		this.dataAquisicao = dataAquisicao;
		this.conquista = conquista;
		this.doador = doador;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDataAquisicao() {
		return dataAquisicao;
	}

	public void setDataAquisicao(LocalDate dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}

	public Doador getDoador() {
		return doador;
	}

	public void setDoador(Doador doador) {
		this.doador = doador;
	}

	public Conquista getConquista() {
		return conquista;
	}

	public void setConquista(Conquista conquista) {
		this.conquista = conquista;
	}
}