package br.senac.hemolink.controle.servlet;
 
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.List;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import br.senac.hemolink.modelo.dao.armazenamento.ArmazenamentoDAO;
import br.senac.hemolink.modelo.dao.armazenamento.ArmazenamentoDAOImpl;
import br.senac.hemolink.modelo.dao.contato.ContatoDAO;
import br.senac.hemolink.modelo.dao.contato.ContatoDAOImpl;
import br.senac.hemolink.modelo.dao.endereco.EnderecoDAO;
import br.senac.hemolink.modelo.dao.endereco.EnderecoDAOImpl;
import br.senac.hemolink.modelo.dao.papel.PapelDAO;
import br.senac.hemolink.modelo.dao.papel.PapelDAOImpl;
import br.senac.hemolink.modelo.dao.usuario.hemocentro.HemocentroDAO;
import br.senac.hemolink.modelo.dao.usuario.hemocentro.HemocentroDAOImpl;
import br.senac.hemolink.modelo.entidade.contato.Contato;
import br.senac.hemolink.modelo.entidade.endereco.Endereco;
import br.senac.hemolink.modelo.entidade.papel.Papel;
import br.senac.hemolink.modelo.entidade.usuario.hemocentro.Hemocentro;
 
 
@WebServlet(urlPatterns = {"/inserir-hemocentro", "/novo-hemocentro"})
public class HemocentroServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private HemocentroDAO daoHemocentro;
	private EnderecoDAO daoEndereco;
	private ContatoDAO daoContato;
	private PapelDAO daoPapel;
	private ArmazenamentoDAO daoArmazenamento;
	
	   public void init() {
	        daoHemocentro = new HemocentroDAOImpl();
	        daoEndereco = new EnderecoDAOImpl();
	        daoContato = new ContatoDAOImpl();
	        daoPapel = new PapelDAOImpl();
	        daoArmazenamento = new ArmazenamentoDAOImpl();
	        
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
			
			case "/novo-hemocentro":
				mostrarFormularioNovoHemocentro(request, response);
				break;
				
			case "/inserir-hemocentro":
				inserirHemocentro(request, response);
				break;
				
			case "/deletar-hemocentro":
				break;
				
			case "/editar-hemocentro":
				mostrarFormularioEditarHemocentro(request, response);
				break;
				
			case "/atualizar-hemocentro":
				atualizarHemocentro(request, response);
				break;
				
			default:
				listarHemocentros(request, response);
				break;
			}
 
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}
 
	private void listarHemocentros(HttpServletRequest request, HttpServletResponse response)throws SQLException, IOException, ServletException {
		List<Hemocentro> hemocentros = daoHemocentro.recuperarHemocentros();
        request.setAttribute("Hemocentros", hemocentros);
        RequestDispatcher dispatcher = request.getRequestDispatcher("listar-Hemocentro.jsp");
        dispatcher.forward(request, response);
	}
 
	private void mostrarFormularioNovoHemocentro(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("paginas/cadastro-hemocentro.jsp");
		dispatcher.forward(request, response);
	}
 
	private void mostrarFormularioEditarHemocentro(HttpServletRequest request, HttpServletResponse response)throws SQLException, ServletException, IOException {
			
		long id = Long.parseLong(request.getParameter("id"));
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("form-hemocentro.jsp");
		dispatcher.forward(request, response);
 
	}
 
	private void inserirHemocentro(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
			Papel papel = new Papel("hemocentro");
        
        	String apelido = request.getParameter("apelido");
    		String nome = request.getParameter("nome");
    		String senha = request.getParameter("senha");
    		String cnpj = request.getParameter("cnpj");
        	LocalTime horarioInicio = LocalTime.parse(request.getParameter("horario-inicio"));
        	LocalTime horarioFim = LocalTime.parse(request.getParameter("horario-fim"));
   
        	
        	String estado = request.getParameter("estado");
        	String cidade = request.getParameter("cidade");
        	String bairro = request.getParameter("bairro");
        	String logradouro = request.getParameter("logradouro");
        	long numero = Long.parseLong(request.getParameter("numero"));
        	String cep = request.getParameter("cep");
        	
        	Endereco endereco = new Endereco(estado, cidade, bairro, logradouro, numero, cep);
        	
        	String email = request.getParameter("email");
        	String telefone = request.getParameter("telefone");
        	
        	Contato contato = new Contato(email, telefone);
        
        	Hemocentro hemocentro = new Hemocentro(apelido, nome, null, senha, papel, contato, cnpj, horarioInicio, horarioFim, null);
       
        	daoEndereco.inserirEndereco(endereco);
            daoPapel.inserirPapel(papel);
            daoContato.inserirContato(contato);
            daoHemocentro.inserirHemocentro(hemocentro);
             
            response.sendRedirect("index.jsp");
	}
 
	private void atualizarHemocentro(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		 response.sendRedirect("listar");
	}
}
 