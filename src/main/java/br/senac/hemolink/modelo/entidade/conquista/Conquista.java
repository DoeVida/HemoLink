package br.senac.hemolink.modelo.entidade.conquista;

public class Conquista {

	private int idConquista;
	private String nomeConquista;
	private String descricaoConquista;
	
	public Conquista () {}
	
	public Conquista (int idConquista, String nomeConquista, String descricaoConquista) {
		this.idConquista = idConquista;
		this.nomeConquista = nomeConquista;
		this.descricaoConquista = descricaoConquista;
		
	}
	
	public void setIdConquista (int idConquista) {
		this.idConquista = idConquista;
	}
	
	public int getIdConquista() {
		return idConquista;
	}
	
	public void setNomeConquista (String nomeConquista) {
		this.nomeConquista = nomeConquista;
	}
	public String getNomeConquista () {
		return nomeConquista;
	}
	
	public void setDescricaoConquista (String descricaoConquista) {
		this.descricaoConquista = descricaoConquista;
	}
	
	public String getDescxricaoConquista (){
		return descricaoConquista;
	}
}