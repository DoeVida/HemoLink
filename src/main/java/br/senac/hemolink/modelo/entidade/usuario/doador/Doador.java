package br.senac.hemolink.modelo.entidade.usuario.doador;

import br.senac.hemolink.modelo.entidade.doacao.Doacao;
import br.senac.hemolink.modelo.entidade.usuario.Usuario;
import br.senac.hemolink.modelo.enumeracao.TipoSanguineo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Doador")
public class Doador extends Usuario implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column (name = "cpf_doador")
	private String cpf;
	
	@Column (name = "sexo_doador", length = 1, nullable = false)
	private char sexo;
	
	@Column (name = "dataDeNascimento_doador", nullable = false)
	private LocalDate dataDeNascimento ;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId
	@Column (name = "tipoSanguineo_doador", length = 11, nullable = true)
	private TipoSanguineo tipoSanguineo;
	
	@OneToMany(fetch = FetchType.LAZY )
	@MapsId
	@Column (name = "historicoDeDoacao")
	private List<Doacao>historicoDeDoacao;

	public Doador(){
		
	}

	public Doador(String cpf, char sexo, TipoSanguineo tipoSanguineo, 
			LocalDate dataDeNascimento, List<Doacao>historicoDeDoacao ){
		this.cpf = cpf;
        this.sexo = sexo;
        this.tipoSanguineo = tipoSanguineo;
        this.dataDeNascimento = dataDeNascimento;
        this.historicoDeDoacao = historicoDeDoacao;
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

	public List<Doacao> getHistoricoDeDoacao() {
		return historicoDeDoacao;
	}

	public void setHistoricoDeDoacao(List<Doacao> historicoDeDoacao) {
		this.historicoDeDoacao = historicoDeDoacao;
	}

}
