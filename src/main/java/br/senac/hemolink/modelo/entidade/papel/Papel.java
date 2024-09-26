package br.senac.hemolink.modelo.entidade.papel;
 
import java.io.Serializable;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
 
@Entity
@Table(name= "Papel")
public class Papel implements Serializable{
 
	@Id
	@Column(name="idPapel", nullable = false, unique = true)
	private int idPapel;
	
	@Column(name="nomePapel", length = 15, nullable = false, unique = true)
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
 