package br.senac.hemolink.controle.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.senac.hemolink.modelo.dao.campanha.CampanhaDAO;
import br.senac.hemolink.modelo.dao.campanha.CampanhaDAOImpl;
import br.senac.hemolink.modelo.dao.demanda.DemandaDAO;
import br.senac.hemolink.modelo.dao.demanda.DemandaDAOImpl;
import br.senac.hemolink.modelo.dao.doacao.DoacaoDAO;
import br.senac.hemolink.modelo.dao.doacao.DoacaoDAOImpl;
import br.senac.hemolink.modelo.dao.usuario.hemocentro.HemocentroDAO;
import br.senac.hemolink.modelo.dao.usuario.hemocentro.HemocentroDAOImpl;
import br.senac.hemolink.modelo.entidade.campanha.Campanha;
import br.senac.hemolink.modelo.entidade.demanda.Demanda;
import br.senac.hemolink.modelo.entidade.doacao.Doacao;
import br.senac.hemolink.modelo.entidade.usuario.hemocentro.Hemocentro;
import br.senac.hemolink.modelo.enumeracao.Capacidade;
import br.senac.hemolink.modelo.enumeracao.TipoSanguineo;

@WebServlet(urlPatterns = "/inserir-campanha")
public class CampanhaServlet extends HttpServlet {
	private static final long serialVersionUID = 878678693847L;
	private CampanhaDAO daoCampanha;
	private HemocentroDAO daoHemocentro;
	private DemandaDAO daoDemanda;
	private DoacaoDAO daoDoacao;

	public void init() {
		daoCampanha = new CampanhaDAOImpl();
		daoHemocentro = new HemocentroDAOImpl();
		daoDemanda = new DemandaDAOImpl();
		daoDoacao = new DoacaoDAOImpl();
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
			case "/novo-campanha":
				mostrarFormularioNovaCampanha(request, response);
				break;
			case "/inserir-campanha":
				inserirCampanha(request, response);
				break;
			case "/deletar-campanha":
				break;
			case "/editar-campanha":
				mostrarFormularioEditarCampanha(request, response);
				break;
			case "/atualizar-campanha":
				atualizarCampanha(request, response);
				break;
			default:
				break;
			}

		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void mostrarFormularioNovaCampanha(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-campanha.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarFormularioEditarCampanha(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		long id = Long.parseLong(request.getParameter("id"));

		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-campanha.jsp");
		dispatcher.forward(request, response);
	}

	private void inserirCampanha(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		Demanda demanda = new Demanda();
		Doacao doacao = new Doacao();
		Hemocentro hemocentro = new Hemocentro();
		
		TipoSanguineo tipoSanguineo = TipoSanguineo.valueOf(request.getParameter("tipo-sanguineo").toUpperCase().replace("-", "_"));
        Capacidade capacidade = Capacidade.valueOf(request.getParameter("capacidade").toUpperCase().replace("-", "_"));
		
		String titulo = request.getParameter("titulo");
		String descricaoCampanha = request.getParameter("descricaoCampanha");
		LocalDate dataInicio = LocalDate.parse(request.getParameter("data-inicio"));
		LocalDate dataFim = LocalDate.parse(request.getParameter("data-fim"));
		
		Campanha campanha = new Campanha(titulo, descricaoCampanha, hemocentro, dataInicio, dataFim)

		daoPapel.inserirPapel(papel);
		daoContato.inserirContato(contato);
		daoCampanha.inserirCampanha(campanha);

		response.sendRedirect("listar");

	}

	private void atualizarCampanha(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		response.sendRedirect("listar");
	}

}