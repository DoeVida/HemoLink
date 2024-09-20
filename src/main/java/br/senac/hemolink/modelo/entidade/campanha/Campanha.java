package br.senac.hemolink.modelo.entidade.campanha;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.senac.hemolink.modelo.entidade.demanda.Demanda;
import br.senac.hemolink.modelo.entidade.doacao.Doacao;

@Entity
@Table(name = "campanha")
public class Campanha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCampanha;

    @Column(name = "titulo", nullable = false, length = 100)
    private String titulo;

    @Column(name = "descricao_campanha", nullable = false, length = 255)
    private String descricaoCampanha;

    @OneToMany(mappedBy = "campanha")
    private List<Doacao> doacoes;

    @ManyToOne
    @JoinColumn(name = "demanda_id", nullable = false)
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
