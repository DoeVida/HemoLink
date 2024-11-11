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

import br.senac.hemolink.modelo.dao.doacao.DoacaoDAO;
import br.senac.hemolink.modelo.dao.doacao.DoacaoDAOImpl;
import br.senac.hemolink.modelo.entidade.doacao.Doacao;
import br.senac.hemolink.modelo.enumeracao.Status;
import br.senac.hemolink.modelo.enumeracao.TipoSanguineo;

@WebServlet(urlPatterns = "/inserir-doacao")
public class DoacaoServlet extends HttpServlet {
    private static final long serialVersionUID = 878678693847L;
    private DoacaoDAO daoDoacao;
 
    public void init() {
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
                case "/nova-doacao":
                    mostrarFormularioNovodoacao(request, response);
                    break;
                case "/inserir-doacao":
                    inserirdoacao(request, response);
                    break;
                case "/deletar-doacao":
                    break;
                case "/editar-doacao":
                    mostrarFormularioEditardoacao(request, response);
                    break;
                case "/atualizar-doacao":
                    atualizardoacao(request, response);
                    break;
                default:
                    listardoacoes(request, response);
                    break;
            }
 
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }
 
    private void listardoacoes(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        //List<Doacao> doacao = daoDoacao.recuperardoacaoPeloId();
    	//request.setAttribute("doacao", doacao);
        RequestDispatcher dispatcher = request.getRequestDispatcher("listar-doacao.jsp");
        dispatcher.forward(request, response);
    }
 
    private void mostrarFormularioNovodoacao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("form-doacao.jsp");
        dispatcher.forward(request, response);
    }
 
    private void mostrarFormularioEditardoacao(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        long id = Long.parseLong(request.getParameter("id"));
        RequestDispatcher dispatcher = request.getRequestDispatcher("form-doacao.jsp");
        dispatcher.forward(request, response);
    }
 
    private void inserirdoacao(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
    	
        LocalDate dataDoacao = LocalDate.parse(request.getParameter("data-daocao"));
        LocalTime horaDoacao = LocalTime.parse(request.getParameter("hora-daocao"));
        Status status = Status.valueOf(request.getParameter("status").toUpperCase());
        TipoSanguineo tipoSanguineo = TipoSanguineo.valueOf(request.getParameter("tipo-sanguineo").toUpperCase().replace("-", "_"));
        
        Doacao doacao = new Doacao();
      
        daoDoacao.inserirDoacao(doacao);
        
        response.sendRedirect("listar");
 
    }
 
 
    private void atualizardoacao(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        response.sendRedirect("listar");
    }
 
	
}
