package com.desafio_sou_junior.api_foco_produtividade.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record FocoProdutividadeRequest(
        @Min(1)
        @Max(5)
        int nivelFoco,
        @Min(1)
        int tempoMinutos,
        @NotBlank
        String comentario) {
}
