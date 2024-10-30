package teste;

import br.senac.hemolink.modelo.entidade.usuario.Usuario;
import br.senac.hemolink.modelo.entidade.usuario.doador.Doador;

public class Main {

	public static void main(String[] args) {

		
		 UsuarioDAOImpl usuarioDAO = new UsuarioDAOImpl();
		 
		Usuario usuario = new Doador();
 
		usuario.setApelido("ddd");
		usuario.setId(null);
		// Teste de insert de dados
		try {
			usuarioDAO.inserirUsuario(usuario);
		} catch (Exception e) {
			System.out.println("Erro no código!");
		} finally {
			System.out.println("Acabou");
		}
	}
}
