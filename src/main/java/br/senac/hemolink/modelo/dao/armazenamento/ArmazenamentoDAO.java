package br.senac.hemolink.modelo.dao.armazenamento;

import br.senac.hemolink.modelo.entidade.armazenamento.Armazenamento;

public interface ArmazenamentoDAO {

	void inserirArmazenamento (Armazenamento armazenamento);
	
	void deletarArmazenamento (Armazenamento armazenamento);
	
	void atualizarArmazenamento (Armazenamento armazenamento);
}
