package br.com.api.curso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

    @GetMapping("/rian")
    public String rota() {

        return "API Operante!";
    }
}
