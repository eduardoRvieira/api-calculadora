package com.reichelvieira.api_calculadora.service;

import com.reichelvieira.api_calculadora.dto.CalculadoraRequisicao;
import com.reichelvieira.api_calculadora.dto.CalculadoraResposta;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
   public CalculadoraResposta adicao(CalculadoraRequisicao requisicao){
        double resultado = requisicao.getN1() + requisicao.getN2();
        return new CalculadoraResposta(requisicao.getN1(), requisicao.getN2(), "soma", resultado);
   }

   public CalculadoraResposta subtracao(CalculadoraRequisicao requisicao){
       double resultado = requisicao.getN1() - requisicao.getN2();
       return new CalculadoraResposta(requisicao.getN1(), requisicao.getN2(), "subtração", resultado);
   }

   public CalculadoraResposta multiplicacao(CalculadoraRequisicao requisicao){
       double resultado = requisicao.getN1() * requisicao.getN2();
       return new CalculadoraResposta(requisicao.getN1(), requisicao.getN2(), "multiplicação", resultado);
   }

   public CalculadoraResposta divisao(CalculadoraRequisicao requisicao){
       double resultado = 0;
       if (requisicao.getN2() != 0){
           resultado = requisicao.getN1()/requisicao.getN2();
       }
       return new CalculadoraResposta(requisicao.getN1(), requisicao.getN2(), "divisão", resultado);
   }
}
