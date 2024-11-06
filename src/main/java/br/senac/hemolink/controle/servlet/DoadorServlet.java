package br.senac.hemolink.controle.servlet;
 
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
import br.senac.hemolink.modelo.dao.usuario.doador.DoadorDAO;
import br.senac.hemolink.modelo.entidade.aquisicaoConquista.AquisicaoConquista;
import br.senac.hemolink.modelo.entidade.doacao.Doacao;
import br.senac.hemolink.modelo.entidade.foto.Foto;
import br.senac.hemolink.modelo.entidade.papel.Papel;
import br.senac.hemolink.modelo.entidade.usuario.Usuario;
import br.senac.hemolink.modelo.entidade.usuario.doador.Doador;
import br.senac.hemolink.modelo.enumeracao.TipoSanguineo;
 
@WebServlet("/")
public class DoadorServlet extends HttpServlet {
	private static final long serialVersionUID = 878678693847L;
	private DoadorDAO dao;
 
	public void init() {
		dao = new DoadorDAOImpl();
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
 
		String action = request.getServletPath();
 
		try {
			switch (action) {
			case "/novo":
				mostrarFormularioNovoDoador(request, response);
				break;
			case "/inserir":
				inserirDoador(request, response);
				break;
			case "/deletar":
				deletarDoador(request, response);
				break;
			case "/editar":
				mostrarFormularioEditarDoador(request, response);
				break;
			case "/atualizar":
				atualizarDoador(request, response);
				break;
			default:
				listarDoadors(request, response);
				break;
			}
 
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}
 
	private void listarDoadors(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Doador> doador = dao.recuperarDoadores();
		request.setAttribute("Doador", doador);
		RequestDispatcher dispatcher = request.getRequestDispatcher("listar-Doador.jsp");
		dispatcher.forward(request, response);
	}
 
	private void mostrarFormularioNovoDoador(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("form-Doador.jsp");
		dispatcher.forward(request, response);
	}
 
	private void mostrarFormularioEditarDoador(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		long id = Long.parseLong(request.getParameter("id"));
		Doador Doador = dao.recuperarDoador(new Doador(id));
		request.setAttribute("Doador", Doador);
		RequestDispatcher dispatcher = request.getRequestDispatcher("form-Doador.jsp");
		dispatcher.forward(request, response);
	}
 
	private void inserirDoador(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {        
		
		Papel papel = new Papel("doador");
		
		Foto foto = new Foto();
	    foto.setConteudo((byte[]) request.getAttribute("conteudo_foto"));
	    foto.setExtensao(request.getParameter("extensao_foto"));	
	    
	    String apelido = request.getParameter("apelido");
	    String nome = request.getParameter("nome");
	    String senha = request.getParameter("senha");
	    String cpf = request.getParameter("cpf");
	    char sexo = request.getParameter("sexo").charAt(0);
	    LocalDate dataDeNascimento = LocalDate.parse(request.getParameter("data-de-nascimento"));
	    TipoSanguineo tipoSanguineo = TipoSanguineo.valueOf(request.getParameter("tipo-sanguineo"));
 
		Doador doador = new Doador(apelido, nome, foto, senha, papel, contato, cpf, sexo, dataDeNascimento);
		dao.inserirDoador(doador);
		response.sendRedirect("listar");
		
   }
	
 
	private void atualizarDoador(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		long id = Long.parseLong(request.getParameter("id"));
		dao.atualizarDoador(new Doador(id,telefone, email));
		response.sendRedirect("listar");
	}
 
	private void deletarDoador(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		long id = Long.parseLong(request.getParameter("id"));
		Doador doador = dao.recuperarDoador(new Doador(id));
		dao.deletarDoador(Doador);
		response.sendRedirect("listar");
	}
}