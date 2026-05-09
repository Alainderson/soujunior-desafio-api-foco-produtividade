package com.desafio_sou_junior.api_foco_produtividade.dataLoader;

import com.desafio_sou_junior.api_foco_produtividade.dto.FocoProdutividadeRequest;
import com.desafio_sou_junior.api_foco_produtividade.service.FocoProdutividadeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final FocoProdutividadeService service;

    public DataLoader(FocoProdutividadeService service) {
        this.service = service;
    }


    @Override
    public void run(String... args) throws Exception {

        for (int i = 1; i < 10; i++) {
            service.salvarSessao(new FocoProdutividadeRequest(i*1,i*2,"Salamaleico"+i*50));
        }

    }
}
