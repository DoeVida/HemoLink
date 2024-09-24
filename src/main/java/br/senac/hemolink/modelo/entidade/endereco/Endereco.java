package br.senac.hemolink.modelo.entidade.endereco;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

public class Endereco {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Long id; 

    @Column(name = "estado", nullable = false, length = 45)
    private String estado;

    @Column(name = "cidade", nullable = false, length = 45)
    private String cidade;

    @Column(name = "bairro", nullable = false, length = 45)
    private String bairro;

    @Column(name = "logradouro", nullable = false, length = 45)
    private String logradouro;

    @Column(name = "numero", nullable = false)
    private int numero;

    @Column(name = "cep", nullable = true, length = 13)
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
