package com.reichelvieira.api_calculadora.service;

import com.reichelvieira.api_calculadora.dto.CalculadoraRequisicao;
import com.reichelvieira.api_calculadora.dto.CalculadoraResposta;

public class CalculadoraService {
   public CalculadoraResposta adicao(CalculadoraRequisicao requisicao){
        double resultado = requisicao.getN1() + requisicao.getN2();
        return new CalculadoraResposta(requisicao.getN1(), requisicao.getN2(), "Adição", resultado);
   }

   public CalculadoraResposta subtracao(CalculadoraRequisicao requisicao){
       double resultado = requisicao.getN1() - requisicao.getN2();
       return new CalculadoraResposta(requisicao.getN1(), requisicao.getN2(), "Subtração", resultado);
   }

   public CalculadoraResposta multiplicacao(CalculadoraRequisicao requisicao){
       double resultado = requisicao.getN1() * requisicao.getN2();
       return new CalculadoraResposta(requisicao.getN1(), requisicao.getN2(), "Multiplicação", resultado);
   }

   public CalculadoraResposta divisao(CalculadoraRequisicao requisicao){
       double resultado = requisicao.getN1()/requisicao.getN2();
       if (requisicao.getN2() == 0){
           resultado = 0;
       }
       return new CalculadoraResposta(requisicao.getN1(), requisicao.getN2(), "Divisão", resultado);
   }
}
