package br.senac.hemolink.modelo.dao.doador;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import br.senac.hemolink.modelo.factory.conexao.ConexaoFactory;

import br.senac.hemolink.modelo.entidade.usuario.doador.Doador;

public class DoadorDAOImpl implements DoadorDAO{
 
	private ConexaoFactory fabrica;
	
	public DoadorDAOImpl() {
		fabrica = new ConexaoFactory();
	}

	public void inserirDoador(Doador doador) {
		
		Session sessao = null;
		
		try {
			
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
			
			sessao.save(doador);
			
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
	
	public void deletarDoador(Doador doador) {
		
		Session sessao = null;
		
		try {
			
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
			
			sessao.delete(doador);
			
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
	public void atualizarDoador(Doador doador) {
		
		Session sessao = null;
		
		try {
			
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
			
			sessao.update(doador);
			
			sessao.getTransaction().commit();
			
		} catch (Exception sqlException){
			
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

	
	public List<Doador> recuperarDoadores() {
		
		Session sessao = null;
		List<Doador> doadores = null;
		
		try {
			
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
			
			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
			
			CriteriaQuery<Doador> criteria = construtor.createQuery(Doador.class);
			Root<Doador> raizDoador = criteria.from(Doador.class);
			
			criteria.select(raizDoador);
			
			doadores = sessao.createQuery(criteria).getResultList();
			
			sessao.getTransaction().commit();
		} catch (Exception sqlException) {
			
			sqlException.printStackTrace();
			
			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}
			
		} finally {
			
			if(sessao != null) {
				sessao.close();
			}
		}
		return doadores;
	}
}
