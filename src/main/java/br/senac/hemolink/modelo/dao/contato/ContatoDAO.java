package br.senac.hemolink.modelo.dao.contato;

import java.util.List;

import br.senac.hemolink.modelo.entidade.contato.Contato;

public interface ClienteDAO {

	void inserirCliente(Cliente cliente);

	void deletarCliente(Cliente cliente);

	void atualizarCliente(Cliente cliente);

	List<Cliente> recuperarClientes();
}
