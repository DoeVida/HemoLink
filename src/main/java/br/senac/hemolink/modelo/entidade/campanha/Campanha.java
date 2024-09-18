package br.senac.hemolink.modelo.entidade.campanha;

import br.senac.hemolink.modelo.entidade.demanda.Demanda;
import br.senac.hemolink.modelo.entidade.doacao.Doacao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "campanha")
public class Campanha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_campanha")
    private int idCampanha;

    @Column(name = "titulo", nullable = false, length = 100)
    private String titulo;

    @Column(name = "descricao_campanha", length = 500)
    private String descricaoCampanha;

    @OneToMany(mappedBy = "campanha", cascade = CascadeType.ALL)
    private List<Doacao> doacoes;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "demanda_id", referencedColumnName = "id_demanda")
    private Demanda demanda;

    public Campanha() {
    }

    public Campanha(int idCampanha, String titulo, String descricaoCampanha, List<Doacao> doacoes, Demanda demanda) {
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
