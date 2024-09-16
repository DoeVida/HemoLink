package br.senac.hemolink.modelo.entidade.papel;

import java.io.Serializable;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;

@Entity
@Table(name= "papel")
public class Papel implements Serializable{

	@Id
	@Column(name="idPapel") 
	private Long id;
	
	@Column(name="nomePapel", length = 50, nullable = false, unique = true)
	private String nomePapel;
	
	@OnetoOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "idPapel")
	
	private int idPapel;
	private String nomePapel;
	
	public void Papel () {
		
	}
	
	public void Papel (int idPapel, String nomePapel) {
		this.idPapel = idPapel;
		this.nomePapel = nomePapel;
	}
	
	public void setIdPapel (int idPapel) {
		this.idPapel = idPapel;
	}
	
	public int getIdPapel () {
		return this.idPapel;
	}
	
	public void setNomePapel (String nomePapel) {
		this.nomePapel = nomePapel;
	}
	
	public String getNomePapel () {
		return this.nomePapel;
	}
}
