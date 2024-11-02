package br.senac.hemolink.modelo.dao.doador;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import br.senac.hemolink.modelo.entidade.usuario.doador.Doador;
import br.senac.hemolink.modelo.factory.conexao.ConexaoFactory;

public class DoadorDAOImpl {

	private ConexaoFactory fabrica;

	public DoadorDAOImpl() {
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

	public void inserirDoador(Doador doador) {
		Session sessao = null;

		try {
			sessao = abrirSessao(sessao);
			sessao.save(doador);
			sessao.getTransaction().commit();

		} catch (Exception exception) {
			erroSessao(sessao, exception);
		} finally {
			fecharSessao(sessao);
		}

	}

	public void deletarDoador(Doador doador) {
		Session sessao = null;
		try {
			sessao = abrirSessao(sessao);
			sessao.delete(doador);
			sessao.getTransaction().commit();
		} catch (Exception exception) {
			erroSessao(sessao, exception);
		} finally {
			fecharSessao(sessao);
		}
	}

	public void atualizarDoador(Doador doador) {
		Session sessao = null;
		try {
			sessao = abrirSessao(sessao);
			sessao.update(doador);
			sessao.getTransaction().commit();
		} catch (Exception exception) {
			erroSessao(sessao, exception);
		} finally {
			fecharSessao(sessao);
		}
	}

	public List<Doador> recuperarDoador() {

		Session sessao = null;
		List<Doador> doador = null;

		try {
			sessao = abrirSessao(sessao);
			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
			CriteriaQuery<Doador> criteria = construtor.createQuery(Doador.class);
			Root<Doador> raizDoador = criteria.from(Doador.class);
			criteria.select(raizDoador);
			doador = sessao.createQuery(criteria).getResultList();
			sessao.getTransaction().commit();
		}  catch (Exception exception) {
			erroSessao(sessao, exception);
		} finally {
			fecharSessao(sessao);
		}
		return doador;
	}
}
