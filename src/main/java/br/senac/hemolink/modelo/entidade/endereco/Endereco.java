package br.senac.hemolink.modelo.entidade.endereco;

public class Endereco {
	
	private String estado;
	private String cidade;
	private String bairro;
	private String logradouro;
	private int numero;
	private String cep;
	
	public void Endereco() {}
	
	public void Endereco (String estado, String cidade, String bairro, String logradouro, int numero, String cep) {
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
	}
	
	public void setEstado (String estado) {
		this.estado = estado;
	}
	
	public String getEstado () {
		return this.estado;
	}
	
	public void setCidade (String cidade) {
		this.cidade = cidade;
	}
	
	public String getCidade () {
		return this.cidade;
	}
	
	public void setBairro (String bairro) {
		this.bairro = bairro;
	}
	
	public String getBairro () {
		return this.bairro;
	}
	
	public void setLogradouro (String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getLogradouro () {
		return this.logradouro;
	}
	
	public void setNumero (int numero) {
		this.numero = numero;
	}
	
	public int getNumero () {
		return this.numero;
	}
	
	public void setCep (String cep) {
		this.cep = cep;
	}
	
	public String getCep () {
		return this.cep;
	}
}
