package br.senac.hemolink.modelo.dao.campanha;

import org.hibernate.Session;

import br.senac.hemolink.modelo.entidade.campanha.Campanha;
import br.senac.hemolink.modelo.factory.conexao.ConexaoFactory;

public class CampanhaDAOImpl implements CampanhaDAO {

	private ConexaoFactory fabrica = null;

	public CampanhaDAOImpl() {
		fabrica = new ConexaoFactory();
	}

	@Override
	public void inserirCampanha(Campanha campanha) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.save(campanha);

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
	public void deletarCampanha(Campanha campanha) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.delete(campanha);

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
	public void atualizarCampanha(Campanha campanha) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.update(campanha);

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

}