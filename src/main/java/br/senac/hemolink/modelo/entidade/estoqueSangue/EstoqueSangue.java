package br.senac.hemolink.modelo.entidade.estoqueSangue;

import java.io.Serializable;
import java.util.Objects;
import java.time.LocalDate;

import br.senac.hemolink.modelo.enumeracao.TipoSanguineo;

public class EstoqueSangue {
@Entity
@Table(name = "estoque")
public class EstoqueSangue implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_estoque", nullable = false)
	private int idEstoqueSangue;

	@Column(name = "tipo_sanguineo", length = 3, nullable = false, unique = false)
	private TipoSanguineo tipoSanguineo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId
	@Column (name = "tipoSanguineo_estoqueSangue")
	private TipoSanguineo tipoSanguineo;

    public EstoqueSangue(TipoSanguineo tipoSanguineo, float quantidadeDisponivel) {
        this.tipoSanguineo = tipoSanguineo;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
    
	public EstoqueSangue() { }

	public EstoqueSangue(int idEstoqueSangue,
			br.senac.hemolink.modelo.entidade.estoqueSangue.TipoSanguineo tipoSanguineo, float quantidadeDisponivel) {
		this.idEstoqueSangue = idEstoqueSangue;
		this.tipoSanguineo = tipoSanguineo;
		this.quantidadeDisponivel = quantidadeDisponivel;
	}

	public int getIdEstoqueSangue() {
		return idEstoqueSangue;
	}

	public void setIdEstoqueSangue(int idEstoqueSangue) {
		this.idEstoqueSangue = idEstoqueSangue;
	}

    public TipoSanguineo getTipoSanguineo() {
        return tipoSanguineo;
    }
	public TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}

    public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }
	public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

    public float getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }
	public float getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}

    public void setQuantidadeDisponivel(float quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
	public void setQuantidadeDisponivel(float quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}
}