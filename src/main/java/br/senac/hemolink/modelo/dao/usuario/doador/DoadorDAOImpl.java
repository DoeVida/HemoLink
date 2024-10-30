package br.senac.hemolink.modelo.dao.usuario.doador;

import br.senac.hemolink.modelo.entidade.usuario.doador.Doador;
import br.senac.hemolink.modelo.factory.conexao.ConexaoFactory;

import org.hibernate.Session;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import java.util.List;

public class DoadorDAOImpl implements DoadorDAO{

	private final ConexaoFactory fabrica;

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

	public void inserirDoador(Doador Doador) {
		Session sessao = null;
		try {
			sessao = abrirSessao(sessao);
			sessao.save(Doador);
			sessao.getTransaction().commit();

		} catch (Exception exception) {
			erroSessao(sessao, exception);
		} finally {
			fecharSessao(sessao);
		}
	}

	public void deletarDoador(Doador Doador) {
		Session sessao = null;
		try {
			sessao = abrirSessao(sessao);
			sessao.delete(Doador);
			sessao.getTransaction().commit();
		} catch (Exception exception) {
			erroSessao(sessao, exception);
		} finally {
			fecharSessao(sessao);
		}
	}

	public void atualizarDoador(Doador Doador) {
		Session sessao = null;
		try {
			sessao = abrirSessao(sessao);
			sessao.update(Doador);
			sessao.getTransaction().commit();
		} catch (Exception exception) {
			erroSessao(sessao, exception);
		} finally {
			fecharSessao(sessao);
		}
	}

	public List<Doador> recuperarDoadores() {
		Session sessao = null;
		List<Doador> Doadors = null;
		try {
			sessao = abrirSessao(sessao);
			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
			CriteriaQuery<Doador> criteria = construtor.createQuery(Doador.class);
			Root<Doador> raizCliente = criteria.from(Doador.class);
			criteria.select(raizCliente);
			Doadors = sessao.createQuery(criteria).getResultList();
			sessao.getTransaction().commit();
		} catch (Exception exception) {
			erroSessao(sessao, exception);
		} finally {
			fecharSessao(sessao);
		}
		return Doadors;
	}
}
