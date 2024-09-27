package br.senac.hemolink.modelo.dao.endereco;

import br.senac.hemolink.modelo.entidade.endereco.Endereco;

public interface EnderecoDAO {
	
	void inserirEnderecos (Endereco endereco);
	
	void deletarEnderecos (Endereco endereco);
	
	void atualizarEndereco (Endereco endereco);

}
