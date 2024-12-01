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

	public Doador(String apelido, String nome, String senha, Foto foto, Papel papel, Contato contato, String cpf, char sexo, LocalDate dataDeNascimento, TipoSanguineo tipoSanguineo) {
		super(apelido, nome, senha, foto, papel, contato);
		this.cpf = cpf;
		this.sexo = sexo;
		this.dataDeNascimento = dataDeNascimento;
		this.tipoSanguineo = tipoSanguineo;
	}

	public Doador(Long id, String apelido, String nome, Foto fotoPerfil, String senha, Papel papel, Contato contato, String cpf, char sexo, LocalDate dataDeNascimento, TipoSanguineo tipoSanguineo) {
		super(id, apelido, nome, fotoPerfil, senha, papel, contato);
		this.cpf = cpf;
		this.sexo = sexo;
		this.dataDeNascimento = dataDeNascimento;
		this.tipoSanguineo = tipoSanguineo;
	}
}