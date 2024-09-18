package br.senac.hemolink.modelo.entidade.armazenamento;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.time.LocalDate;
import br.senac.hemolink.modelo.entidade.usuario.hemocentro.Hemocentro;
import br.senac.hemolink.modelo.entidade.estoqueSangue.EstoqueSangue;

@Entity
@Table (name = "armazenamento")

public class Armazenamento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_armazenamento", nullable = false, unique = true)	
	private int idArmazenamento;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "armazenamento_id")
	private EstoqueSangue[] estoqueSangue = new EstoqueSangue[8];
    
    @Column(name = "data_atualizacao", nullable = false, unique = false)	
	private LocalDate dataUltimaAtualizacao;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "hemocentro", nullable = false, unique = false)	
	private Hemocentro hemocentro;
	
	
	public Armazenamento(){}

	public Armazenamento(int idArmazenamento, EstoqueSangue[] estoqueSangue, LocalDate dataUltimaAtualizacao, Hemocentro hemocentro) {
        this.idArmazenamento = idArmazenamento;
        this.estoqueSangue = estoqueSangue;
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        this.hemocentro = hemocentro;
    }
	
	
	
	
	public int getIdArmazenamento() {
		return idArmazenamento;
	}
	public void setIdArmazenamento(int idArmazenamento) {
		this.idArmazenamento = idArmazenamento;
	}
	public EstoqueSangue[] getEstoqueSangue() {
		return estoqueSangue;
	}
	public void setEstoqueSangue(EstoqueSangue[] estoqueSangue) {
		this.estoqueSangue = estoqueSangue;
	}
	public LocalDate getDataUltimaAtualizacao() {
		return dataUltimaAtualizacao;
	}
	public void setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
		this.dataUltimaAtualizacao = dataUltimaAtualizacao;
	}
	public Hemocentro getHemocentro() {
		return hemocentro;
	}
	public void setHemocentro(Hemocentro hemocentro) {
		this.hemocentro = hemocentro;
	}
	
	
}