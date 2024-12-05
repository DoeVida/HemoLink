package br.senac.hemolink.modelo.entidade.usuario.doador;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.senac.hemolink.modelo.entidade.doacao.Doacao;
import br.senac.hemolink.modelo.entidade.usuario.Usuario;
import br.senac.hemolink.modelo.enumeracao.TipoSanguineo;

@Entity
@Table (name = "doador")
public class Doador extends Usuario implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column (name = "cpf_doador")
	private String cpf;
	
	@Column (name = "sexo_doador", length = 1, nullable = false)
	private char sexo;
	
	@Column (name = "data_nascimento_doador", nullable = false)
	private LocalDate dataDeNascimento ;
	
	@ManyToOne
	@Column (name = "tipo_sanguineo_doador", length = 11, nullable = true)
	private TipoSanguineo tipoSanguineo;
	
	@OneToMany
	@Column (name = "doacoes_doador")
	private List<Doacao>doacoesDoador;

	public Doador(){}

	public Doador(String cpf, char sexo, TipoSanguineo tipoSanguineo, LocalDate dataDeNascimento, List<Doacao>doacoesDoador ){
		this.cpf = cpf;
        this.sexo = sexo;
        this.tipoSanguineo = tipoSanguineo;
        this.dataDeNascimento = dataDeNascimento;
        this.doacoesDoador = doacoesDoador;
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

	public TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public List<Doacao> getDoacoesDoador() {
		return doacoesDoador;
	}

	public void setDoacoesDoador(List<Doacao> doacoesDoador) {
		this.doacoesDoador = doacoesDoador;
	}
}
