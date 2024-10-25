package br.senac.hemolink.modelo.dao.endereco;

import java.util.List;

import br.senac.hemolink.modelo.entidade.endereco.Endereco;
import br.senac.hemolink.modelo.entidade.usuario.Usuario;

public interface EnderecoDAO {

	void inserirEndereco(Endereco endereco);

	void deletarEndereco(Endereco endereco);

	void atualizarEndereco(Endereco endereco);

	List<Endereco> recuperarEnderecos();
		
	List<Endereco> recuperarEnderecosCliente(Usuario usuario);
	
}
	
