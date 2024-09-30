package br.senac.hemolink.modelo.entidade.usuario.doador;

import br.senac.hemolink.modelo.entidade.doacao.Doacao;
import br.senac.hemolink.modelo.entidade.usuario.Usuario;
import br.senac.hemolink.modelo.enumeracao.TipoSanguineo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Doador")
public class Doador extends Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@OneToOne
	@MapsId
	@Column(name = "apelido_usuario", nullable = false, unique = true)
	private String apelido;

	@Column(name = "cpf_doador", nullable = false, unique = true)
	private String cpf;

	@Column(name = "genero_doador", nullable = false, length = 1)
	private char genero;

	@Column(name = "dataDeNascimento_doador")
	private LocalDate dataDeNascimento;

	@ManyToOne
	@MapsId
	@Column(name = "tipoSanguineo_doador")
	private TipoSanguineo tipoSanguineo;

	@OneToMany
	@MapsId
	@Column(name = "Doacao")
	private List<Doacao> historicoDeDoacao;

	public Doador() {
	}

	public Doador(String apelido, String cpf, char genero, LocalDate dataDeNascimento, TipoSanguineo tipoSanguineo,
			List<Doacao> historicoDeDoacao) {
		this.apelido = apelido;
		this.cpf = cpf;
		this.genero = genero;
		this.dataDeNascimento = dataDeNascimento;
		this.tipoSanguineo = tipoSanguineo;
		this.historicoDeDoacao = historicoDeDoacao;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public List<Doacao> getHistoricoDeDoacao() {
		return historicoDeDoacao;
	}

	public void setHistoricoDeDoacao(List<Doacao> historicoDeDoacao) {
		this.historicoDeDoacao = historicoDeDoacao;
	}

}