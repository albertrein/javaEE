package br.study.feign.one.output;

public class BookOutput {
    private String dados;

    public BookOutput(String dados) {
        this.dados = dados;
    }

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }
}
