package br.estudos.calculadora.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Calculadora {
    @JsonProperty("val1") private Double val1;
    @JsonProperty("val2") private Double val2;
    @JsonProperty("opcao") private String opcao;


    public Double getVal1() {
        return val1;
    }

    public void setVal1(Double val1) {
        this.val1 = val1;
    }

    public Double getVal2() {
        return val2;
    }

    public void setVal2(Double val2) {
        this.val2 = val2;
    }

    public String getOpcao() {
        return opcao;
    }

    public void setOpcao(String opcao) {
        this.opcao = opcao;
    }

    public Double getResultado(){
        switch (opcao){
            case "x":
                return val1*val2;
            case "/":
                return val1/val2;
            case "-":
                return val1-val2;
            case "+":
                return val1+val2;
            default:
                return 0.0;
        }
    }
}
