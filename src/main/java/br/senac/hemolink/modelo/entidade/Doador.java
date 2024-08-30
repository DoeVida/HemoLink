package br.senac.hemolink.modelo.entidade;

import java.time.LocalDate;

public class Doador {
	private String cpf;
	private char genero;
	private TipoSanguineo tipoSanguineo;
	private LocalDate dataDeNascimento ;
	private List<Doacao>historicoDeDoacao;

	public Doador(){}

	public Doador(String cpf, char genero, Tiposanguineo tipoSanguineo, 
			LocalDate dataDeNascimento, List<Doacao>historicoDeDoacao ){
		this.cpf = cpf;
        this.genero = genero;
        this.tipoSanguineo = tipoSanguineo;
        this.dataDeNascimento = dataDeNascimento;
        this.historicoDeDoacao = historicoDeDoacao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public List<Doacao> getHistoricoDeDoacao() {
		return historicoDeDoacao;
	}

	public void setHistoricoDeDoacao(List<Doacao> historicoDeDoacao) {
		this.historicoDeDoacao = historicoDeDoacao;
	}

	
}
