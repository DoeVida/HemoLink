package br.senac.hemolink.main;
 
import java.time.LocalDate;
 
import br.senac.hemolink.modelo.dao.foto.FotoDAO;
import br.senac.hemolink.modelo.dao.foto.FotoDAOImpl;
import br.senac.hemolink.modelo.dao.usuario.UsuarioDAO;
import br.senac.hemolink.modelo.dao.usuario.UsuarioDAOImpl;
import br.senac.hemolink.modelo.entidade.foto.Foto;
import br.senac.hemolink.modelo.entidade.usuario.doador.Doador;
import br.senac.hemolink.modelo.enumeracao.TipoSanguineo;
 
public class Teste {
 
	public static void main(String[] args) {
		/*
		 * Foto foto = new Foto(); foto.setConteudo(new byte[2]);
		 * foto.setExtensao("sim"); foto.setUsuario(null);
		 * 
		 * FotoDAO fotoDAO = new FotoDAOImpl(); fotoDAO.inserirFoto(foto);
		 */
		UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
		Doador usuario = new Doador();
 
		usuario.setApelido("Marii");
		usuario.setEmail("antoniorochadasilvaa@gmail.com");
		usuario.setContato(null);
		usuario.setCpf("09495049478");
		usuario.setDataDeNascimento(LocalDate.parse("1212-12-12"));
		usuario.setFoto(null);
		usuario.setNome("mariana");
		usuario.setSenha("123");
		usuario.setSexo('f');
		usuario.setTipoSanguineo(TipoSanguineo.O_NEGATIVO);
		usuario.setPapel(null);
 
		usuarioDAO.inserirUsuario(usuario);
 
		// Long id = 1L;
 
		// usuario.setId(id);
		// usuarioDAO.atualizarUsuario(usuario);
 
		// usuarioDAO.deletarUsuario(usuario);
 
	}
 
}