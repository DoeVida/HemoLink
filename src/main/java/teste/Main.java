package teste;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;

import br.senac.hemolink.modelo.dao.armazenamento.ArmazenamentoDAOImpl;
import br.senac.hemolink.modelo.dao.contato.ContatoDAOImpl;
import br.senac.hemolink.modelo.dao.endereco.EnderecoDAOImpl;
import br.senac.hemolink.modelo.dao.estoqueSangue.EstoqueSangueDAOImpl;
import br.senac.hemolink.modelo.dao.foto.FotoDAOImpl;
import br.senac.hemolink.modelo.dao.papel.PapelDAOImpl;
import br.senac.hemolink.modelo.dao.usuario.doador.DoadorDAOImpl;
import br.senac.hemolink.modelo.dao.usuario.hemocentro.HemocentroDAOImpl;
import br.senac.hemolink.modelo.entidade.armazenamento.Armazenamento;
import br.senac.hemolink.modelo.entidade.contato.Contato;
import br.senac.hemolink.modelo.entidade.endereco.Endereco;
import br.senac.hemolink.modelo.entidade.estoqueSangue.EstoqueSangue;
import br.senac.hemolink.modelo.entidade.foto.Foto;
import br.senac.hemolink.modelo.entidade.papel.Papel;
import br.senac.hemolink.modelo.entidade.usuario.doador.Doador;
import br.senac.hemolink.modelo.entidade.usuario.hemocentro.Hemocentro;
import br.senac.hemolink.modelo.enumeracao.TipoSanguineo;

public class Main {

	public static void main(String[] args) {
		
		ArmazenamentoDAOImpl armazenamentoDAO = new ArmazenamentoDAOImpl();
		Armazenamento armazenamento= new Armazenamento();

//		armazenamentoDAO.inserirArmazenamento(armazenamento);
		
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

		fotoHemocentro.setConteudo(conteudoHemo);
		fotoHemocentro.setExtensao("aaaa");

		EnderecoDAOImpl enderecoDAO = new EnderecoDAOImpl();
		Endereco enderecoHemocentro = new Endereco();

		enderecoHemocentro.setBairro("Bairro");
		enderecoHemocentro.setCep("12312");
		enderecoHemocentro.setCidade("Cidade");
		enderecoHemocentro.setEstado("Es");
		enderecoHemocentro.setLogradouro("logadouro");
		enderecoHemocentro.setNumero(2);

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
		
		armazenamento.setDataUltimaAtualizacao(LocalDate.now());
		armazenamento.setDataUltimaAtualizacao(LocalDate.of(2020, 3, 4));
		
		EstoqueSangueDAOImpl estoqueSangueDAO = new EstoqueSangueDAOImpl();
		EstoqueSangue estoqueSangue = new EstoqueSangue();

		estoqueSangue.setQuantidadeLitros(10);
		estoqueSangue.setTipoSanguineo(TipoSanguineo.A_NEGATIVO);
		
//		armazenamento.getEstoqueSangue().add(estoqueSangue);
//		armazenamento.setEstoqueSangue(armazenamento.getEstoqueSangue());
		
		HemocentroDAOImpl hemocentroDAO = new HemocentroDAOImpl();
		Hemocentro hemocentro = new Hemocentro();
		
		hemocentro.setApelido("Apelido Hemocentro");
//		hemocentro.getArmazenamento().add(armazenamento);
//		hemocentro.setArmazenamento(hemocentro.getArmazenamento());
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
		
		//enderecoHemocentro.setHemocentro(hemocentro);
		fotoHemocentro.setUsuario(hemocentro);
		armazenamento.setHemocentro(hemocentro);
		
		try {
			
			System.out.println("Tentando Inserir Papel");
			papelDAO.inserirPapel(papel);

			System.out.println("Tentando Inserir Contato");
			contatoDAO.inserirContato(contato);

			System.out.println("Tentando Inserir Foto Hemocentro");
			fotoDAO.inserirFoto(fotoHemocentro);
			System.out.println("Tentando Inserir Foto Doador");
			fotoDAO.inserirFoto(fotoDoador);

			System.out.println("Tentando Inserir Endereco");
			enderecoDAO.inserirEndereco(enderecoHemocentro);

			System.out.println("Tentando Inserir Doador");
			doadorDAO.inserirDoador(doador);

			System.out.println("Tentando Inserir Armazenamento");
			armazenamentoDAO.inserirArmazenamento(armazenamento);
			
			System.out.println("Tentando Inserir Estoque Sangue");
			estoqueSangueDAO.inserirEstoqueSangue(estoqueSangue);

			System.out.println("Tentando Inserir Hemocentro");
			hemocentroDAO.inserirHemocentro(hemocentro);

		} catch (Exception e) {
			System.out.println("Erro no código!");
		} finally {
			System.out.println("Acabou");
		}

	}
}
