package br.senac.hemolink.modelo.entidade;

import br.senac.hemolink.modelo.enumeracao.TipoSanguineo;

public class EstoqueSangue {
	private TipoSanguineo tipoSanguineo;
    private float quantidadeDisponivel;

    public EstoqueSangue(TipoSanguineo tipoSanguineo, float quantidadeDisponivel) {
        this.tipoSanguineo = tipoSanguineo;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public TipoSanguineo getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public float getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(float quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
}