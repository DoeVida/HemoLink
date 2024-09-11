package br.senac.hemolink.modelo.entidade.campanha;

import br.senac.hemolink.modelo.entidade.demanda.Demanda;

import java.util.List;

class Campanha {
    private String titulo;
    private String descricao;
    private List<Demanda> demanda;

    // Get Set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Demanda> getDemanda() {
        return demanda;
    }

    public void setDemanda(List<Demanda> demanda) {
        this.demanda = demanda;
    }
}
