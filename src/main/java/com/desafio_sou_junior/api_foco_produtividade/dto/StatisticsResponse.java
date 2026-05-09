package com.desafio_sou_junior.api_foco_produtividade.dto;



public record StatisticsResponse(
         Double mediaProdutividade,
         Double tempoTotalFocado) {

    public StatisticsResponse(Double mediaProdutividade, Double tempoTotalFocado) {
        this.mediaProdutividade = mediaProdutividade;
        this.tempoTotalFocado = tempoTotalFocado;
    }
}
