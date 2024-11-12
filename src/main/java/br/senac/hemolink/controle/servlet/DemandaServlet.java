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
import br.senac.hemolink.modelo.dao.demanda.DemandaDAO;
import br.senac.hemolink.modelo.dao.demanda.DemandaDAOImpl;
import br.senac.hemolink.modelo.entidade.campanha.Campanha;
import br.senac.hemolink.modelo.entidade.demanda.Demanda;
import br.senac.hemolink.modelo.entidade.usuario.hemocentro.Hemocentro;
import br.senac.hemolink.modelo.enumeracao.Capacidade;
import br.senac.hemolink.modelo.enumeracao.TipoSanguineo;

public class DemandaServlet {

	@WebServlet(urlPatterns = "/inserir-demanda")
	public class demandaServlet extends HttpServlet {
	    private static final long serialVersionUID = 878678693847L;
	    private DemandaDAO daodemanda;

	    public void init() {
	        daodemanda = new DemandaDAOImpl();
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
	                case "/novo-demanda":
	                    mostrarFormularioNovodemanda(request, response);
	                    break;
	                case "/inserir-demanda":
	                    inserirdemanda(request, response);
	                    break;
	                case "/deletar-demanda":
	                    break;
	                case "/editar-demanda":
	                    mostrarFormularioEditardemanda(request, response);
	                    break;
	                case "/atualizar-demanda":
	                    atualizardemanda(request, response);
	                    break;
	                default:
	                    listardemandas(request, response);
	                    break;
	            }

	        } catch (SQLException ex) {
	            throw new ServletException(ex);
	        }
	    }

	    private void listardemandas(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
	        List<Demanda> demanda = daodemanda.recuperarDemandas();
	        request.setAttribute("demanda", demanda);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("listar-demanda.jsp");
	        dispatcher.forward(request, response);
	    }

	    private void mostrarFormularioNovodemanda(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        RequestDispatcher dispatcher = request.getRequestDispatcher("form-demanda.jsp");
	        dispatcher.forward(request, response);
	    }

	    private void mostrarFormularioEditardemanda(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, ServletException, IOException {
	        long id = Long.parseLong(request.getParameter("id"));
	        RequestDispatcher dispatcher = request.getRequestDispatcher("form-demanda.jsp");
	        dispatcher.forward(request, response);
	    }

	    private void inserirdemanda(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
	    	TipoSanguineo tipoSanguineo = TipoSanguineo.valueOf(request.getParameter("tipo-sanguineo").toUpperCase().replace("-", "_"));
	    	Capacidade capacidade = Capacidade.valueOf(request.getParameter("tipo-sanguineo").toUpperCase());
	    	double quantidadeLitros = Double.parseDouble(request.getParameter("quantidade-litros"));

	        Hemocentro hemocentro = new Hemocentro();
	        Campanha campanha = new Campanha();
	        
	        Demanda demanda = new Demanda(tipoSanguineo, capacidade, quantidadeLitros, hemocentro, campanha);
	        
	        daodemanda.inserirDemanda(demanda);
	        
	        response.sendRedirect("listar");

	    }


	    private void atualizardemanda(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
	        response.sendRedirect("listar");
	    }
	}
}
