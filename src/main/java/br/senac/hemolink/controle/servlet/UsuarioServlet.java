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

import br.senac.hemolink.modelo.dao.doador.DoadorDAO;
import br.senac.hemolink.modelo.dao.doador.DoadorDAOImpl;
import br.senac.hemolink.modelo.entidade.usuario.doador.Doador;
import br.senac.hemolink.modelo.enumeracao.TipoSanguineo;

@WebServlet("/")
public class UsuarioServlet extends HttpServlet {
	
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
		
		List<Doador> doador = dao.recuperarDoador();
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
		
		String cpf = request.getParameter("cpf");
		char sexo = request.getParameter("sexo").charAt(0);;
		LocalDate dataDeNascimento = LocalDate.parse(request.getParameter("dataDeNascimento"));
		TipoSanguineo tipoSanguineo = TipoSanguineo.valueOf(request.getParameter("tipoSanguineo"));
		dao.inserirDoador(new Doador(cpf, sexo, dataDeNascimento, tipoSanguineo));
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
