package com.desafio_sou_junior.api_foco_produtividade.service;

import com.desafio_sou_junior.api_foco_produtividade.dto.FocoProdutividadeRequest;
import com.desafio_sou_junior.api_foco_produtividade.dto.FocoProdutividadeResponse;
import com.desafio_sou_junior.api_foco_produtividade.dto.EstatisticaResponse;
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

    public FocoProdutividadeResponse salvarSessao(FocoProdutividadeRequest request) {
        FocoProdutividade sessao = new FocoProdutividade();
        sessao.setTempoMinutos(request.tempoMinutos());
        sessao.setNivelFoco(request.nivelFoco());
        sessao.setComentario(request.comentario());

        return new FocoProdutividadeResponse(repository.salvar(sessao));
    }

    public List<FocoProdutividade> listarTodas() {
        return repository.listarTodos();
    }


    public EstatisticaResponse statistics() {
        var item = repository.listarTodos();
        Double media = item
                .stream()
                .mapToDouble(FocoProdutividade::getNivelFoco)
                .average()
                .orElse(0.0);
        Double soma = item
                .stream()
                .mapToDouble(FocoProdutividade::getTempoMinutos)
                .sum();
        String mensagem = gerarMensagem(media);
        return new EstatisticaResponse(
                media,
                soma,
                mensagem
        );


    }

    private String gerarMensagem(Double media) {
        if (media < 2)
            return "⚠️ Nível crítico de foco. Considere fazer uma pausa longa, reduzir notificações e retomar com uma tarefa simples.";
        if (media < 3)
            return "😴 Foco abaixo do esperado. Tente sessões mais curtas com intervalos regulares.";
        if (media < 4)
            return "👍 Foco moderado. Você está no caminho certo, pequenos ajustes podem te levar ao próximo nível!";
        if (media < 5)
            return "🔥 Ótimo foco! Você está produzindo bem, continue assim e respeite os intervalos.";
        return "🚀 Estado de flow total! Você está em uma maratona produtiva de alto nível!";
    }


}
