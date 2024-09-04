package br.senac.hemolink.modelo.entidade.contato;

public class Contato {
	
	private int idContato;
	private String email;
	private String telefone;
	
	public void setIdContato (int idContato) {
		this.idContato = idContato;
	}
	
	public int getIdContato () {
		return this.idContato;
	}
	
	public void setEmail (String email) {
		this.email = email;
	}
	
	public String getEmail () {
		return this.email;
	}
	
	public void setTelefone (String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone () {
		return this.email;
	}
}