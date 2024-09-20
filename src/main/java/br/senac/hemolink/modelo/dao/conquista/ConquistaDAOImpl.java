package br.senac.hemolink.modelo.dao.conquista;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import br.senac.hemolink.modelo.entidade.conquista.Conquista;
import br.senac.hemolink.modelo.entidade.usuario.doador.Doador;
import br.senac.hemolink.modelo.factory.conexao.ConexaoFactory;

public class ConquistaDAOImpl implements ConquistaDAO{

	private ConexaoFactory fabrica;

	public ConquistaDAOImpl() {
		fabrica = new ConexaoFactory();
	}
	
	@Override
	public void inserirConquista(Conquista conquista) {
	
		Session sessao = null;
		
		try {
			
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
			
			sessao.save(conquista);
			
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

	@Override
	public void deletarConquista(Conquista conquista) {
		
		Session sessao = null;
		
		try {
			
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
			
			sessao.delete(conquista);
			
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

	@Override
	public void atualizarConquista(Conquista conquista) {
		
		Session sessao = null;
		
		try {
			
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
			
			sessao.delete(conquista);
			
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
	
	@Override
	public List<Conquista> recuperarConquistas() {

		Session sessao = null;
		List<Conquista> conquistas = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Conquista> criteria = construtor.createQuery(Conquista.class);
			Root<Conquista> raizConquista = criteria.from(Conquista.class);

			criteria.select(raizConquista);

			conquistas = sessao.createQuery(criteria).getResultList();

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

		return conquistas;
	}
	
	@Override
	public List<Conquista> recuperarConquistasDoador(Doador doador) {
		
		Session sessao = null;
		List<Conquista> conquistas = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Conquista> criteria = construtor.createQuery(Conquista.class);
			Root<Conquista> raizConquista = criteria.from(Conquista.class);

			Join<Conquista, Doador> juncaoCliente = raizConquista.join(Conquista_.doador);

			ParameterExpression<String> cpfDoador = construtor.parameter(String.class);
			criteria.where(construtor.equal(juncaoCliente.get(Doador_.CPF), cpfDoador));

			conquistas = sessao.createQuery(criteria).setParameter(cpfDoador, doador.getCpf()).getResultList();

			sessao.getTransaction().commit();
		
		return null;
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

	return conquistas;
}
}
