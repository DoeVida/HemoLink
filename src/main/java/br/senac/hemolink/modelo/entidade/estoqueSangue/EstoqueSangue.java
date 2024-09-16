package br.senac.hemolink.modelo.entidade.estoqueSangue;

import java.io.Serializable;

import javax.persistence.*;

import br.senac.hemolink.modelo.enumeracao.TipoSanguineo;

@Entity
@Table (name = "estoque")

public class EstoqueSangue implements Serializable {
    
    private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_estoque", nullable = false, unique = true)
	private int idEstoqueSangue;
	

private TipoSanguineo tipoSanguineo;
	
	@Column(name = "quantidade_disponivel", nullable = false, unique = false)
	private float quantidadeDisponivel;

	public EstoqueSangue() {

	}

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