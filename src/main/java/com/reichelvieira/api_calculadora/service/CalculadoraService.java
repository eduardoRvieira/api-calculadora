package com.reichelvieira.api_calculadora.service;

import com.reichelvieira.api_calculadora.dto.CalculadoraRequisicao;
import com.reichelvieira.api_calculadora.dto.CalculadoraResposta;

public class CalculadoraService {
   public CalculadoraResposta soma(CalculadoraRequisicao requisicao){
        double soma = requisicao.getN1() + requisicao.getN2();
        return new CalculadoraResposta(requisicao.getN1(), requisicao.getN2(), "Soma", soma);
   }
}
