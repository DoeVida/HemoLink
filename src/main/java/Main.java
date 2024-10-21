import java.time.LocalDate;
import java.time.LocalTime;

import br.senac.hemolink.modelo.dao.doacao.DoacaoDAOImpl;
import br.senac.hemolink.modelo.entidade.doacao.Doacao;
import br.senac.hemolink.modelo.entidade.usuario.doador.Doador;

public class Main {

	public static void main(String[] args) {
		DoacaoDAOImpl doacaoDAO = new DoacaoDAOImpl();
		Doador doador = new Doador();
	
		Doacao doacao = new Doacao();
		doacao.setDoador(null);
		doacao.setHemocentro(null);
		doacao.setDataDoacao(LocalDate.now());
		doacao.setHoraDoacao(LocalTime.now());
		doacao.setStatus(null);
		doacao.setTipoSanguineo(null);

		
		
		// Teste de deletar dados

		for (Doacao d : doacaoDAO.recuperarDoacoes()) {
			System.out.println("ID: " + d.getIdDoacao());
			System.out.println("Data: " + d.getDataDoacao());
			System.out.println("Hora: " + d.getHoraDoacao());
		}
				
	}

}
