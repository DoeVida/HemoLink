package br.senac.hemolink.modelo.dao.hemocentro;

import java.util.List;

import br.senac.hemolink.modelo.entidade.usuario.hemocentro.Hemocentro;

public interface HemocentroDAO {

	void inserirHemocentro(Hemocentro hemocentro);

	void deletarHemocentro(Hemocentro hemocentro);

	void atualizarHemocentro(Hemocentro hemocentro);

	List<Hemocentro> recuperarHemocentros();

	
}
