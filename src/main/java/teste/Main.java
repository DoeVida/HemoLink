package teste;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

import br.senac.hemolink.modelo.dao.aquisicaoConquista.AquisicaoConquistaDAOImpl;
import br.senac.hemolink.modelo.dao.armazenamento.ArmazenamentoDAOImpl;
import br.senac.hemolink.modelo.dao.campanha.CampanhaDAOImpl;
import br.senac.hemolink.modelo.dao.conquista.ConquistaDAOImpl;
import br.senac.hemolink.modelo.dao.contato.ContatoDAOImpl;
import br.senac.hemolink.modelo.dao.demanda.DemandaDAOImpl;
import br.senac.hemolink.modelo.dao.doacao.DoacaoDAOImpl;
import br.senac.hemolink.modelo.dao.endereco.EnderecoDAOImpl;
import br.senac.hemolink.modelo.dao.estoqueSangue.EstoqueSangueDAOImpl;
import br.senac.hemolink.modelo.dao.foto.FotoDAOImpl;
import br.senac.hemolink.modelo.dao.papel.PapelDAOImpl;
import br.senac.hemolink.modelo.dao.usuario.doador.DoadorDAOImpl;
import br.senac.hemolink.modelo.dao.usuario.hemocentro.HemocentroDAOImpl;
import br.senac.hemolink.modelo.entidade.aquisicaoConquista.AquisicaoConquista;
import br.senac.hemolink.modelo.entidade.armazenamento.Armazenamento;
import br.senac.hemolink.modelo.entidade.campanha.Campanha;
import br.senac.hemolink.modelo.entidade.conquista.Conquista;
import br.senac.hemolink.modelo.entidade.contato.Contato;
import br.senac.hemolink.modelo.entidade.demanda.Demanda;
import br.senac.hemolink.modelo.entidade.doacao.Doacao;
import br.senac.hemolink.modelo.entidade.endereco.Endereco;
import br.senac.hemolink.modelo.entidade.estoqueSangue.EstoqueSangue;
import br.senac.hemolink.modelo.entidade.foto.Foto;
import br.senac.hemolink.modelo.entidade.papel.Papel;
import br.senac.hemolink.modelo.entidade.usuario.doador.Doador;
import br.senac.hemolink.modelo.entidade.usuario.hemocentro.Hemocentro;
import br.senac.hemolink.modelo.enumeracao.Capacidade;
import br.senac.hemolink.modelo.enumeracao.Status;
import br.senac.hemolink.modelo.enumeracao.TipoSanguineo;

public class Main {

