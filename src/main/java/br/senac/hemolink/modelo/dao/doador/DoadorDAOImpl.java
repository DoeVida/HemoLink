package br.senac.hemolink.modelo.dao.doador;

import java.util.List;

import org.hibernate.Session;

import br.senac.hemolink.modelo.entidade.usuario.doador.Doador;

public class DoadorDAOImpl implements DoadorDAO{
 
	private conexaoFactory fabrica;
	
	public DoadorDAOImpl() {
		fabrica = new ConexaoFactory();
	}

	public void inserirDoador(Doador doador) {
		
		Session sessao = null;
		
		try {
			
			sessao = fabrica.getconexao().openSession();
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
			
			sessao = fabrica.getConecxao().openSession();
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
			
			sessao = fabrica.getConection().openSection();
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
		
		try {
			
			sessao = fabrica.getConection().openSection();
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
