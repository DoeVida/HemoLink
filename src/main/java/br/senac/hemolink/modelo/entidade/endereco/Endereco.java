package br.senac.hemolink.modelo.entidade.endereco;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import br.senac.hemolink.modelo.entidade.usuario.hemocentro.Hemocentro;

@Entity
@Table(name = "endereco", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "logradouro_endereco", "numero_endereco" }) })
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_endereco")
	private Long idEndereco;

	@Column(name = "estado_endereco", nullable = false, length = 2)
	private String estado;

	@Column(name = "cidade_endereco", nullable = false, length = 45)
	private String cidade;

	@Column(name = "bairro_endereco", nullable = false, length = 45)
	private String bairro;

	@Column(name = "logradouro_endereco", nullable = false, length = 45)
	private String logradouro;

	@Column(name = "numero_endereco", nullable = false)
	private int numero;

	@Column(name = "cep_endereco", nullable = false, length = 8)
	private String cep;

	@OneToOne
	@JoinColumn(name = "apelido_hemocentro", nullable = false)
	private Hemocentro hemocentro;

	public Endereco() {
	}

	public Endereco(String estado, String cidade, String bairro, String logradouro, int numero, String cep,
			Hemocentro hemocentro) {
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
		this.hemocentro = hemocentro;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getBairro() {
		return this.bairro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getLogradouro() {
		return this.logradouro;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCep() {
		return this.cep;
	}

	public void setHemocentro(Hemocentro hemocentro) {
		this.hemocentro = hemocentro;
	}

	public Hemocentro getHemocentro() {
		return hemocentro;
	}
}
