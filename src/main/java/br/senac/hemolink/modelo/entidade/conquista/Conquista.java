package br.senac.hemolink.modelo.entidade.conquista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.senac.hemolink.modelo.entidade.conquista.Conquista;
import br.senac.hemolink.util.ConnectionFactory;

public class Conquista {

    public void inserir(Conquista conquista) throws SQLException {
        String sql = "INSERT INTO conquista (nomeConquista, descricaoConquista) VALUES (?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, conquista.getNomeConquista());
            stmt.setString(2, conquista.getDescricaoConquista());

            stmt.executeUpdate();
        }
    }

    public void atualizar(Conquista conquista) throws SQLException {
        String sql = "UPDATE conquista SET nomeConquista = ?, descricaoConquista = ? WHERE idConquista = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, conquista.getNomeConquista());
            stmt.setString(2, conquista.getDescricaoConquista());
            stmt.setInt(3, conquista.getIdConquista());

            stmt.executeUpdate();
        }
    }

    public void deletar(int idConquista) throws SQLException {
        String sql = "DELETE FROM conquista WHERE idConquista = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idConquista);
            stmt.executeUpdate();
        }
    }

    public Conquista buscarPorId(int idConquista) throws SQLException {
        String sql = "SELECT * FROM conquista WHERE idConquista = ?";
        Conquista conquista = null;

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idConquista);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                conquista = new Conquista();
                conquista.setIdConquista(rs.getInt("idConquista"));
                conquista.setNomeConquista(rs.getString("nomeConquista"));
                conquista.setDescricaoConquista(rs.getString("descricaoConquista"));
            }
        }
        return conquista;
    }

    public List<Conquista> listar() throws SQLException {
        String sql = "SELECT * FROM conquista";
        List<Conquista> conquistas = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Conquista conquista = new Conquista();
                conquista.setIdConquista(rs.getInt("idConquista"));
                conquista.setNomeConquista(rs.getString("nomeConquista"));
                conquista.setDescricaoConquista(rs.getString("descricaoConquista"));

                conquistas.add(conquista);
            }
        }
        return conquistas;
    }
}
