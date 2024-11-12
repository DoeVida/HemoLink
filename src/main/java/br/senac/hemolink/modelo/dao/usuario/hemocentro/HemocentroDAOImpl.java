package br.senac.hemolink.modelo.dao.usuario.hemocentro;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import br.senac.hemolink.modelo.entidade.usuario.Usuario;
import br.senac.hemolink.modelo.entidade.usuario.doador.Doador;
import br.senac.hemolink.modelo.entidade.usuario.hemocentro.Hemocentro;
import br.senac.hemolink.modelo.entidade.usuario.hemocentro.Hemocentro_;
import br.senac.hemolink.modelo.factory.conexao.ConexaoFactory;

public class HemocentroDAOImpl implements HemocentroDAO {

	private final ConexaoFactory fabrica;

	public HemocentroDAOImpl() {
		fabrica = new ConexaoFactory();
	}

	private void erroSessao(Session sessao, Exception exception) {
		exception.printStackTrace();
		if (sessao.getTransaction() != null) {
			sessao.getTransaction().rollback();
		}
	}

	private void fecharSessao(Session sessao) {
		if (sessao != null) {
			sessao.close();
		}
	}

	private Session abrirSessao(Session sessao) {
		sessao = fabrica.getConexao().openSession();
		sessao.beginTransaction();
		return sessao;
	}

	public void inserirHemocentro(Hemocentro hemocentro) {
		Session sessao = null;
		try {
			sessao = abrirSessao(sessao);
			sessao.save(hemocentro);
			sessao.getTransaction().commit();

		} catch (Exception exception) {
			erroSessao(sessao, exception);
		} finally {
			fecharSessao(sessao);
		}
	}

	public void deletarHemocentro(Hemocentro hemocentro) {
		Session sessao = null;
		try {
			sessao = abrirSessao(sessao);
			sessao.delete(hemocentro);
			sessao.getTransaction().commit();
		} catch (Exception exception) {
			erroSessao(sessao, exception);
		} finally {
			fecharSessao(sessao);
		}
	}

	public void atualizarHemocentro(Hemocentro hemocentro) {
		Session sessao = null;
		try {
			sessao = abrirSessao(sessao);
			sessao.update(hemocentro);
			sessao.getTransaction().commit();
		} catch (Exception exception) {
			erroSessao(sessao, exception);
		} finally {
			fecharSessao(sessao);
		}
	}

	public List<Hemocentro> recuperarHemocentros() {
		Session sessao = null;
		List<Hemocentro> hemocentros = null;
		try {
			sessao = abrirSessao(sessao);
			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
			CriteriaQuery<Hemocentro> criteria = construtor.createQuery(Hemocentro.class);
			Root<Hemocentro> raizCliente = criteria.from(Hemocentro.class);
			criteria.select(raizCliente);
			hemocentros = sessao.createQuery(criteria).getResultList();
			sessao.getTransaction().commit();
		} catch (Exception exception) {
			erroSessao(sessao, exception);
		} finally {
			fecharSessao(sessao);
		}
		return hemocentros;
	}

	public Hemocentro recuperarHemocentroPeloId(long Id) {

		Session sessao = null;
		Hemocentro hemocentro = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.update(hemocentro);

			sessao.getTransaction().commit();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
			CriteriaQuery<Hemocentro> criteria = construtor.createQuery(Hemocentro.class);
			Root<Hemocentro> raizHemocentro = criteria.from(Hemocentro.class);
			criteria.select(raizHemocentro).where(construtor.equal(raizHemocentro.get(Hemocentro_.ID), id));
			hemocentro = sessao.createQuery(criteria).getSingleResult();
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
