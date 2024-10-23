package br.senac.hemolink.modelo.dao.foto;

import org.hibernate.Session;

import br.senac.hemolink.modelo.entidade.foto.Foto;
import br.senac.hemolink.modelo.factory.conexao.ConexaoFactory;

public class FotoDAOImpl implements FotoDAO{

	ConexaoFactory fabrica = null;
	
	public FotoDAOImpl () {
		fabrica = new ConexaoFactory();
	}
	
	@Override
	public void inserirFoto(Foto foto) {
		
		Session sessao = null;
		
		try {
			
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
			
			sessao.save(foto);
			
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

	@Override
	public void deletarFoto(Foto foto) {
		
		Session sessao = null;
		
		try {
			
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
			
			sessao.delete(foto);
			
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

	@Override
	public void atualizarFoto(Foto foto) {
		
Session sessao = null;
		
		try {
			
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
			
			sessao.update(foto);
			
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
