package br.senac.hemolink.modelo.entidade.aquisicaoConquista;

import br.senac.hemolink.modelo.entidade.conquista.Conquista;
import br.senac.hemolink.modelo.entidade.usuario.doador.Doador;

import java.time.LocalDate;

public class AquisicaoConquista {
	private LocalDate dataAquisicao;
	private Conquista conquista;
	private Doador doador;
	
	public AquisicaoConquista(){}

	public AquisicaoConquista(LocalDate dataAquisicao, Conquista conquista, Doador doador){
		this.dataAquisicao = dataAquisicao;
        this.conquista = conquista;
        this.doador = doador;
	}

	public LocalDate getDataAquisicao() {
		return dataAquisicao;
	}

	public void setDataAquisicao(LocalDate dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}

	public Conquista getConquista() {
		return conquista;
	}

	public void setConquista(Conquista conquista) {
		this.conquista = conquista;
	}

	public Doador getDoador() {
		return doador;
	}

	public void setDoador(Doador doador) {
		this.doador = doador;
	}

	
	

}
