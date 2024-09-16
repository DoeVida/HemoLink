package br.senac.hemolink.modelo.entidade.conquista;

import java.io.Serializable;
import javax.persistence.*;
import br.senac.hemolink.modelo.entidade.estoqueSangue.Entity;
import br.senac.hemolink.modelo.entidade.estoqueSangue.GeneratedValue;
import br.senac.hemolink.modelo.entidade.estoqueSangue.Id;
import br.senac.hemolink.modelo.entidade.estoqueSangue.Table;

@Entity
@Table (name = "conquista")

package br.senac.hemolink.modelo.entidade.conquista;

public class implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_conquista", nullable = false, unique = true)
	private int idConquista;
	
	@Column(name = "nome_conquista", nullable = false, unique = false)	
	private String nomeConquista;
	
	@Column(name = "descricao_conquista", nullable = false, unique = false)
	private String descricaoConquista;
	
	public Conquista () {}
	
	public Conquista (int idConquista, String nomeConquista, String descricaoConquista) {
		this.idConquista = idConquista;
		this.nomeConquista = nomeConquista;
		this.descricaoConquista = descricaoConquista;
		
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