package br.senac.hemolink.modelo.dao.doacao;

import java.util.List;

import br.senac.hemolink.modelo.entidade.doacao.Doacao;

public interface DoacaoDAO {

	void inserirDoacao(Doacao doacao);

	void deletarDoacao(Doacao doacao);

	void atualizarDoacao(Doacao doacao);

	List<Doacao> recuperarDoacoes();
}