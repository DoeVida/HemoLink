package teste;

import java.time.LocalDate;
import java.util.ArrayList;

import br.senac.hemolink.modelo.dao.papel.PapelDAOImpl;
import br.senac.hemolink.modelo.dao.conquista.ConquistaDAOImpl;
import br.senac.hemolink.modelo.dao.contato.ContatoDAOImpl;
import br.senac.hemolink.modelo.dao.usuario.UsuarioDAOImpl;

import br.senac.hemolink.modelo.entidade.conquista.Conquista;
import br.senac.hemolink.modelo.entidade.contato.Contato;
import br.senac.hemolink.modelo.entidade.papel.Papel;
import br.senac.hemolink.modelo.entidade.usuario.Usuario;
import br.senac.hemolink.modelo.entidade.usuario.doador.Doador;
import br.senac.hemolink.modelo.enumeracao.TipoSanguineo;

public class Main {

	public static void main(String[] args) {

		// Contato
		ContatoDAOImpl ContatoDAO = new ContatoDAOImpl();
		Contato contato1 = new Contato();
		contato1.setEmail("aaaaa");
		contato1.setIdContato(123);
		contato1.setTelefone("999999999");

		// Teste de insert de dados
		try {
			ContatoDAO.inserirContato(contato1);
		} catch (Exception e) {
			System.out.println("Erro no código!");
		} finally {
			System.out.println("Enviado ao banco com Sucesso!");
		}

		// Teste de deletar dados
		try {
			ContatoDAO.deletarContato(contato1);
		} catch (Exception e) {
			System.out.println("Erro no código!");
		} finally {
			System.out.println("Enviado ao banco com Sucesso!");
		}

		// Teste de atualizar dados
		try {
			ContatoDAO.atualizarContato(contato1);
		} catch (Exception e) {
			System.out.println("Erro no código!");
		} finally {
			System.out.println("Enviado ao banco com Sucesso!");
		}

		// Teste de selecionar dados
		try {
			for (Contato contatos : ContatoDAO.recuperarContatos()) {
				System.out.println("ID: " + contatos.getIdContato());
				System.out.println("Email: " + contatos.getEmail());
				System.out.println("Telefone: " + contatos.getTelefone());
			}
		} catch (Exception e) {
			System.out.println("Erro no código!");
		} finally {
			System.out.println("Enviado ao banco com Sucesso!");
		}

		// Conquista
		ConquistaDAOImpl conquistaDAO = new ConquistaDAOImpl();
		Conquista conquista1 = new Conquista();
		conquista1.setDescricaoConquista("Teste");
		conquista1.setIdConquista(0);
		conquista1.setNomeConquista("Teste");

		// Teste de insert de dados
		try {
			conquistaDAO.inserirConquista(conquista1);
		} catch (Exception e) {
			System.out.println("Erro no código!");
		} finally {
			System.out.println("Enviado ao banco com Sucesso!");
		}

		// Teste de deletar dados
		try {
			conquistaDAO.deletarConquista(conquista1);
		} catch (Exception e) {
			System.out.println("Erro no código!");
		} finally {
			System.out.println("Enviado ao banco com Sucesso!");
		}

		// Teste de atualizar dados
		try {
			conquista1.setDescricaoConquista("Teste Atualizado");
			conquistaDAO.atualizarConquista(conquista1);
		} catch (Exception e) {
			System.out.println("Erro no código!");
		} finally {
			System.out.println("Enviado ao banco com Sucesso!");
		}

		// Teste de selecionar dados
		try {
			for (Conquista conquista : conquistaDAO.recuperarConquistas()) {
				System.out.println("ID: " + conquista.getIdConquista());
				System.out.println("Nome: " + conquista.getNomeConquista());
				System.out.println("Descrição: " + conquista.getDescricaoConquista());
			}
		} catch (Exception e) {
			System.out.println("Erro no código!");
		} finally {
			System.out.println("Enviado ao banco com Sucesso!");
		}

		// Doador
		DoadorDAOImpl doadorDAO = new DoadorDAOImpl();
		Doador doador1 = new Doador();
		doador1.setCpf("99999999999");
		doador1.setSexo('X');
		doador1.setDataDeNascimento(LocalDate.of(2000, 1, 1));
		doador1.setTipoSanguineo(TipoSanguineo.AB_POSITIVO);
		doador1.setHistoricoDeDoacao(new ArrayList<>());

		// Teste de insert de dados
		try {
			doadorDAO.inserirDoador(doador1);
		} catch (Exception e) {
			System.out.println("Erro no código!");
		} finally {
			System.out.println("Enviado ao banco com Sucesso!");
		}

		// Teste de deletar dados
		try {
			doadorDAO.deletarDoador(doador1);
		} catch (Exception e) {
			System.out.println("Erro no código!");
		} finally {
			System.out.println("Enviado ao banco com Sucesso!");
		}

		// Teste de atualizar dados
		try {
			doador1.setSexo('Y');
			doador1.setDataDeNascimento(LocalDate.of(2001, 1, 1));
			doador1.setTipoSanguineo(TipoSanguineo.B_NEGATIVO);
			doadorDAO.atualizarDoador(doador1);
		} catch (Exception e) {
			System.out.println("Erro no código!");
		} finally {
			System.out.println("Enviado ao banco com Sucesso!");
		}

		// Teste de selecionar dados
		try {
			for (Doador doador : doadorDAO.recuperarDoadores()) {
				System.out.println("CPF: " + doador.getCpf());
				System.out.println("Sexo: " + doador.getSexo());
				System.out.println("Data de Nascimento: " + doador.getDataDeNascimento());
				System.out.println("Tipo Sanguíneo: " + doador.getTipoSanguineo());
			}
		} catch (Exception e) {
			System.out.println("Erro no código!");
		} finally {
			System.out.println("Enviado ao banco com Sucesso!");
		}

		// Papel
		PapelDAOImpl papelDAO = new PapelDAOImpl();
		Papel papel1 = new Papel();
		papel1.setIdPapel(999);
		papel1.setNomePapel("XXXXXX");
		papel1.setApelido("ZZZZZZ");

		// Teste de insert de dados
		try {
			papelDAO.inserirPapel(papel1);
		} catch (Exception e) {
			System.out.println("Erro no código!");
		} finally {
			System.out.println("Enviado ao banco com Sucesso!");
		}

		// Teste de deletar dados
		try {
			papelDAO.deletarPapel(papel1);
		} catch (Exception e) {
			System.out.println("Erro no código!");
		} finally {
			System.out.println("Enviado ao banco com Sucesso!");
		}

		// Teste de atualizar dados
		try {
			papel1.setNomePapel("YYYYYY");
			papel1.setApelido("WWWWWW");
			papelDAO.atualizarPapel(papel1);
		} catch (Exception e) {
			System.out.println("Erro no código!");
		} finally {
			System.out.println("Enviado ao banco com Sucesso!");
		}

		// Teste de selecionar dados
		try {
			for (Papel papel : papelDAO.recuperarPapeis()) {
				System.out.println("ID: " + papel.getIdPapel());
				System.out.println("Nome: " + papel.getNomePapel());
				System.out.println("Apelido: " + papel.getApelido());
			}
		} catch (Exception e) {
			System.out.println("Erro no código!");
		} finally {
			System.out.println("Enviado ao banco com Sucesso!");
		}
	}
}
