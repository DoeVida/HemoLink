package br.senac.hemolink.modelo.dao.aquisicaoConquista;

import java.util.List;

import br.senac.hemolink.modelo.entidade.aquisicaoConquista.AquisicaoConquista;
import br.senac.hemolink.modelo.entidade.aquisicaoConquista.AquisicaoConquista_;

public class AquisicaoConquistaDAO {

	void inserirAquisicaoConquista(AquisicaoConquista aquisicaoConquista);

	void deletarAquisicaoConquista(AquisicaoConquista aquisicaoConquista);

	void atualizarAquisicaoConquista(AquisicaoConquista aquisicaoConquista);

	List<AquisicaoConquista> recuperarAquisicaoConquista();

}
