package com.desafio_sou_junior.api_foco_produtividade.service;

import com.desafio_sou_junior.api_foco_produtividade.dto.FocoProdutividadeRequest;
import com.desafio_sou_junior.api_foco_produtividade.dto.FocoProdutividadeResponse;
import com.desafio_sou_junior.api_foco_produtividade.model.FocoProdutividade;
import com.desafio_sou_junior.api_foco_produtividade.repository.FocoProdutividadeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FocoProdutividadeService {

    private final FocoProdutividadeRepository repository;

    public FocoProdutividadeService(FocoProdutividadeRepository focoProdutividadeRepository) {
        this.repository = focoProdutividadeRepository;
    }

    public FocoProdutividadeResponse salvarSessao(FocoProdutividadeRequest request){
        FocoProdutividade sessao = new FocoProdutividade();
        sessao.setTempoMinutos(request.tempoMinutos());
        sessao.setNivelFoco(request.nivelFoco());
        sessao.setComentario(request.comentario());

        return new FocoProdutividadeResponse(repository.salvar(sessao));
    }

    public List<FocoProdutividade> listarTodas(){
        return repository.listarTodos();
    }

    public void diagnostico(){

    }


}
