package br.senac.hemolink.modelo.entidade.papel;

public class Papel {
	
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
