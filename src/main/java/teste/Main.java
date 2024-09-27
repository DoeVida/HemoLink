package teste;

import br.senac.hemolink.modelo.dao.contato.ContatoDAOImpl;
import br.senac.hemolink.modelo.dao.endereco.EnderecoDAOImpl;
import br.senac.hemolink.modelo.entidade.contato.Contato;
import br.senac.hemolink.modelo.entidade.endereco.Endereco;

public class Main {

	public static void main(String[] args) {
		
		
		//Endereço
		EnderecoDAOImpl EnderecoDAO = new EnderecoDAOImpl();
		Endereco e1 = new Endereco();
		e1.setBairro("Centro");
		e1.setCep("89-000000");
		e1.setCidade("Blumenau");
		e1.setEstado("Santa Catarina");
		e1.setLogradouro("Hemocentro");
		e1.setNumero(34);
		
		// Teste de insert de dados
				try {
					EnderecoDAO.inserirEndereco(e1);
				} catch (Exception e) {
					System.out.println("Erro no inserir");
				} finally {
					System.out.println("Acabou!!!");
				}

	}
}
