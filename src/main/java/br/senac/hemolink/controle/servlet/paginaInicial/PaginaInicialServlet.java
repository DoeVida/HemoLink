package br.senac.hemolink.controle.servlet.paginaInicial;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.senac.hemolink.modelo.dao.campanha.CampanhaDAO;
import br.senac.hemolink.modelo.dao.campanha.CampanhaDAOImpl;
import br.senac.hemolink.modelo.dao.endereco.EnderecoDAO;
import br.senac.hemolink.modelo.dao.endereco.EnderecoDAOImpl;
import br.senac.hemolink.modelo.entidade.campanha.Campanha;
import br.senac.hemolink.modelo.entidade.endereco.Endereco;

@WebServlet(urlPatterns = {"/inicio"})
public class PaginaInicialServlet extends HttpServlet{

	private EnderecoDAO enderecoDAO;
	private CampanhaDAO campanhaDAO;
	
	public void init () {
		enderecoDAO = new EnderecoDAOImpl();
		campanhaDAO = new CampanhaDAOImpl();
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getServletPath();
		
		switch (action) {
			case "/inicio" : 
				telaInicio(request, response);
			break;
		}
	}
	
	private void telaInicio (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Campanha> campanhas = campanhaDAO.recuperarCampanhas();
		
		Campanha campanha1 = new Campanha();
		Campanha campanha2 = new Campanha();
		
		for(Campanha campanha : campanhas) {
			if(campanha != campanha1 && campanha != campanha2) {
				if (campanha1 == null || campanha.getDataInicio().isAfter(campanha1.getDataInicio()) ) {
					campanha1 = campanha;
				}
				if (campanha2 == null || campanha.getDataInicio().isAfter(campanha2.getDataInicio()) ) {
					campanha2 = campanha;
				}
			}
		}
		
		campanhas.clear();
		campanhas.add(campanha1);
		campanhas.add(campanha2);
		
		Endereco endereco;
		
		for(Campanha campanha : campanhas) {
			endereco = enderecoDAO.recuperarEnderecoPeloIdDeHemocentro(campanha.getHemocentro().getId());
			
			campanhas.remove(campanha);
			
			campanha.getHemocentro().getEndereco();
		
			campanhas.add(campanha);
		}
		
		request.setAttribute("campanhas", campanhas);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Paginas/tela-inicial.jsp");
		dispatcher.forward(request, response);
	}
}
