package br.senac.hemolink.modelo.dao.doador;

import java.util.List;

import br.senac.hemolink.modelo.entidade.usuario.doador.Doador;

public interface DoadorDAO {

	void inserirDoador (Doador doador);
	
	void deletarDoador (Doador doador);
	
	void atualizarDoador (Doador doador);
	
	List<Doador> recuperarDoadores();
}
