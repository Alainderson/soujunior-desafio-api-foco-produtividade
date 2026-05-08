package com.desafio_sou_junior.api_foco_produtividade.controller;

import com.desafio_sou_junior.api_foco_produtividade.dto.FocoProdutividadeRequest;
import com.desafio_sou_junior.api_foco_produtividade.dto.FocoProdutividadeResponse;
import com.desafio_sou_junior.api_foco_produtividade.model.FocoProdutividade;
import com.desafio_sou_junior.api_foco_produtividade.service.FocoProdutividadeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class FocoProdutividadeController {
    private final FocoProdutividadeService service;

    public FocoProdutividadeController(FocoProdutividadeService service) {
        this.service = service;
    }

    @GetMapping("/diagnostico-produtividade")
    public void diagnostico(){

    }

    @GetMapping("/listar-tudo")
    public List<FocoProdutividade> listarTodos(){
        return service.listarTodas();
    }

    @PostMapping("/registro-foco")
    public ResponseEntity<FocoProdutividadeResponse> registrarSessao(@RequestBody FocoProdutividadeRequest request){

        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvarSessao(request));

    }
}
