package br.senac.hemolink.modelo.entidade.estoqueSangue;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.senac.hemolink.modelo.enumeracao.TipoSanguineo;

	@Entity
	@Table(name = "EstoqueSangue")
	public class EstoqueSangue implements Serializable {
		
	    private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id_estoque_sangue", nullable = false, unique = true)
		private int idEstoqueSangue;

		@ManyToOne
		@Column(name = "tipo_sanguineo_estoque_sangue", nullable = false)
		private TipoSanguineo tipoSanguineo;
		
		@Column(name = "quantidade_disponivel_estoque_sangue", nullable = false)
		private float quantidadeDisponivel;
		
		@Column(name = "id_armazenamento")
		private int idArmazenamento;

		public EstoqueSangue() {}
		
		public EstoqueSangue(int idEstoqueSangue, TipoSanguineo tipoSanguineo, float quantidadeDisponivel,int idArmazenamento) {
			this.idEstoqueSangue = idEstoqueSangue;
			this.tipoSanguineo = tipoSanguineo;
			this.quantidadeDisponivel = quantidadeDisponivel;
			this.idArmazenamento = idArmazenamento;
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

		public int getIdArmazenamento() {
			return idArmazenamento;
		}

		public void setIdArmazenamento(int idArmazenamento) {
			this.idArmazenamento = idArmazenamento;
		}
}