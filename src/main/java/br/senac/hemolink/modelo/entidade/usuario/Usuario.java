package br.senac.hemolink.modelo.entidade.usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.senac.hemolink.modelo.entidade.usuario.Usuario;
import br.senac.hemolink.modelo.entidade.contato.Contato;
import br.senac.hemolink.modelo.entidade.papel.Papel;
import br.senac.hemolink.util.ConnectionFactory;

public class Usuario {

    public void inserir(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO Usuario (nickname, nome, senha, id_papel, id_contato) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNickname());
            stmt.setString(2, usuario.getNome());
            stmt.setString(3, usuario.getSenha());
            stmt.setInt(4, usuario.getPapel().getIdPapel());
            stmt.setInt(5, usuario.getContato().getIdContato());

            stmt.executeUpdate();
        }
    }

    public void atualizar(Usuario usuario) throws SQLException {
        String sql = "UPDATE Usuario SET nome = ?, senha = ?, id_papel = ?, id_contato = ? WHERE nickname = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());
            stmt.setInt(3, usuario.getPapel().getIdPapel());
            stmt.setInt(4, usuario.getContato().getIdContato());
            stmt.setString(5, usuario.getNickname());

            stmt.executeUpdate();
        }
    }

    public void deletar(String nickname) throws SQLException {
        String sql = "DELETE FROM Usuario WHERE nickname = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nickname);
            stmt.executeUpdate();
        }
    }

    public Usuario buscarPorNickname(String nickname) throws SQLException {
        String sql = "SELECT * FROM Usuario WHERE nickname = ?";
        Usuario usuario = null;

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nickname);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                usuario = construirUsuario(rs);
            }
        }
        return usuario;
    }

    public List<Usuario> listar() throws SQLException {
        String sql = "SELECT * FROM Usuario";
        List<Usuario> usuarios = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Usuario usuario = construirUsuario(rs);
                usuarios.add(usuario);
            }
        }
        return usuarios;
    }

    private Usuario construirUsuario(ResultSet rs) throws SQLException {
        Usuario usuario = new Usuario() {
            @Override
            public String getNickname() {
                return rs.getString("nickname");
            }
        };

        usuario.setNome(rs.getString("nome"));
        usuario.setSenha(rs.getString("senha"));

        // 
        Papel papel = new PapelDAO().buscarPorId(rs.getInt("id_papel"));
        usuario.setPapel(papel);

        Contato contato = new ContatoDAO().buscarPorId(rs.getInt("id_contato"));
        usuario.setContato(contato);

        return usuario;
    }
}