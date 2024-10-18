package br.senac.hemolink.modelo.factory.conexao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class ConexaoFactory {

	public SessionFactory getConexao() {

		Configuration configuracao = new Configuration();

		configuracao.addAnnotatedClass(br.senac.hemolink.modelo.entidade.aquisicaoConquista.AquisicaoConquista.class);
		configuracao.addAnnotatedClass(br.senac.hemolink.modelo.entidade.armazenamento.Armazenamento.class);
		configuracao.addAnnotatedClass(br.senac.hemolink.modelo.entidade.campanha.Campanha.class);
		configuracao.addAnnotatedClass(br.senac.hemolink.modelo.entidade.conquista.Conquista.class);
		configuracao.addAnnotatedClass(br.senac.hemolink.modelo.entidade.contato.Contato.class);
		configuracao.addAnnotatedClass(br.senac.hemolink.modelo.entidade.demanda.Demanda.class);
		configuracao.addAnnotatedClass(br.senac.hemolink.modelo.entidade.doacao.Doacao.class);
		configuracao.addAnnotatedClass(br.senac.hemolink.modelo.entidade.endereco.Endereco.class);
		configuracao.addAnnotatedClass(br.senac.hemolink.modelo.entidade.estoqueSangue.EstoqueSangue.class);
		configuracao.addAnnotatedClass(br.senac.hemolink.modelo.entidade.papel.Papel.class);
		configuracao.addAnnotatedClass(br.senac.hemolink.modelo.entidade.usuario.Usuario.class);
		configuracao.addAnnotatedClass(br.senac.hemolink.modelo.entidade.usuario.doador.Doador.class);
		configuracao.addAnnotatedClass(br.senac.hemolink.modelo.entidade.usuario.hemocentro.Hemocentro.class);
		configuracao.addAnnotatedClass(br.senac.hemolink.modelo.entidade.foto.Foto.class);
		
		configuracao.configure("hibernate.cfg.xml");

		ServiceRegistry servico = new StandardServiceRegistryBuilder().applySettings(configuracao.getProperties()).build();
		SessionFactory fabricaSessao = configuracao.buildSessionFactory(servico);

		return fabricaSessao;
	}
}