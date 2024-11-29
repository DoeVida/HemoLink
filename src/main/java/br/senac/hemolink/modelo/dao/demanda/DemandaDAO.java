package br.senac.hemolink.modelo.dao.demanda;

import java.util.List;

import br.senac.hemolink.modelo.entidade.demanda.Demanda;

public interface DemandaDAO {

	void inserirDemanda(Demanda demanda);

	void deletarDemanda(Demanda demanda);

	void atualizarDemanda(Demanda demanda);

	List<Demanda> recuperarDemandas();
}