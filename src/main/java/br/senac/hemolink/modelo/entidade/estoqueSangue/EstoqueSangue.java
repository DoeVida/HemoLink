package br.senac.hemolink.modelo.entidade.estoqueSangue;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.senac.hemolink.modelo.entidade.armazenamento.Armazenamento;
import br.senac.hemolink.modelo.enumeracao.TipoSanguineo;

@Entity
@Table(name = "estoque_sangue")
public class EstoqueSangue implements Serializable {

	private static final long serialVersionUID = -303924785394320945L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_estoque_sangue")
	private Long id;

	@Column(name = "tipo_sanguineo_estoque_sangue")
	@Enumerated(EnumType.STRING)
	private TipoSanguineo tipoSanguineo;

	@Column(name = "quantidade_litros_estoque_sangue", nullable = false)
	private double quantidadeLitros;

	@ManyToOne
	@JoinColumn(name = "id_armazenamento", referencedColumnName = "id_armazenamento")
	private Armazenamento armazenamento;

	public EstoqueSangue() {
	}

	public EstoqueSangue(Long id, TipoSanguineo tipoSanguineo, double quantidadeLitros, Armazenamento armazenamento) {
		this.id = id;
		this.tipoSanguineo = tipoSanguineo;
		this.quantidadeLitros = quantidadeLitros;
		this.armazenamento = armazenamento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public double getQuantidadeLitros() {
		return quantidadeLitros;
	}

	public void setQuantidadeLitros(double quantidadeLitros) {
		this.quantidadeLitros = quantidadeLitros;
	}

	public Armazenamento getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(Armazenamento armazenamento) {
		this.armazenamento = armazenamento;
	}
}