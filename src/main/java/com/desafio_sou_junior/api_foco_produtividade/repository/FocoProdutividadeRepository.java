package com.desafio_sou_junior.api_foco_produtividade.repository;

import com.desafio_sou_junior.api_foco_produtividade.model.FocoProdutividade;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class FocoProdutividadeRepository {

    private final List<FocoProdutividade> registros = new ArrayList<>();
    private Long idSequence = 1L;

    public void setId(Long idSequence) {
        this.idSequence = idSequence;
    }

    public FocoProdutividade salvar (FocoProdutividade sessao){

        sessao.setId(idSequence++);
        registros.add(sessao);
        return  sessao;
    }

    public List<FocoProdutividade> listarTodos(){
        return registros;
    }

    public Optional<FocoProdutividade> buscarPorId(Long id){
        return registros
                .stream()
                .filter(x -> x.getId().equals(id))
                .findFirst();
    }
}
