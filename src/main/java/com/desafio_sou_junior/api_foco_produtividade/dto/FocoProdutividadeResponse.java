package com.desafio_sou_junior.api_foco_produtividade.dto;

import com.desafio_sou_junior.api_foco_produtividade.model.FocoProdutividade;

public record FocoProdutividadeResponse (int nivelFoco, int tempoMinutos, String comentarios) {

    public FocoProdutividadeResponse(FocoProdutividade sessao) {
        this(sessao.getNivelFoco(), sessao.getTempoMinutos(), sessao.getComentario());
    }
}
