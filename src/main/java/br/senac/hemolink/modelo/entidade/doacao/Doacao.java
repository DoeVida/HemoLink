package br.senac.hemolink.modelo.entidade.doacao;

import java.time.LocalDate;
import java.time.LocalTime;
import br.senac.hemolink.modelo.entidade.hemocentro.Hemocentro;
import br.senac.hemolink.modelo.entidade.usuario.doador.Doador;

public class Doacao {

	private Doador doador;
	private Hemocentro hemocentro;
	private LocalDate dataDoacao;
	private LocalTime horaDoacao;
	
	public Doacao() {}
	
	public Doacao (Doador doador, Hemocentro hemocentro,LocalDate dataDoacao, LocalTime horaDoacao) {
		this.doador = doador;
		this.hemocentro = hemocentro;
		this.dataDoacao = dataDoacao;
		this.horaDoacao = horaDoacao;
	}
	
	public void setDoador (Doador doador) {
		this.doador = doador;
	}
	
	public Doador getDoador () {
		return doador;
	}
	
	public void setHemocentro (Hemocentro hemocentro) {
		this.hemocentro = hemocentro;
	}
	
	public Hemocentro getHemocentro() {
		return hemocentro;
	}

	public void setData (LocalDate dataDoacao) {
		this.dataDoacao = dataDoacao;
	}
	
	public LocalDate getData () {
		return dataDoacao;
	}
	
	public void sethoraDoacao (LocalTime horaDoacao) {
		this.horaDoacao = horaDoacao;
	}
	
	public LocalTime gethoraDoacao() {
		return horaDoacao;
	}
}