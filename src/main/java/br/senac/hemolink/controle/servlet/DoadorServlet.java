package br.senac.hemolink.controle.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.senac.hemolink.modelo.dao.contato.ContatoDAO;
import br.senac.hemolink.modelo.dao.contato.ContatoDAOImpl;
import br.senac.hemolink.modelo.dao.papel.PapelDAO;
import br.senac.hemolink.modelo.dao.papel.PapelDAOImpl;
import br.senac.hemolink.modelo.dao.usuario.doador.DoadorDAO;
import br.senac.hemolink.modelo.dao.usuario.doador.DoadorDAOImpl;
import br.senac.hemolink.modelo.entidade.contato.Contato;
import br.senac.hemolink.modelo.entidade.papel.Papel;
import br.senac.hemolink.modelo.entidade.usuario.doador.Doador;
import br.senac.hemolink.modelo.enumeracao.TipoSanguineo;

@WebServlet(urlPatterns = { "/inserir-doador", "/novo-doador" })
public class DoadorServlet extends HttpServlet {
	private static final long serialVersionUID = 878678693847L;
	private DoadorDAO daoDoador;
	private ContatoDAO daoContato;
	PapelDAO daoPapel;

	public void init() {
		daoDoador = new DoadorDAOImpl();
		daoContato = new ContatoDAOImpl();
		daoPapel = new PapelDAOImpl();
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
			case "/novo-doador":
				mostrarFormularioNovoDoador(request, response);
				break;
			case "/inserir-doador":
				inserirDoador(request, response);
				break;
			case "/deletar-doador":
				break;
			case "/editar-doador":
				mostrarFormularioEditarDoador(request, response);
				break;
			case "/atualizar-doador":
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
		List<Doador> doador = daoDoador.recuperarDoadores();
		request.setAttribute("Doador", doador);
		RequestDispatcher dispatcher = request.getRequestDispatcher("listar-Doador.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarFormularioNovoDoador(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/paginas/cadastro-doador.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarFormularioEditarDoador(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		long id = Long.parseLong(request.getParameter("id"));

		RequestDispatcher dispatcher = request.getRequestDispatcher("form-Doador.jsp");
		dispatcher.forward(request, response);
	}

	private void inserirDoador(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		Papel papel = new Papel("doador");

		String apelido = request.getParameter("apelido");
		String nome = request.getParameter("nome");
		// String senha = request.getParameter("senha");
		String cpf = request.getParameter("cpf");
		char sexo = request.getParameter("sexo").charAt(0);
		LocalDate dataDeNascimento = LocalDate.parse(request.getParameter("data-nascimento"));
		TipoSanguineo tipoSanguineo = TipoSanguineo
				.valueOf(request.getParameter("tipo-sanguineo").toUpperCase().replace("-", "_"));

		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");

		Contato contato = new Contato(email, telefone);

		Doador doador = new Doador(cpf, sexo, dataDeNascimento, tipoSanguineo, null, null);
		// Doador doador = new Doador(apelido, nome, null, null, papel, contato, cpf,
		// sexo, dataDeNascimento, tipoSanguineo);

		daoPapel.inserirPapel(papel);
		daoContato.inserirContato(contato);
		daoDoador.inserirDoador(doador);

		response.sendRedirect("index.jsp");

	}

	private void atualizarDoador(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		response.sendRedirect("listar");
	}

}