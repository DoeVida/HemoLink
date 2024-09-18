package br.senac.hemolink.modelo.entidade.armazenamento;

import java.time.LocalDate;
import br.senac.hemolink.modelo.entidade.usuario.hemocentro.Hemocentro;
import br.senac.hemolink.modelo.entidade.estoqueSangue.EstoqueSangue;

public class Armazenamento {

	private int idArmazenamento;
	private EstoqueSangue[] estoqueSangue = new EstoqueSangue[8];
	private LocalDate dataUltimaAtualizacao;
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
