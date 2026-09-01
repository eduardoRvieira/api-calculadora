package com.reichelvieira.api_calculadora.dto;

public class CalculadoraResposta {
    private double n1;
    private double n2;
    private String operacao;
    private double resultado;

    public CalculadoraResposta(){};

    public CalculadoraResposta(double n1, double n2, String operacao, double resultado){
        this.n1 = n1;
        this.n2 = n2;
        this.operacao = operacao;
        this.resultado = resultado;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
