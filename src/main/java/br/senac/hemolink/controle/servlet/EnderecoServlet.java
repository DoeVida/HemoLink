package br.senac.hemolink.controle.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import br.senac.hemolink.modelo.dao.endereco.EnderecoDAOImpl;
import br.senac.hemolink.modelo.dao.endereco.EnderecoDAO;
import br.senac.hemolink.modelo.entidade.endereco.Endereco;
import br.senac.hemolink.modelo.entidade.usuario.Usuario;
import br.senac.hemolink.modelo.entidade.usuario.hemocentro.Hemocentro;
 
@WebServlet("/")
public class EnderecoServlet extends HttpServlet {
 
	private static final long serialVersionUID = 1L;
	private EnderecoDAO dao;
 
	public void init() {
		dao = new EnderecoDAOImpl();
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
				mostrarFormularioNovoEndereco(request, response);
				break;
 
			case "/inserir":
				inserirEndereco(request, response);
				break;
 
			case "/deletar":
				deletarContato(request, response);
				break;
 
			case "/editar":
				mostrarFormularioEditarContato(request, response);
				break;
 
			case "/atualizar":
				atualizarContato(request, response);
				break;
 
			default:
				listarContatos(request, response);
				break;
			}
 
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}
 
	private void listarContatos(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
 
		List<Endereco> contatos = dao.recuperarEnderecos();
		request.setAttribute("contatos", contatos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("listar-contato.jsp");
		dispatcher.forward(request, response);
	}
 
	private void mostrarFormularioNovoEndereco(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
 
		RequestDispatcher dispatcher = request.getRequestDispatcher("form-contato.jsp");
		dispatcher.forward(request, response);
	}
/*
	private void mostrarFormularioEditarContato(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
 
		long id = Long.parseLong(request.getParameter("id"));
		Endereco contato = dao.recuperarEnderecos(new Endereco(id));
		request.setAttribute("contato", contato);
		RequestDispatcher dispatcher = request.getRequestDispatcher("form-contato.jsp");
		dispatcher.forward(request, response);
	}*/
	
 
	private void inserirEndereco(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
 
		Endereco endereco = new Endereco();
		
		String estado = request.getParameter("hds=");
		String cidade = request.getParameter("hds=");
		String bairro = request.getParameter("hds=");
		String logradouro = request.getParameter("hds=");
		int numero = Integer.parseInt(estado);
		String cep = request.getParameter("hds=");
		Hemocentro hemocentro;

	    long hemocentroId = Long.parseLong(request.getParameter("hemocentroId"));

	    // Criar ou obter o DAO de Hemocentro e buscar o Hemocentro pelo ID
	    UsuarioDAO hemocentroDAO = new UsuarioDAO(); // Supondo que você tenha um DAO de Hemocentro
	    Hemocentro hemocentro = hemocentroDAO.recuperarHemocentro(hemocentroId);

		endereco.setEstado(estado);
		endereco.setCidade(cidade);
		endereco.setBairro(bairro);
		endereco.setLogradouro(logradouro);
		endereco.setNumero(numero);
		endereco.setCep(cep);
		endereco.setHemocentro(hemocentro);
		dao.inserirEndereco(endereco);
		response.sendRedirect("listar");
	}
 
	private void atualizarContato(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
 
		String estado = request.getParameter("estado");
		String cidade = request.getParameter("cidade");
		String bairro = request.getParameter("bairro");
		String logradouro = request.getParameter("logradouro");
		long numero = Long.parseLong(request.getParameter("numero"));
		String cep = request.getParameter("cep");
		long hemocentro = Long.parseLong(request.getParameter("hemocentro"));
		dao.atualizarEndereco(new Endereco(estado, cidade, bairro, logradouro, numero, cep, hemocentro));
		response.sendRedirect("listar");
	}
 
	private void deletarContato(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
 
		long id = Long.parseLong(request.getParameter("id"));
		Endereco endereco = dao.recuperarEnderecos(new Endereco(id));
		dao.deletarEndereco(endereco);
		response.sendRedirect("listar");
 
	}
}