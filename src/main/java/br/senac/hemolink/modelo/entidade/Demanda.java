package br.senac.hemolink.modelo.entidade;

import java.util.List;

public class Demanda {
    private TipoSanguineo tipoSanguineo;
    private char rh;
    private String status;
    private List<Campanha> campanhas;

    // Getters e Setters
    public TipoSanguineo getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public char getRh() {
        return rh;
    }

    public void setRh(char rh) {
        this.rh = rh;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Campanha> getCampanhas() {
        return campanhas;
    }

    public void setCampanhas(List<Campanha> campanhas) {
        this.campanhas = campanhas;
    }
}
