package teste;

import br.senac.hemolink.modelo.dao.papel.PapelDAOImpl;
import br.senac.hemolink.modelo.entidade.papel.Papel;


public class Main {

	public static void main(String[] args) {
		
		PapelDAOImpl papelDAO = new PapelDAOImpl();
		Papel papel = new Papel();
		papel.setNomePapel("aaa");
 
		// Teste de insert de dados
		try {
			papelDAO.inserirPapel(papel);
		} catch (Exception e) {
			System.out.println("Erro no código!");
		} finally {
			System.out.println("Enviado ao banco com Sucesso!");
		}
 
		// Teste de deletar dados
		/*try {
			papelDAO.deletarPapel(papel);
		} catch (Exception e) {
			System.out.println("Erro no código!");
		} finally {
			System.out.println("Enviado ao banco com Sucesso!");
		}
 
		// Teste de atualizar dados
		try {
			papel.setNomePapel("YYYYYY");
			papelDAO.atualizarPapel(papel);
		} catch (Exception e) {
			System.out.println("Erro no código!");
		} finally {
			System.out.println("Enviado ao banco com Sucesso!");
		}
 
		// Teste de selecionar dados
		try {
			for (Papel papeis : papelDAO.recuperarPapeis()) {
				System.out.println("ID: " + papeis.getIdPapel());
				System.out.println("Nome: " + papeis.getNomePapel());
				System.out.println("Apelido: " + papeis.getApelido());
			}
		} catch (Exception e) {
			System.out.println("Erro no código!");
		} finally {
			System.out.println("Enviado ao banco com Sucesso!");
		}
		
*/
		
	}
}