package br.senac.hemolink.modelo.entidade.doacao;

import java.time.LocalDate;
import java.time.LocalTime;

import br.senac.hemolink.modelo.entidade.Doador;

public class Doacao {

	private Doador doador;
	private Hemocentro hemocentro;
	private LocalDate dataDoacao;
	private LocalTime hora;
	
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
	
	public void setHora (LocalTime hora) {
		this.hora = hora;
	}
	
	public LocalTime getHora() {
		return hora;
	}
}
