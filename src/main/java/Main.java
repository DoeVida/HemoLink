import br.senac.hemolink.modelo.dao.usuario.UsuarioDAOImpl;
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
		/*
		 * // Teste de deletar dados try { usuarioDAO.deletarUsuario(usuario); } catch
		 * (Exception e) { System.out.println("Erro no código!"); } finally {
		 * System.out.println("Enviado ao banco com Sucesso!"); }
		 * 
		 * // Teste de atualizar dados try { usuario.setContato(null); } catch
		 * (Exception e) { System.out.println("Erro no código!"); } finally {
		 * System.out.println("Enviado ao banco com Sucesso!"); }
		 */
	}

}
