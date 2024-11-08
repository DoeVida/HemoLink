package br.senac.hemolink.modelo.dao.papel;

import java.util.List;

import br.senac.hemolink.modelo.entidade.papel.Papel;

public interface PapelDAO {

    void inserirPapel(Papel papel);

	void deletarPapel(Papel papel);

	void atualizarPapel(Papel papel);

	List<Papel> recuperarPapeis();
	
	Papel recuperarPapelPeloNome(String nome);
}