package br.senac.hemolink.modelo.dao.papel;

import org.hibernate.Session;
import org.hibernate.sql.ordering.antlr.Factory;

import br.senac.hemolink.modelo.entidade.papel.Papel;
import br.senac.hemolink.modelo.factory.conexao.ConexaoFactory;



public class PapelDAOImpl implements PapelDAO {
	
	private ConexaoFactory fabrica;
	
	public PapelDAOImpl() {
		fabrica = new ConexaoFactory();
	}
	
	public void inserirPapel(Papel papel) {
		
		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.save(papel);

			sessao.getTransaction().commit();
			
	} catch (Exception sqlException) {
		
		sqlException.printStackTrace();
		
		if (sessao.getTransaction() != null) {
		    sessao.getTransaction().rollback();
	  }
		
   } finally {
	
	   if (sessao != null) {
		   sessao.close();
	   }
   }
}
	public void deletarCliente(Papel papel) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
			
			sessao.delete(papel);
			
			sessao.getTransaction().commit();
			
} catch (Exception sqlException) {
	
	sqlException.printStackTrace();
	
	if (sessao.getTransaction() != null) {
		sessao.getTransaction().rollback();
	}
	
} finally {
	
	if (sessao != null) {
		sessao.close();
	  }
     }
   }
	
	public void atualizarPapel(Papel papel) {
		
		Session sessao = null;
		
		try {
			
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
			
			sessao.update(papel);
			
			sessao.getTransaction().commit();
			
		} catch (Exception sqlException) {
			
			sqlException.printStackTrace();
			
			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}
			
		} finally {
			
			if (sessao != null) {
				sessao.close();
			}
		}
	}

	
		
	}
	
	

	