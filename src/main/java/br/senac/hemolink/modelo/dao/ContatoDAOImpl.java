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

import br.senac.hemolink.modelo.dao.ContatoDAO;
import br.senac.hemolink.modelo.entidade.contato.Contato;

public class ContatoDAOImpl implements ContatoDAO {

    @Override
    public void inserirContato(Contato contato) {
        Session sessao = null;

        try {
            sessao = conectarBanco().openSession();
            sessao.beginTransaction();

            sessao.save(contato);

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
    public void deletarContato(Contato contato) {
        Session sessao = null;

        try {
            sessao = conectarBanco().openSession();
            sessao.beginTransaction();

            sessao.remove(contato);

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
    public void atualizarContato(Contato contato) {
        Session sessao = null;

        try {
            sessao = conectarBanco().openSession();
            sessao.beginTransaction();

            sessao.update(contato);

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
    public List<Contato> recuperarContatos() {
        Session sessao = null;
        List<Contato> contatos = null;

        try {
            sessao = conectarBanco().openSession();
            sessao.beginTransaction();

            CriteriaBuilder construtor = sessao.getCriteriaBuilder();
            CriteriaQuery<Contato> criteria = construtor.createQuery(Contato.class);
            Root<Contato> raizContato = criteria.from(Contato.class);

            criteria.select(raizContato);

            contatos = sessao.createQuery(criteria).getResultList();

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

        return contatos;
    }

    private SessionFactory conectarBanco() {
        Configuration configuracao = new Configuration();
        configuracao.addAnnotatedClass(Contato.class);
        configuracao.configure("hibernate.cfg.xml");

        ServiceRegistry servico = new StandardServiceRegistryBuilder()
            .applySettings(configuracao.getProperties()).build();
        
        return configuracao.buildSessionFactory(servico);
    }
}
