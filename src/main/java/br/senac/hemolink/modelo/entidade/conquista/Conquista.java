package br.senac.hemolink.modelo.entidade.conquista;

<<<<<<< HEAD
public class Conquista {

	private int idConquista;
	private String nomeConquista;
	private String descricaoConquista;
	
	public Conquista () {}
=======
import java.io.Serializable;

import br.senac.hemolink.modelo.entidade.estoqueSangue.Entity;
import br.senac.hemolink.modelo.entidade.estoqueSangue.GeneratedValue;
import br.senac.hemolink.modelo.entidade.estoqueSangue.Id;
import br.senac.hemolink.modelo.entidade.estoqueSangue.Table;

@Entity
@Table (name = "conquista")
public class Conquista implements Serializable {
    private static final long serialVersionUID = 1L;
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_conquista", nullable = false, unique = true)
	private int idConquista;
	
	@Column(name = "nome_conquista", nullable = false, unique = false)	
	private String nomeConquista;
	
	@Column(name = "descricao_conquista", nullable = false, unique = false)
	private String descricaoConquista;
	
	public Conquista () { }
>>>>>>> 4bdda1935ef6273a4d82b63aec2b01c38d872d9e
	
	public Conquista (int idConquista, String nomeConquista, String descricaoConquista) {
		this.idConquista = idConquista;
		this.nomeConquista = nomeConquista;
		this.descricaoConquista = descricaoConquista;
<<<<<<< HEAD
		
=======
>>>>>>> 4bdda1935ef6273a4d82b63aec2b01c38d872d9e
	}
	
	public void setIdConquista (int idConquista) {
		this.idConquista = idConquista;
	}
	
	public int getIdConquista() {
		return idConquista;
	}
	
	public void setNomeConquista (String nomeConquista) {
		this.nomeConquista = nomeConquista;
	}
	public String getNomeConquista () {
		return nomeConquista;
	}
	
	public void setDescricaoConquista (String descricaoConquista) {
		this.descricaoConquista = descricaoConquista;
	}
	
	public String getDescxricaoConquista (){
		return descricaoConquista;
	}
}