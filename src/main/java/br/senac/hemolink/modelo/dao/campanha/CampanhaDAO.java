package br.senac.hemolink.modelo.dao.campanha;

import java.util.List;

import br.senac.hemolink.modelo.entidade.campanha.Campanha;

public interface CampanhaDAO {

	void inserirCampanha(Campanha campanha);

	void deletarCampanha(Campanha campanha);

	void atualizarCampanha(Campanha campanha);

	List<Campanha> recuperarCampanhas();
}