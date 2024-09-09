package br.senac.hemolink.modelo.entidade;

import java.time.LocalDate;

public class Armazenamento {

	private int idArmazenamento;
	private EstoqueDeSangue[] estoqueDeSangue = new EstoqueDeSangue[8];
	private LocalDate dataUltimaAtualizacao;
	private Hemocentro hemocentro;
	
	
	public Armazenamento(){}

	public Armazenamento(int idArmazenamento, EstoqueDeSangue[] estoqueDeSangue, LocalDate dataUltimaAtualizacao, Hemocentro hemocentro) {
        this.idArmazenamento = idArmazenamento;
        this.estoqueDeSangue = estoqueDeSangue;
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        this.hemocentro = hemocentro;
    }
	
	
	
	
	public int getIdArmazenamento() {
		return idArmazenamento;
	}
	public void setIdArmazenamento(int idArmazenamento) {
		this.idArmazenamento = idArmazenamento;
	}
	public EstoqueDeSangue[] getEstoqueDeSangue() {
		return estoqueDeSangue;
	}
	public void setEstoqueDeSangue(EstoqueDeSangue[] estoqueDeSangue) {
		this.estoqueDeSangue = estoqueDeSangue;
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
