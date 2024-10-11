package teste;

import br.senac.hemolink.modelo.dao.doacao.DoacaoDAOImpl;
import br.senac.hemolink.modelo.entidade.doacao.Doacao;
import java.time.LocalDate;


public class Main {

	public static void main(String[] args) {
		
		DoacaoDAOImpl doacaoDAO = new DoacaoDAOImpl();
		Doacao doacao = new Doacao();
		doacao.setDataDoacao(LocalDate.of(2024, 12, 20));
 
		// Teste de insert de dados
		try {
			doacaoDAO.inserirDoacao(doacao);
		} catch (Exception e) {
			System.out.println("Erro no código!");
		} finally {
			System.out.println("Enviado ao banco com Sucesso!");
		}

		

		
	}
}