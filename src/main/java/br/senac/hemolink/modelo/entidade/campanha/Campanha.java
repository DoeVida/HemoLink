package br.senac.hemolink.modelo.entidade.campanha;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.senac.hemolink.modelo.entidade.demanda.Demanda;
import br.senac.hemolink.modelo.entidade.doacao.Doacao;

@Entity
@Table(name = "Campanha")
public class Campanha implements Serializable{

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_campanha", nullable = false, unique = true)
    private int idCampanha;

    @Column(name = "titulo_campanha", nullable = false, length = 40)
    private String tituloCampanha;

    @Column(name = "descricao_campanha", nullable = false, length = 100)
    private String descricaoCampanha;

    @OneToMany
    private List<Doacao> doacoes;

    @OneToMany
    @JoinColumn(name = "id_demanda", nullable = false)
    private Demanda demanda;

	public Campanha(){}

	public Campanha(int idCampanha, String tituloCampanha, String descricaoCampanha, List<Doacao> doacoes, Demanda demanda) {
		this.idCampanha = idCampanha;
		this.tituloCampanha = tituloCampanha;
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

	public String getTituloCampanha() {
		return tituloCampanha;
	}

	public void setTituloCampanha(String tituloCampanha) {
		this.tituloCampanha = tituloCampanha;
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
