package com.desafio_sou_junior.api_foco_produtividade.data;

public class FocoProdutividade {
    private int nivelFoco;
    private int tempoMinutos;
    private String comentario;

    public FocoProdutividade(int nivelFoco, int tempoMinutos, String comentario) {
        this.nivelFoco = nivelFoco;
        this.tempoMinutos = tempoMinutos;
        this.comentario = comentario;
    }
}
