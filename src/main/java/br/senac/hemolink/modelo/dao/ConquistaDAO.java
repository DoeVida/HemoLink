package br.senac.hemolink.modelo.dao;

import br.senac.hemolink.modelo.entidade.conquista.Conquista;

public interface ConquistaDAO {

	void inserirConquista (Conquista conquista);
	
	void deletarConquista (Conquista conquista);
	
	void atualizarConquista (Conquista conquista);
}
