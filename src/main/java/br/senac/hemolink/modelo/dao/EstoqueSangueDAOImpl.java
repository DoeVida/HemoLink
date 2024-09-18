package br.senac.hemolink.modelo.dao.impl;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import br.senac.hemolink.modelo.dao.EstoqueSangueDAO;
import br.senac.hemolink.modelo.entidade.estoqueSangue.EstoqueSangue;

public class EstoqueSangueDAOImpl implements EstoqueSangueDAO {

    @Override
    public void inserirEstoqueSangue(EstoqueSangue estoqueSangue) {
        Session sessao = null;
        try {
            sessao = conectarBanco().openSession();
            sessao.beginTransaction();

            sessao.save(estoqueSangue);

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
    public void deletarEstoqueSangue(EstoqueSangue estoqueSangue) {
        Session sessao = null;
        try {
            sessao = conectarBanco().openSession();
            sessao.beginTransaction();

            sessao.remove(estoqueSangue);

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
    public void atualizarEstoqueSangue(EstoqueSangue estoqueSangue) {
        Session sessao = null;
        try {
            sessao = conectarBanco().openSession();
            sessao.beginTransaction();

            sessao.update(estoqueSangue);

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
    public List<EstoqueSangue> recuperarEstoques() {
        Session sessao = null;
        List<EstoqueSangue> estoques = null;

        try {
            sessao = conectarBanco().openSession();
            sessao.beginTransaction();

            CriteriaBuilder construtor = sessao.getCriteriaBuilder();
            CriteriaQuery<EstoqueSangue> criteria = construtor.createQuery(EstoqueSangue.class);
            Root<EstoqueSangue> raizEstoque = criteria.from(EstoqueSangue.class);

            criteria.select(raizEstoque);

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

    private SessionFactory conectarBanco() {
        Configuration configuracao = new Configuration();
        configuracao.addAnnotatedClass(EstoqueSangue.class);
        configuracao.configure("hibernate.cfg.xml");

        ServiceRegistry servico = new StandardServiceRegistryBuilder()
            .applySettings(configuracao.getProperties()).build();

        return configuracao.buildSessionFactory(servico);
    }
}
