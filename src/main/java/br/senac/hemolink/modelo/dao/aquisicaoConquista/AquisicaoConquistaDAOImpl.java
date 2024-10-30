package br.senac.hemolink.modelo.dao.aquisicaoConquista;

import java.util.List;

import org.hibernate.Session;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import br.senac.hemolink.modelo.entidade.aquisicaoConquista.AquisicaoConquista;
import br.senac.hemolink.modelo.factory.conexao.ConexaoFactory;

public class AquisicaoConquistaDAOImpl implements AquisicaoConquistaDAO {

	private ConexaoFactory fabrica;

	public AquisicaoConquistaDAOImpl() {
		fabrica = new ConexaoFactory();
	}

	public void inserirAquisicaoConquista(AquisicaoConquista aquisicaoConquista) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.save(aquisicaoConquista);

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

	public void deletarAquisicaoConquista(AquisicaoConquista aquisicaoConquista) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.delete(aquisicaoConquista);

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

	public void atualizarAquisicaoConquista(AquisicaoConquista aquisicaoConquista) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.update(aquisicaoConquista);

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

	public List<AquisicaoConquista> recuperarAquisicaoConquista() {

		Session sessao = null;
		List<AquisicaoConquista> aquisicaoConquistas = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<AquisicaoConquista> criteria = construtor.createQuery(AquisicaoConquista.class);
			Root<AquisicaoConquista> raizAquisicaoConquista = criteria.from(AquisicaoConquista.class);

			criteria.select(raizAquisicaoConquista);

			aquisicaoConquistas = sessao.createQuery(criteria).getResultList();

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

		return aquisicaoConquistas;
	}
}