package br.senac.hemolink.modelo.dao.endereco;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import br.senac.hemolink.modelo.entidade.endereco.Endereco;
//import br.senac.hemolink.modelo.entidade.endereco.Endereco_;
import br.senac.hemolink.modelo.entidade.usuario.Usuario;
//import br.senac.hemolink.modelo.entidade.usuario.Usuario_;
import br.senac.hemolink.modelo.factory.conexao.ConexaoFactory;

public class EnderecoDAOImpl implements EnderecoDAO {
	
	private ConexaoFactory fabrica;

	public EnderecoDAOImpl() {
		fabrica = new ConexaoFactory();
	}

	public void inserirEndereco(Endereco endereco) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.save(endereco);

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

	public void deletarEndereco(Endereco endereco) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.delete(endereco);

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

	public void atualizarEndereco(Endereco endereco) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.update(endereco);

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

	public List<Endereco> recuperarEnderecos() {

		Session sessao = null;
		List<Endereco> enderecos = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Endereco> criteria = construtor.createQuery(Endereco.class);
			Root<Endereco> raizEndereco = criteria.from(Endereco.class);

			criteria.select(raizEndereco);

			enderecos = sessao.createQuery(criteria).getResultList();

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

		return enderecos;
	}

	public List<Endereco> recuperarEnderecosCliente(Usuario usuario) {
		
		return null;
	}

	/*
	public List<Endereco> recuperarEnderecosCliente(Usuario usuario) {

		Session sessao = null;
		List<Endereco> enderecos = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Endereco> criteria = construtor.createQuery(Endereco.class);
			Root<Endereco> raizEndereco = criteria.from(Endereco.class);

			Join<Endereco, Usuario> juncaoCliente = raizEndereco.join(Endereco_.clientes);

			ParameterExpression<String> cpfCliente = construtor.parameter(String.class);
			criteria.where(construtor.equal(juncaoCliente.get(Usuario_.CPF), cpfCliente));

			enderecos = sessao.createQuery(criteria).setParameter(cpfCliente, usuario.getCpf()).getResultList();

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

		return enderecos;
	}*/
	
}
