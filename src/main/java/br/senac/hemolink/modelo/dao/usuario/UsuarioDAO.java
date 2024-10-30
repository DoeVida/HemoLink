package br.senac.hemolink.modelo.dao.usuario;

import br.senac.hemolink.modelo.entidade.usuario.Usuario;

public interface UsuarioDAO {

	void inserirUsuario (Usuario usuario);

	void deletarUsuario (Usuario usuario);

	void atualizarUsuario (Usuario usuario);
}