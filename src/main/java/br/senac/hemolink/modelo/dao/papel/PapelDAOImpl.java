package br.senac.hemolink.modelo.dao.papel;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import br.senac.hemolink.modelo.entidade.papel.Papel;
import br.senac.hemolink.modelo.factory.conexao.ConexaoFactory;

public class PapelDAOImpl implements PapelDAO {

	private final ConexaoFactory fabrica;

	public PapelDAOImpl() {
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

	public void inserirPapel(Papel papel) {
		Session sessao = null;
		try {
			sessao = abrirSessao(sessao);
			sessao.save(papel);
			sessao.getTransaction().commit();

		} catch (Exception exception) {
			erroSessao(sessao, exception);
		} finally {
			fecharSessao(sessao);
		}
	}

	public void deletarPapel(Papel papel) {
		Session sessao = null;
		try {
			sessao = abrirSessao(sessao);
			sessao.delete(papel);
			sessao.getTransaction().commit();
		} catch (Exception exception) {
			erroSessao(sessao, exception);
		} finally {
			fecharSessao(sessao);
		}
	}

	public void atualizarPapel(Papel papel) {
		Session sessao = null;
		try {
			sessao = abrirSessao(sessao);
			sessao.update(papel);
			sessao.getTransaction().commit();
		} catch (Exception exception) {
			erroSessao(sessao, exception);
		} finally {
			fecharSessao(sessao);
		}
	}

	public List<Papel> recuperarPapeis() {
		Session sessao = null;
		List<Papel> papeis = null;
		try {
			sessao = abrirSessao(sessao);
			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
			CriteriaQuery<Papel> criteria = construtor.createQuery(Papel.class);
			Root<Papel> raizCliente = criteria.from(Papel.class);
			criteria.select(raizCliente);
			papeis = sessao.createQuery(criteria).getResultList();
			sessao.getTransaction().commit();
		} catch (Exception exception) {
			erroSessao(sessao, exception);
		} finally {
			fecharSessao(sessao);
		}
		return papeis;
	}
}
