package br.senac.hemolink.modelo.dao.foto;

import java.util.List;

import br.senac.hemolink.modelo.entidade.foto.Foto;
import br.senac.hemolink.modelo.entidade.foto.Foto_;

public interface FotoDAO {

	void inserirFoto(Foto foto);

	void deletarFoto(Foto foto);

	void atualizarFoto(Foto foto);

	List<Foto> recuperarFotos();

	Foto consultarFotoId(Long id);
}