package br.senac.hemolink.modelo.dao.conquista;

import br.senac.hemolink.modelo.entidade.conquista.Conquista;

public class TesteDAOConquista {

	public static void main(String[] args) {
		
		ConquistaDAOImpl conquistaDAO = new ConquistaDAOImpl();
		Conquista conquista = new Conquista();
		
		conquista.setDescricao("Primeira Doação realizada com sucesso");
		conquista.setId((long) 1);
		conquista.setNome("Primeira Gota");
		conquista.setAquisicaoConquista(null);
		
		conquistaDAO.inserirConquista(conquista);
	}

}
