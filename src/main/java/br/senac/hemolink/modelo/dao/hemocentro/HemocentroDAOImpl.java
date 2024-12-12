package br.senac.hemolink.modelo.dao.hemocentro;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import br.senac.hemolink.modelo.entidade.usuario.hemocentro.Hemocentro;
import br.senac.hemolink.modelo.factory.conexao.ConexaoFactory;

public class HemocentroDAOImpl implements HemocentroDAO {

	private ConexaoFactory fabrica;

	public HemocentroDAOImpl() {
		fabrica = new ConexaoFactory();
	}

//	private void erroSessao(Session sessao, Exception exception) {
//		exception.printStackTrace();
//		if (sessao.getTransaction() != null) {
//			sessao.getTransaction().rollback();
//		}
//	}
//
//	private void fecharSessao(Session sessao) {
//		if (sessao != null) {
//			sessao.close();
//		}
//	}
//
//	private Session abrirSessao(Session sessao) {
//		sessao = fabrica.getConexao().openSession();
//		sessao.beginTransaction();
//		return sessao;
//	}

	public void inserirHemocentro(Hemocentro Hemocentro) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.save(Hemocentro);

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

	public void deletarHemocentro(Hemocentro hemocentro) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.delete(hemocentro);

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

	public void atualizarHemocentro(Hemocentro hemocentro) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.update(hemocentro);

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

	public List<Hemocentro> recuperarHemocentros() {

		Session sessao = null;
		List<Hemocentro> hemocentro = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Hemocentro> criteria = construtor.createQuery(Hemocentro.class);
			Root<Hemocentro> raizHemocentro = criteria.from(Hemocentro.class);

			criteria.select(raizHemocentro);

			hemocentro = sessao.createQuery(criteria).getResultList();

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

		return hemocentro;
	}

}
