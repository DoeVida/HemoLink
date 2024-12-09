package br.senac.hemolink.modelo.dao.endereco;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import br.senac.hemolink.modelo.entidade.endereco.Endereco;
import br.senac.hemolink.modelo.entidade.usuario.hemocentro.Hemocentro;
import br.senac.hemolink.modelo.entidade.usuario.hemocentro.Hemocentro_;
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

    public Endereco recuperarEnderecoPeloIdDeHemocentro(long idHemocentro) {

        Session sessao = null;
        Endereco enderecoRecuperado = null;

        try {

            sessao = fabrica.getConexao().openSession();
            sessao.beginTransaction();

            CriteriaBuilder construtor = sessao.getCriteriaBuilder();
            CriteriaQuery<Endereco> criteria = construtor.createQuery(Endereco.class);

            Root<Endereco> raizEndereco = criteria.from(Endereco.class);
            Join<Hemocentro, Endereco> joinEnderecoUsuario = raizEndereco.join(Hemocentro_.ENDERECO);

            
            criteria.select(joinEnderecoUsuario).where(construtor.equal(raizEndereco.get(Hemocentro_.ID), idHemocentro));

            enderecoRecuperado = sessao.createQuery(criteria).getSingleResult();

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

        return enderecoRecuperado;
    }

}