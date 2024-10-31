package br.senac.hemolink.modelo.dao.contato;

import org.hibernate.Session;

import br.senac.hemolink.modelo.entidade.contato.Contato;
import br.senac.hemolink.modelo.factory.conexao.ConexaoFactory;

public class ContatoDAOImpl implements ContatoDAO{

	ConexaoFactory fabrica = null;
	
	public ContatoDAOImpl () {
		fabrica = new ConexaoFactory();
	}
	
	@Override
	public void inserirContato(Contato contato) {
		
		Session sessao = null;
		
		try {
			
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
			
			sessao.save(contato);
			
			sessao.getTransaction().commit();
		} catch (Exception sqlException) {
			
			sqlException.printStackTrace();
			
			if(sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}
		} finally {
			if (sessao != null) {
				sessao.close();
			}
		}	
	}

	@Override
	public void deletarContato(Contato contato) {
		
		Session sessao = null;
		
		try {
			
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
			
			sessao.delete(contato);
			
			sessao.getTransaction().commit();
		} catch (Exception sqlException) {
			
			sqlException.printStackTrace();
			
			if(sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}
		} finally {
			if (sessao != null) {
				sessao.close();
			}
		}	
		
	}

	@Override
	public void atualizarContato(Contato contato) {

		Session sessao = null;
		
		try {
			
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
			
			sessao.update(contato);
			
			sessao.getTransaction().commit();
		} catch (Exception sqlException) {
			
			sqlException.printStackTrace();
			
			if(sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}
		} finally {
			if (sessao != null) {
				sessao.close();
			}
		}	
		
	}

}
