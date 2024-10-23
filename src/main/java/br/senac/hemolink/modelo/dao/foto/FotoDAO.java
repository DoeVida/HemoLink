package br.senac.hemolink.modelo.dao.foto;

import br.senac.hemolink.modelo.entidade.foto.Foto;

public interface FotoDAO {

	void inserirFoto (Foto foto);
	
	void deletarFoto (Foto foto);
	
	void atualizarFoto (Foto foto);
}
