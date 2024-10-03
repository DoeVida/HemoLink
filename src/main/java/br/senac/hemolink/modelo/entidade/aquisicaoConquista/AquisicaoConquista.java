package br.senac.hemolink.modelo.entidade.aquisicaoConquista;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.senac.hemolink.modelo.entidade.conquista.Conquista;
import br.senac.hemolink.modelo.entidade.usuario.doador.Doador;

@Entity
@Table(name= "AquisicaoConquista")
public class AquisicaoConquista implements Serializable{
	
	 private static final long serialVersionUID = 1L;
	 
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id_aquisicao", nullable = false, unique = true)
		private int idAquisicaoConquista;
	 
	 @Column(name = "data_aquisicao", nullable = false)
		private LocalDate dataAquisicao;
	 
	 @OneToMany
	 @JoinColumn(name = "id_doador", nullable = false, unique = true)
		private Doador doador;
	 
	 @OneToOne
	 @JoinColumn(name = "id_conquista", nullable = false)
	    private Conquista conquista;

	
	public AquisicaoConquista(){}

	public AquisicaoConquista( int idAquisicaoConquista, LocalDate dataAquisicao, Conquista conquista, Doador doador){
		this.idAquisicaoConquista = idAquisicaoConquista;
		this.dataAquisicao = dataAquisicao;
        this.conquista = conquista;
        this.doador = doador;
	}
	
	public int getIdAquisicaoConquista() {
		return idAquisicaoConquista;
	}
	
	public void setIdAquisicaoConquista(int idAquisicaoConquista) {
		this.idAquisicaoConquista = idAquisicaoConquista;
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
