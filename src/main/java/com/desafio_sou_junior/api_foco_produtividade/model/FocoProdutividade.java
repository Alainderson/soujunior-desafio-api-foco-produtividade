package com.desafio_sou_junior.api_foco_produtividade.model;

public class FocoProdutividade {
    private Long id;
    private int nivelFoco;
    private int tempoMinutos;
    private String comentario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNivelFoco() {
        return nivelFoco;
    }

    public void setNivelFoco(int nivelFoco) {
        this.nivelFoco = nivelFoco;
    }

    public int getTempoMinutos() {
        return tempoMinutos;
    }

    public void setTempoMinutos(int tempoMinutos) {
        this.tempoMinutos = tempoMinutos;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public FocoProdutividade() {

    }

    public FocoProdutividade(int nivelFoco, int tempoMinutos, String comentario) {

        this.nivelFoco = nivelFoco;
        this.tempoMinutos = tempoMinutos;
        this.comentario = comentario;
    }
}
