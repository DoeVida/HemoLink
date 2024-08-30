package br.senac.hemolink.modelo.entidade.papel;

public class Papel {

	private long idPapel;
	private String nomePapel;
	
	public void setIdPapel (long idPapel) {
		this.idPapel = idPapel;
	}
	
	public long getIdPapel () {
		return this.idPapel;
	}
	
	public void setNomePapel (String nomePapel) {
		this.nomePapel = nomePapel;
	}
	
	public String getNomePapel () {
		return this.nomePapel;
	}
}
