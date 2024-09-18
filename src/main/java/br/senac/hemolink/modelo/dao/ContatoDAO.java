package br.senac.hemolink.modelo.dao;

import java.util.List;

public interface ContatoDAO {
	
	void inserirUsuario(Usuario usuario); 

	void deletarUsuario(Usuario usuario); 

	void atualizarUsuario(Usuario usuario); 

	List<Usuario> recuperarUsuarios(); 

}
