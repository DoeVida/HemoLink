package br.senac.hemolink.modelo.dao.conquista;

import java.util.List;

import br.senac.hemolink.modelo.entidade.conquista.Conquista;
import br.senac.hemolink.modelo.entidade.usuario.doador.Doador;


public interface ConquistaDAO {
	
	void inserirConquista(Conquista conquista);

	void deletarConquista(Conquista conquista);

	void atualizarConquista(Conquista conquista);

	List<Conquista> recuperarConquistas();

	List<Conquista> recuperarConquistasDoador(Doador doador);

}
