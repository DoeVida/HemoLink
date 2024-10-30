package teste;

import java.time.LocalDate;

import br.senac.hemolink.modelo.dao.contato.ContatoDAOImpl;
import br.senac.hemolink.modelo.dao.foto.FotoDAOImpl;
import br.senac.hemolink.modelo.dao.papel.PapelDAOImpl;
import br.senac.hemolink.modelo.dao.usuario.doador.DoadorDAOImpl;
import br.senac.hemolink.modelo.entidade.contato.Contato;
import br.senac.hemolink.modelo.entidade.foto.Foto;
import br.senac.hemolink.modelo.entidade.papel.Papel;
import br.senac.hemolink.modelo.entidade.usuario.doador.Doador;
import br.senac.hemolink.modelo.enumeracao.TipoSanguineo;

public class Main {

	public static void main(String[] args) {


			PapelDAOImpl papelDAO = new PapelDAOImpl();
			Papel papel = new Papel();
			
			papel.setNomePapel("usuario");
			papelDAO.inserirPapel(papel);
			
			ContatoDAOImpl contatoDAO = new ContatoDAOImpl();
			Contato contato = new Contato();
			contato.setEmail("email@email");
			contato.setTelefone("dksdjs");
			
			contatoDAO.inserirContato(contato);
			
			FotoDAOImpl fotoDAO = new FotoDAOImpl();
			Foto foto = new Foto();
			byte[] conteudo = new byte[] {1, 2, 3};
			
			foto.setConteudo(conteudo);
			foto.setExtensao("String");
			
			fotoDAO.inserirFoto(foto);
			
			
			DoadorDAOImpl doadorDAO = new DoadorDAOImpl();
			Doador doador = new Doador();
			
			doador.setApelido("apelido");
			doador.setCpf("123");
			doador.setDataDeNascimento(LocalDate.of(2023, 2, 2));
			doador.setEmail("email@email.com");
			doador.setNome("Nome");
			doador.setPapel(papel);
			doador.setSenha("senha");
			doador.setSexo('M');
			doador.setTipoSanguineo(TipoSanguineo.A_NEGATIVO);
			doador.setFoto(foto);
			doador.setContato(contato);
			
			
			try {
				doadorDAO.inserirDoador(doador);
			} catch (Exception e) {
				System.out.println("Erro no código!");
			} finally {
				System.out.println("Acabou");
			}

			
		
	}
}
