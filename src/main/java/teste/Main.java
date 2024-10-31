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
		Papel papel = new Papel();

		papel.setNomePapel("usuario");

		ContatoDAOImpl contatoDAO = new ContatoDAOImpl();
		Contato contato = new Contato();
		contato.setEmail("email@email");
		contato.setTelefone("dksdjs");

		FotoDAOImpl fotoDAO = new FotoDAOImpl();
		Foto fotoDoador = new Foto();
		byte[] conteudo = new byte[] { 1, 2, 3 };

		fotoDoador.setConteudo(conteudo);
		fotoDoador.setExtensao("String");

		Foto fotoHemocentro = new Foto();
		byte[] conteudoHemo = new byte[] { 3, 3, 3 };

		fotoDoador.setConteudo(conteudoHemo);
		fotoDoador.setExtensao("aaaa");

		EnderecoDAOImpl enderecoDAO = new EnderecoDAOImpl();
		Endereco enderecoHemocentro = new Endereco();

		enderecoHemocentro.setBairro("Bairro");
		enderecoHemocentro.setCep("12312");
		enderecoHemocentro.setCidade("Cidade");
		enderecoHemocentro.setEstado("Es");
		enderecoHemocentro.setLogradouro("Logadoiur");
		enderecoHemocentro.setNumero(2);

		Endereco enderecoDoador = new Endereco();

		enderecoDoador.setBairro("Bairro");
		enderecoDoador.setCep("12312");
		enderecoDoador.setCidade("Cidade");
		enderecoDoador.setEstado("Es");
		enderecoDoador.setLogradouro("Logadouro");
		enderecoDoador.setNumero(23);

		DoadorDAOImpl doadorDAO = new DoadorDAOImpl();
		Doador doador = new Doador();

		doador.setApelido("Apelido Doador");
		doador.setContato(contato);
		doador.setCpf("232123");
		doador.setDataDeNascimento(LocalDate.of(2009, 3, 30));
		doador.setEmail("email@doador.com");
		doador.setFoto(fotoDoador);
		doador.setNome("Miguel");
		doador.setPapel(papel);
		doador.setSenha("password");
		doador.setSexo('T');
		doador.setTipoSanguineo(TipoSanguineo.B_POSITIVO);

		fotoDoador.setUsuario(doador);

		ConquistaDAOImpl conquistaDAO = new ConquistaDAOImpl();
		Conquista conquista = new Conquista();

		conquista.setDescricao("Descricao Conquista");
		conquista.setNome("Nome Conquista");

		AquisicaoConquistaDAOImpl aquisicaoDAO = new AquisicaoConquistaDAOImpl();
		AquisicaoConquista aquisicao = new AquisicaoConquista();

		aquisicao.setDoador(doador);
		aquisicao.setConquista(conquista);
		aquisicao.setDataAquisicao(LocalDate.of(2012, 2, 24));

		ArmazenamentoDAOImpl armazenamentoDAO = new ArmazenamentoDAOImpl();
		Armazenamento armazenamento = new Armazenamento();

		armazenamento.setDataUltimaAtualizacao(LocalDate.now());

		EstoqueSangueDAOImpl estoqueSangueDAO = new EstoqueSangueDAOImpl();
		EstoqueSangue estoqueSangue = new EstoqueSangue();

		estoqueSangue.setArmazenamento(armazenamento);
		estoqueSangue.setQuantidadeLitros(10);
		estoqueSangue.setTipoSanguineo(TipoSanguineo.A_NEGATIVO);

		armazenamento.setDataUltimaAtualizacao(LocalDate.of(2020, 3, 4));

		DemandaDAOImpl demandaDAO = new DemandaDAOImpl();
		Demanda demanda = new Demanda();

		demanda.setCapacidade(Capacidade.EMERGENCIA);

		demanda.setQuantidadeLitros(10);
		demanda.setTipoSanguineo(TipoSanguineo.A_NEGATIVO);

		HemocentroDAOImpl hemocentroDAO = new HemocentroDAOImpl();
		Hemocentro hemocentro = new Hemocentro();

		hemocentro.setApelido("Apelido Hemocentro");
		hemocentro.setArmazenamento(armazenamento);

		hemocentro.setCnpj("1231231");
		hemocentro.setContato(contato);

		hemocentro.setEmail("email@hemocentro.com");
		hemocentro.setFoto(fotoHemocentro);
		hemocentro.setEndereco(enderecoHemocentro);
		hemocentro.setHorarioDuracao(Duration.ofHours(12));
		hemocentro.setHorarioInicio(LocalTime.of(12, 2));
		hemocentro.setNome("Nome");
		hemocentro.setPapel(papel);
		hemocentro.setSenha("Senha");

		enderecoHemocentro.setHemocentro(hemocentro);
		enderecoDoador.setHemocentro(hemocentro);
		fotoHemocentro.setUsuario(hemocentro);
		armazenamento.setHemocentro(hemocentro);
		demanda.setHemocentro(hemocentro);

		DoacaoDAOImpl doacaoDAO = new DoacaoDAOImpl();
		Doacao doacao = new Doacao();
		doacao.setDataDoacao(LocalDate.of(2020, 10, 20));
		doacao.setDoador(doador);
		doacao.setHemocentro(hemocentro);
		doacao.setHoraDoacao(LocalTime.of(12, 30));
		doacao.setStatus(Status.CONFIRMADA);
		doacao.setTipoSanguineo(TipoSanguineo.B_POSITIVO);

		CampanhaDAOImpl campanhaDAO = new CampanhaDAOImpl();
		Campanha campanha = new Campanha();

		campanha.setDescricaoCampanha("Descricao Campanha");
		campanha.setHemocentro(hemocentro);
		campanha.setTitulo("Titulo Camapnha");

		demanda.setCampanha(campanha);
		/*
		 * doador.getAquisicaoConquista().add(aquisicao);
		 * conquista.getAquisicaoConquista().add(aquisicao);
		 * armazenamento.getEstoqueSangue().add(estoqueSangue);
		 * armazenamento.getEstoqueSangue().add(estoqueSangue);
		 * hemocentro.getDemanda().add(demanda); hemocentro.getDoacoes().add(doacao);
		 * doador.getDoacoes().add(doacao); campanha.getDemandas().add(demanda);
		 * campanha.getDoacoes().add(doacao); hemocentro.getCampanhas().add(campanha);
		 */

		try {

			papelDAO.inserirPapel(papel);

			contatoDAO.inserirContato(contato);

			fotoDAO.inserirFoto(fotoHemocentro);
			fotoDAO.inserirFoto(fotoDoador);

			enderecoDAO.inserirEndereco(enderecoDoador);
			enderecoDAO.inserirEndereco(enderecoHemocentro);

			doadorDAO.inserirDoador(doador);

			conquistaDAO.inserirConquista(conquista);

			aquisicaoDAO.inserirAquisicaoConquista(aquisicao);

			armazenamentoDAO.inserirArmazenamento(armazenamento);

			estoqueSangueDAO.inserirEstoqueSangue(estoqueSangue);

			demandaDAO.inserirDemanda(demanda);

			hemocentroDAO.inserirHemocentro(hemocentro);

			doacaoDAO.inserirDoacao(doacao);

			campanhaDAO.inserirCampanha(campanha);
		} catch (Exception e) {
			System.out.println("Erro no código!");
		} finally {
			System.out.println("Acabou");
		}

	}
}
