package br.senac.homelink.modelo.main;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

import br.senac.hemolink.modelo.dao.campanha.CampanhaDAOImpl;
import br.senac.hemolink.modelo.dao.endereco.EnderecoDAOImpl;
import br.senac.hemolink.modelo.dao.usuario.UsuarioDAOImpl;
import br.senac.hemolink.modelo.dao.usuario.hemocentro.HemocentroDAOImpl;
import br.senac.hemolink.modelo.entidade.campanha.Campanha;
import br.senac.hemolink.modelo.entidade.endereco.Endereco;
import br.senac.hemolink.modelo.entidade.usuario.hemocentro.Hemocentro;

public class Main {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco();
		Campanha campanha = new Campanha();
		Hemocentro hemocentro = new Hemocentro();
		
		EnderecoDAOImpl enderecoDAO = new EnderecoDAOImpl();
		CampanhaDAOImpl campanhaDAO = new CampanhaDAOImpl();
		UsuarioDAOImpl usuarioDAO = new UsuarioDAOImpl();
		
		endereco.setBairro("Garcia");
		endereco.setCep("89020700");
		endereco.setCidade("Blumenau");
		endereco.setEstado("SC");
		endereco.setLogradouro("Peixinho dourado");
		endereco.setNumero(266);
		
		hemocentro.setApelido("Angelinho");
		hemocentro.setCnpj("88442255886644");
		hemocentro.setEndereco(endereco);
		hemocentro.setHorarioDuracao(Duration.ofHours(1));
		hemocentro.setHorarioInicio(LocalTime.now());
		hemocentro.setNome("Angelo");
		hemocentro.setSenha("123");
		
		campanha.setDataFim(LocalDate.now());
		campanha.setDataInicio(LocalDate.of(2020, 10, 10));
		campanha.setDescricaoCampanha("Campanha de arrecadação de sangue em companhia com esportistas");
		campanha.setHemocentro(hemocentro);
		campanha.setTitulo("Doe sangue pelo Eesporte");
		
		enderecoDAO.inserirEndereco(endereco);
		usuarioDAO.inserirUsuario(hemocentro);
		campanhaDAO.inserirCampanha(campanha);
	}

}
