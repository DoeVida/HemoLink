package br.senac.hemolink.modelo.entidade.usuario.doador;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.senac.hemolink.modelo.entidade.aquisicaoConquista.AquisicaoConquista;
import br.senac.hemolink.modelo.entidade.contato.Contato;
import br.senac.hemolink.modelo.entidade.doacao.Doacao;
import br.senac.hemolink.modelo.entidade.foto.Foto;
import br.senac.hemolink.modelo.entidade.papel.Papel;
import br.senac.hemolink.modelo.entidade.usuario.Usuario;
import br.senac.hemolink.modelo.enumeracao.TipoSanguineo;

@Entity
@Table(name = "doador")
public class Doador extends Usuario implements Serializable {

	private static final long serialVersionUID = -2615132801850413921L;

	@MapsId
	@Column(name = "id_usuario")
	private Usuario usuario;

	@Column(name = "cpf_doador", length = 11, nullable = false, unique = true)
	private String cpf;

	@Column(name = "sexo_doador", length = 1, nullable = false)
	private char sexo;

	@Column(name = "data_nascimento_doador", nullable = false)
	private LocalDate dataDeNascimento;

	@Column(name = "tipo_sanguineo_doador")
	@Enumerated(EnumType.STRING)
	private TipoSanguineo tipoSanguineo;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "doador", cascade = CascadeType.DETACH)
	private List<Doacao> doacoes;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "doador", cascade = CascadeType.REMOVE)
	private List<AquisicaoConquista> aquisicaoConquista;

	public Doador() {
	}

	public Doador(Usuario usuario, String cpf, char sexo, LocalDate dataDeNascimento, TipoSanguineo tipoSanguineo,
			List<Doacao> doacoes, List<AquisicaoConquista> aquisicaoConquista) {
		this.usuario = usuario;
		this.cpf = cpf;
		this.sexo = sexo;
		this.dataDeNascimento = dataDeNascimento;
		this.tipoSanguineo = tipoSanguineo;
		this.doacoes = doacoes;
		this.aquisicaoConquista = aquisicaoConquista;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
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

	public List<Doacao> getDoacoes() {
		return doacoes;
	}

	public void setDoacoes(List<Doacao> doacoes) {
		this.doacoes = doacoes;
	}

	public List<AquisicaoConquista> getAquisicaoConquista() {
		return aquisicaoConquista;
	}

	public void setAquisicaoConquista(List<AquisicaoConquista> aquisicaoConquista) {
		this.aquisicaoConquista = aquisicaoConquista;
	}

}