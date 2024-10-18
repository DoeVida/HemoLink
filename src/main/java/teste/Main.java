package teste;

import java.time.LocalDate;
import java.time.LocalTime;

import br.senac.hemolink.modelo.dao.doacao.DoacaoDAOImpl;
import br.senac.hemolink.modelo.dao.endereco.EnderecoDAOImpl;
import br.senac.hemolink.modelo.dao.papel.PapelDAOImpl;
import br.senac.hemolink.modelo.entidade.conquista.Conquista;
import br.senac.hemolink.modelo.entidade.doacao.Doacao;
import br.senac.hemolink.modelo.entidade.endereco.Endereco;
import br.senac.hemolink.modelo.entidade.papel.Papel;
import br.senac.hemolink.modelo.entidade.usuario.doador.Doador;
import br.senac.hemolink.modelo.entidade.usuario.hemocentro.Hemocentro;


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
		
		// Conquista
				ConquistaDAOImpl conquistaDAO = new ConquistaDAOImpl();
				Conquista conquista = new Conquista();
				conquista.setDescricaoConquista("Teste");
				conquista.setIdConquista(0);
				conquista.setNomeConquista("Teste");
		 
				// Teste de insert de dados
				try {
					conquistaDAO.inserirConquista(conquista);
				} catch (Exception e) {
					System.out.println("Erro no código!");
				} finally {
					System.out.println("Enviado ao banco com Sucesso!");
				}
		 
				// Teste de deletar dados
				try {
					conquistaDAO.deletarConquista(conquista);
				} catch (Exception e) {
					System.out.println("Erro no código!");
				} finally {
					System.out.println("Enviado ao banco com Sucesso!");
				}
		 
				// Teste de atualizar dados
				try {
					conquista.setDescricaoConquista("Teste Atualizado");
					conquistaDAO.atualizarConquista(conquista);
				} catch (Exception e) {
					System.out.println("Erro no código!");
				} finally {
					System.out.println("Enviado ao banco com Sucesso!");
				}
		 
				// Teste de selecionar dados
				try {
					for (Conquista conquistas : conquistaDAO.recuperarConquistas()) {
						System.out.println("ID: " + conquistas.getIdConquista());
						System.out.println("Nome: " + conquistas.getNomeConquista());
						System.out.println("Descrição: " + conquistas.getDescricaoConquista());
					}
				} catch (Exception e) {
					System.out.println("Erro no código!");
				} finally {
					System.out.println("Enviado ao banco com Sucesso!");
				}
		 
		 
		// Papel
				PapelDAOImpl papelDAO = new PapelDAOImpl();
				Papel papel = new Papel();
				papel.setNomePapel("XXXXXX");
		 
				// Teste de insert de dados
				try {
					papelDAO.inserirPapel(papel);
				} catch (Exception e) {
					System.out.println("Erro no código!");
				} finally {
					System.out.println("Enviado ao banco com Sucesso!");
				}
		 
				// Teste de deletar dados
				try {
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
		 
		// Doacao
				DoacaoDAOImpl doacaoDAO = new DoacaoDAOImpl();
				Doador doador = new Doador();
				Hemocentro hemocentro = new Hemocentro();
		 
				Doacao doacao = new Doacao();
				doacao.setDoador(doador);
				doacao.setHemocentro(hemocentro);
				doacao.setDataDoacao(LocalDate.now());
				doacao.setHoraDoacao(LocalTime.now());
		 
				// Teste de insert de dados
				try {
					doacaoDAO.inserirDoacao(doacao);
				} catch (Exception e) {
					System.out.println("Erro no código!");
				} finally {
					System.out.println("Enviado ao banco com Sucesso!");
				}
		 
				// Teste de deletar dados
				try {
					doacaoDAO.deletarDoacao(doacao);
				} catch (Exception e) {
					System.out.println("Erro no código!");
				} finally {
					System.out.println("Enviado ao banco com Sucesso!");
				}
		 
				// Teste de atualizar dados
				try {
					doacao.setDataDoacao(LocalDate.of(2023, 10, 10));
					doacao.setHoraDoacao(LocalTime.of(14, 30));
					doacaoDAO.atualizarDoacao(doacao);
				} catch (Exception e) {
					System.out.println("Erro no código!");
				} finally {
					System.out.println("Enviado ao banco com Sucesso!");
				}
		 
				// Teste de selecionar dados
				try {
					for (Doacao d : doacaoDAO.recuperarDoacoes()) {
						System.out.println("ID: " + d.getIdDoacao());
						System.out.println("Doador: " + d.getDoador().getId());
		 
						System.out.println("Hemocentro: " + d.getHemocentro().getId());
		 
						System.out.println("Data: " + d.getDataDoacao());
						System.out.println("Hora: " + d.getHoraDoacao());
					}
				} catch (Exception e) {
					System.out.println("Erro no código!");
				} finally {
					System.out.println("Enviado ao banco com Sucesso!");
				}
		 
		 
		// Endereco
				EnderecoDAOImpl enderecoDAO = new EnderecoDAOImpl();
				Endereco endereco = new Endereco();
				endereco.setEstado("SP");
				endereco.setCidade("São Paulo");
				endereco.setBairro("Centro");
				endereco.setLogradouro("Avenida Paulista");
				endereco.setNumero(1000);
				endereco.setCep("12345678");
		 
				// Teste de insert de dados
				try {
					enderecoDAO.inserirEndereco(endereco);
				} catch (Exception e) {
					System.out.println("Erro no código!");
				} finally {
					System.out.println("Enviado ao banco com Sucesso!");
				}
		 
				// Teste de deletar dados
				try {
					enderecoDAO.deletarEndereco(endereco);
				} catch (Exception e) {
					System.out.println("Erro no código!");
				} finally {
					System.out.println("Enviado ao banco com Sucesso!");
				}
		 
				// Teste de atualizar dados
				try {
					endereco.setLogradouro("Rua Nova");
					endereco.setNumero(2000);
					enderecoDAO.atualizarEndereco(endereco);
				} catch (Exception e) {
					System.out.println("Erro no código!");
				} finally {
					System.out.println("Enviado ao banco com Sucesso!");
				}
		 
		// Endereco
				EnderecoDAOImpl enderecoDAO = new EnderecoDAOImpl();
				Endereco endereco = new Endereco();
				endereco.setEstado("SP");
				endereco.setCidade("São Paulo");
				endereco.setBairro("Centro");
				endereco.setLogradouro("Avenida Paulista");
				endereco.setNumero(1000);
				endereco.setCep("12345678");
		 
				// Teste de insert de dados
				try {
					enderecoDAO.inserirEndereco(endereco);
				} catch (Exception e) {
					System.out.println("Erro no código!");
				} finally {
					System.out.println("Enviado ao banco com Sucesso!");
				}
		 
				// Teste de deletar dados
				try {
					enderecoDAO.deletarEndereco(endereco);
				} catch (Exception e) {
					System.out.println("Erro no código!");
				} finally {
					System.out.println("Enviado ao banco com Sucesso!");
				}
		 
				// Teste de atualizar dados
				try {
					endereco.setLogradouro("Rua Nova");
					endereco.setNumero(2000);
					enderecoDAO.atualizarEndereco(endereco);
				} catch (Exception e) {
					System.out.println("Erro no código!");
				} finally {
					System.out.println("Enviado ao banco com Sucesso!");
				}
		 
				// Teste de selecionar dados
				try {
					for (Endereco enderecos : enderecoDAO.recuperarEnderecos()) {
						System.out.println("Estado: " + enderecos.getEstado());
						System.out.println("Cidade: " + enderecos.getCidade());
						System.out.println("Bairro: " + enderecos.getBairro());
						System.out.println("Logradouro: " + enderecos.getLogradouro());
						System.out.println("Número: " + enderecos.getNumero());
						System.out.println("CEP: " + enderecos.getCep());
					}
		 
				} catch (Exception e) {
					System.out.println("Erro no código!");
				} finally {
					System.out.println("Enviado ao banco com Sucesso!");
				}
		 

		

		
	}
}