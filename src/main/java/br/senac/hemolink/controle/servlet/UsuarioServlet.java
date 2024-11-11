package br.senac.hemolink.controle.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.senac.hemolink.modelo.dao.contato.ContatoDAO;
import br.senac.hemolink.modelo.dao.contato.ContatoDAOImpl;
import br.senac.hemolink.modelo.dao.papel.PapelDAO;
import br.senac.hemolink.modelo.dao.papel.PapelDAOImpl;
import br.senac.hemolink.modelo.dao.usuario.UsuarioDAO;
import br.senac.hemolink.modelo.dao.usuario.UsuarioDAOImpl;
import br.senac.hemolink.modelo.entidade.contato.Contato;
import br.senac.hemolink.modelo.entidade.papel.Papel;
import br.senac.hemolink.modelo.entidade.usuario.Usuario;
import br.senac.hemolink.modelo.enumeracao.TipoSanguineo;

@WebServlet(urlPatterns = "/login-Usuario")
public class UsuarioServlet extends HttpServlet {
    private static final long serialVersionUID = 878678693847L;
    private UsuarioDAO daoUsuario;
    private ContatoDAO daoContato;
    private PapelDAO daoPapel;

    public void init() {
        daoUsuario = new UsuarioDAOImpl();
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
                case "/novo-Usuario":
                    mostrarFormularioNovoUsuario(request, response);
                    break;
                case "/deletar-Usuario":
                    break;
                case "/login-Usuario":
                	break;
                case "/editar-Usuario":
                    mostrarFormularioEditarUsuario(request, response);
                    break;
                case "/atualizar-Usuario":
                    atualizarUsuario(request, response);
                    break;
                default:
                    break;
            }

        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void mostrarFormularioNovoUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("form-Usuario.jsp");
        dispatcher.forward(request, response);
    }

    private void mostrarFormularioEditarUsuario(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        long id = Long.parseLong(request.getParameter("id"));


        RequestDispatcher dispatcher = request.getRequestDispatcher("form-Usuario.jsp");
        dispatcher.forward(request, response);
    }

    private void atualizarUsuario(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        response.sendRedirect("listar");
    }
    
    private void loginUsuario(HttpServletRequest request, HttpServletResponse response) throws IOException {
    	HttpSession session = request.getSession();
    	
    	String apelido = request.getParameter("apelido");
    	String senha = request.getParameter("senha");
    	
    	Usuario usuario = daoUsuario.recuperarUsuarioPeloEmail(apelido);
    	
    	if (usuario != null && apelido.equals(usuario.getApelido()) && senha.equals(usuario.getSenha())) {
			session.setAttribute("usuariologado", usuario);
		}
    	response.sendRedirect(request.getContextPath());
    }


}