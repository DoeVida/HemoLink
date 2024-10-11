package br.senac.hemolink.modelo.dao.endereco;

import java.util.List;

import br.senac.hemolink.modelo.entidade.usuario.Usuario;
import br.senac.hemolink.modelo.entidade.endereco.Endereco;

public interface EnderecoDAO {
	
	void inserirEnderecos (Endereco endereco);
	
	void deletarEnderecos (Endereco endereco);
	
	void atualizarEndereco (Endereco endereco);

	List<Endereco> recuperarEnderecos();
	
	List<Endereco> recuperarEnderecosUsuario(Usuario usuario);
}
