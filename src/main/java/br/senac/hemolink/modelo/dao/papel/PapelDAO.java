package br.senac.hemolink.modelo.dao.papel;

import br.senac.hemolink.modelo.entidade.papel.Papel;

public interface PapelDAO {
	
	void adicionarPapel (Papel papel);
	
	void deletarPapel (Papel papel);
	
	void atualizarPapel (Papel papel);
}
