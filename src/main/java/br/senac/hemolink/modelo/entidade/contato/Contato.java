package br.senac.hemolink.modelo.entidade.contato;

public class Contato {

	private int idContato;
	private String email;
	private String telefone;
	
	public int getIdContato () {
		return this.idContato;
	}
	
	public void setIdContato (int idContato) {
		this.idContato = idContato;
	}
	
	public String getEmail () {
		return this.email;
	}
	
	public void setEmail (String email) {
		this.email = email;
	}
	
	public String getTelefone () {
		return this.telefone;
	}
	
	public void setTelefone (String telefone) {
		this.telefone = telefone;
	}
}
