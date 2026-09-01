package com.reichelvieira.api_calculadora.controller;

import com.reichelvieira.api_calculadora.dto.CalculadoraRequisicao;
import com.reichelvieira.api_calculadora.dto.CalculadoraResposta;
import com.reichelvieira.api_calculadora.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @Autowired
    CalculadoraService servico;

    @PostMapping("somar")
    public CalculadoraResposta somar(@RequestBody CalculadoraRequisicao requisicao){
        return servico.adicao(requisicao);
    }

    @PostMapping("subtrair")
    public CalculadoraResposta subtrair(@RequestBody CalculadoraRequisicao requisicao){
        return servico.subtracao(requisicao);
    }

    @PostMapping("multiplicar")
    public CalculadoraResposta multiplicar(@RequestBody CalculadoraRequisicao requisicao){
        return servico.multiplicacao(requisicao);
    }

    @PostMapping("dividir")
    public CalculadoraResposta dividir(@RequestBody CalculadoraRequisicao requisicao){
        return servico.divisao(requisicao);
    }
}
