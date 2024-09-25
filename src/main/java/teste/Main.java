package teste;

import br.senac.hemolink.modelo.dao.contato.ContatoDAOImpl;
import br.senac.hemolink.modelo.entidade.contato.Contato;

public class Main {

	public static void main(String[] args) {
		ContatoDAOImpl ContatoDAO = new ContatoDAOImpl();
		Contato c1 = new Contato();
		c1.setEmail("ssss");
		c1.setIdContato(1);
		c1.setTelefone("9999");
		
		Contato c2 = new Contato();
		c2.setEmail("aaaa");
		c2.setIdContato(23);
		c2.setTelefone("8888");
		
				
		try {
			ContatoDAO.inserirContato(c1);
		} catch (Exception e) {
			System.out.println("Erro no inserir");
		}finally {
			System.out.println("Acabou!!!");
		}
		
		
		
	}
}
