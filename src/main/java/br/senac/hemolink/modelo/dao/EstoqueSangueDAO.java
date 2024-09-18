package br.senac.hemolink.modelo.dao;

import java.util.List;

public interface EstoqueSangueDAO {
    
    void inserirEstoqueSangue(EstoqueSangue estoqueSangue);

    void deletarEstoqueSangue(EstoqueSangue estoqueSangue);

    void atualizarEstoqueSangue(EstoqueSangue estoqueSangue);

    List<EstoqueSangue> recuperarEstoques();
}
