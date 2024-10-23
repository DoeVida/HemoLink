package br.senac.hemolink.modelo.dao.estoqueSangue;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import br.senac.hemolink.modelo.entidade.estoqueSangue.EstoqueSangue;
import br.senac.hemolink.modelo.factory.conexao.ConexaoFactory;

public class EstoqueSangueDAOImpl implements EstoqueSangueDAO {

	private ConexaoFactory fabrica;

	public EstoqueSangueDAOImpl() {
		fabrica = new ConexaoFactory();
	}

	public void inserirEstoqueSangue(EstoqueSangue estoquesangue) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.save(estoquesangue);

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

	public void deletarEstoqueSangue(EstoqueSangue estoquesangue) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.delete(estoquesangue);

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

	public void atualizarEstoqueSangue(EstoqueSangue estoquesangue) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.update(estoquesangue);

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

	public List<EstoqueSangue> recuperarEstoques() {

		Session sessao = null;
		List<EstoqueSangue> estoques = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

		CriteriaQuery<EstoqueSangue> criteria = construtor.createQuery(EstoqueSangue.class);
			Root<EstoqueSangue> raizEstoqueSangue = criteria.from(EstoqueSangue.class);

			criteria.select(raizEstoqueSangue);

			estoques = sessao.createQuery(criteria).getResultList();

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

		return estoques;
	}
}