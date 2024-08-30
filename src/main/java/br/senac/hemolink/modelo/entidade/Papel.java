package br.senac.hemolink.modelo.entidade;

public class Papel {

	private int idPapel;
	private String nomePapel;
	
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
