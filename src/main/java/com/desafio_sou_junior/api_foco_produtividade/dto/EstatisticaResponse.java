package com.desafio_sou_junior.api_foco_produtividade.dto;



public record EstatisticaResponse(
         Double mediaProdutividade,
         Double tempoTotalFocado,
         String mensagem) {


    public EstatisticaResponse(Double mediaProdutividade, Double tempoTotalFocado, String mensagem) {
        this.mediaProdutividade = mediaProdutividade;
        this.tempoTotalFocado = tempoTotalFocado;
        this.mensagem = mensagem;
    }
}