	public static void main(String[] args) {

		PapelDAOImpl papelDAO = new PapelDAOImpl();
		ArmazenamentoDAOImpl armazenamentoDAO = new ArmazenamentoDAOImpl();
		ContatoDAOImpl contatoDAO = new ContatoDAOImpl();
		EnderecoDAOImpl enderecoDAO = new EnderecoDAOImpl();
		FotoDAOImpl fotoDAO = new FotoDAOImpl();
		DoadorDAOImpl doadorDAO = new DoadorDAOImpl();
		EstoqueSangueDAOImpl estoqueSangueDAO = new EstoqueSangueDAOImpl();
		HemocentroDAOImpl hemocentroDAO = new HemocentroDAOImpl();
		CampanhaDAOImpl campanhaDAO = new CampanhaDAOImpl();
		DoacaoDAOImpl doacaoDAO = new DoacaoDAOImpl();
		ConquistaDAOImpl conquistaDAO = new ConquistaDAOImpl();
		AquisicaoConquistaDAOImpl aquisicaoConquistaDAO = new AquisicaoConquistaDAOImpl();
		DemandaDAOImpl demandaDAO = new DemandaDAOImpl();

		Armazenamento armazenamento = new Armazenamento();

		// --------------------------------------------//
		Papel papel = new Papel();

		papel.setNomePapel("usuario");

		// --------------------------------------------//
		Contato contato = new Contato();

		contato.setEmail("email@email");
		contato.setTelefone("1234");

		// --------------------------------------------//
		AquisicaoConquista aquisicaoConquista = new AquisicaoConquista();

		aquisicaoConquista.setDataAquisicao(LocalDate.now());

		// --------------------------------------------//
		Conquista conquista = new Conquista();

		conquista.setDescricao("Descricao");
		conquista.setNome("Nome");

		aquisicaoConquista.setConquista(conquista);

		// --------------------------------------------//
		Foto fotoDoador = new Foto();
		byte[] conteudo = new byte[] { 1, 2, 3 };

		fotoDoador.setConteudo(conteudo);
		fotoDoador.setExtensao("String");

		// --------------------------------------------//

		Foto fotoHemocentro = new Foto();
		byte[] conteudoHemo = new byte[] { 3, 3, 3 };

		fotoHemocentro.setConteudo(conteudoHemo);
		fotoHemocentro.setExtensao("aaaa");

		// --------------------------------------------//
		Endereco endereco = new Endereco();

		endereco.setBairro("Bairro");
		endereco.setCep("12312");
		endereco.setCidade("Cidade");
		endereco.setEstado("Es");
		endereco.setLogradouro("logadouro");
		endereco.setNumero(2);

		// --------------------------------------------//
		Doador doador = new Doador();

		doador.setApelido("Apelido Doador");
		doador.setContato(contato);
		doador.setCpf("232123");
		doador.setDataDeNascimento(LocalDate.of(2009, 3, 30));
		doador.setFoto(fotoDoador);
		doador.setNome("Miguel");
		doador.setPapel(papel);
		doador.setSenha("password");
		doador.setSexo('T');
		doador.setTipoSanguineo(TipoSanguineo.B_POSITIVO);

		fotoDoador.setUsuario(doador);

		armazenamento.setDataUltimaAtualizacao(LocalDate.now());
		armazenamento.setDataUltimaAtualizacao(LocalDate.of(2020, 3, 4));

		aquisicaoConquista.setDoador(doador);
		// --------------------------------------------//
		EstoqueSangue estoqueSangue = new EstoqueSangue();

		estoqueSangue.setQuantidadeLitros(10);
		estoqueSangue.setTipoSanguineo(TipoSanguineo.A_NEGATIVO);

		// --------------------------------------------//
		Hemocentro hemocentro = new Hemocentro();

		hemocentro.setApelido("Apelido Hemocentro");
		hemocentro.setCnpj("1231231");
		hemocentro.setContato(contato);
		hemocentro.setFoto(fotoHemocentro);
		hemocentro.setEndereco(endereco);
		hemocentro.setHorarioFim(LocalTime.now());
		hemocentro.setHorarioInicio(LocalTime.of(12, 2));
		hemocentro.setNome("Nome");
		hemocentro.setPapel(papel);
		hemocentro.setSenha("Senha");

		fotoHemocentro.setUsuario(hemocentro);
		armazenamento.setHemocentro(hemocentro);

		// --------------------------------------------//
		Doacao doacao = new Doacao();

		doacao.setDataDoacao(LocalDate.now());
		doacao.setDoador(doador);
		doacao.setHemocentro(hemocentro);
		doacao.setHoraDoacao(LocalTime.now());
		doacao.setStatus(Status.AGENDADA);
		doacao.setTipoSanguineo(TipoSanguineo.A_NEGATIVO);

		// --------------------------------------------//
		Campanha campanha = new Campanha();

		campanha.setDemandas(null);
		campanha.setDescricaoCampanha("Descricao");
		campanha.setHemocentro(hemocentro);
		campanha.setTitulo("Titulo");
		campanha.setDataInicio(LocalDate.now());
		campanha.setDataFim(LocalDate.now());

		// --------------------------------------------//
		Demanda demanda = new Demanda();

		demanda.setCampanha(campanha);
		demanda.setCapacidade(Capacidade.ADEQUADO);
		demanda.setHemocentro(hemocentro);
		demanda.setQuantidadeLitros(10);
		demanda.setTipoSanguineo(TipoSanguineo.A_NEGATIVO);

		// -------------- Teste Inserts ---------------//

		try {

			System.out.println("Tentando Inserir Papel");
			papelDAO.inserirPapel(papel);

			System.out.println("Tentando Inserir Contato");
			contatoDAO.inserirContato(contato);

			System.out.println("Tentando Inserir Conquista");
			conquistaDAO.inserirConquista(conquista);

			System.out.println("Tentando Inserir Foto Hemocentro");
			fotoDAO.inserirFoto(fotoHemocentro);

			System.out.println("Tentando Inserir Endereco");
			enderecoDAO.inserirEndereco(endereco);

			System.out.println("Tentando Inserir Doador");
			doadorDAO.inserirDoador(doador);

			System.out.println("Tentando Inserir Foto Doador");
			fotoDAO.inserirFoto(fotoDoador);

			System.out.println("Tentando Inserir AquisicaoConquista");
			aquisicaoConquistaDAO.inserirAquisicaoConquista(aquisicaoConquista);

			System.out.println("Tentando Inserir Estoque Sangue");
			estoqueSangueDAO.inserirEstoqueSangue(estoqueSangue);

			System.out.println("Tentando Inserir Hemocentro");
			hemocentroDAO.inserirHemocentro(hemocentro);

			System.out.println("Tentando Inserir Foto Hemocentro");
			fotoDAO.inserirFoto(fotoHemocentro);

			System.out.println("Tentando Inserir Armazenamento");
			armazenamentoDAO.inserirArmazenamento(armazenamento);

			System.out.println("Tentando Inserir Doacao");
			doacaoDAO.inserirDoacao(doacao);

			System.out.println("Tentando Inserir Campanha");
			campanhaDAO.inserirCampanha(campanha);

			System.out.println("Tentando Inserir Demanda");
			demandaDAO.inserirDemanda(demanda);
			
			//----------------------------------------------------------//
			
			armazenamento.getEstoqueSangue().add(estoqueSangue);
			armazenamento.setEstoqueSangue(armazenamento.getEstoqueSangue());
			
			campanha.getDemandas().add(demanda);
			campanha.setDemandas(campanha.getDemandas());
			
			campanha.getDoacoes().add(doacao);
			campanha.setDoacoes(campanha.getDoacoes());

			conquista.getAquisicaoConquista().add(aquisicaoConquista);
			conquista.setAquisicaoConquista(conquista.getAquisicaoConquista());
			
			doador.getDoacoes().add(doacao);
			doador.setDoacoes(doador.getDoacoes());
			
			doador.getAquisicaoConquista().add(aquisicaoConquista);
			doador.setAquisicaoConquista(doador.getAquisicaoConquista());
			
			hemocentro.getDemanda().add(demanda);
			hemocentro.setDemanda(hemocentro.getDemanda());
			
			hemocentro.getArmazenamento().add(armazenamento);
			hemocentro.setArmazenamento(hemocentro.getArmazenamento());
			
			hemocentro.getCampanhas().add(campanha);
			hemocentro.setCampanhas(hemocentro.getCampanhas());
			
			hemocentro.getDoacoes().add(doacao);
			hemocentro.setDoacoes(hemocentro.getDoacoes());
			
			//----------------------------------------------------------//
			
			System.out.println("Tentando Atualizar Armazenamento");
			armazenamentoDAO.atualizarArmazenamento(armazenamento);
			
			System.out.println("Tentando Atualizar Campanha");
			campanhaDAO.atualizarCampanha(campanha);
			
			System.out.println("Tentando Atualizar Conquista");
			conquistaDAO.atualizarConquista(conquista);
			
			System.out.println("Tentando Atualizar Doador");
			doadorDAO.atualizarDoador(doador);
			
			System.out.println("Tentando Atualizar Hemocentro");
			hemocentroDAO.atualizarHemocentro(hemocentro);
			
		} catch (Exception e) {
			System.out.println("Erro no código!");
		} finally {
			System.out.println("Acabou");
		}

	}
}
