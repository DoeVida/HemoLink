package br.senac.hemolink.modelo.dao.campanha;

import br.senac.hemolink.modelo.entidade.campanha.Campanha;

public interface CampanhaDAO {
	
	void inserirCampanha (Campanha campanha);
	
	void deletarCamoanha (Campanha campanha);
	
	void atualizarCampanha (Campanha campanha);

}
