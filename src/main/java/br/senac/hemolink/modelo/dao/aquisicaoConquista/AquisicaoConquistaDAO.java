package br.senac.hemolink.modelo.dao.aquisicaoConquista;

import br.senac.hemolink.modelo.entidade.aquisicaoConquista.AquisicaoConquista;

public interface AquisicaoConquistaDAO {

	void inserirAquisicaoConquista(AquisicaoConquista aquisicaoConquista);

	void deletarAquisicaoConquista(AquisicaoConquista aquisicaoConquista);

	void atualizarAquisicaoConquista(AquisicaoConquista aquisicaoConquista);

}