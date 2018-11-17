package br.learn.feing.cep.model;

import com.fasterxml.jackson.core.JsonParser;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Address {
    private String logradouro;
    private String bairro;
    private String cidade;
    private Map<String, String> estado_info;

    @Override
    public String toString() {
        return "Address{" +
                "logradouro='" + logradouro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", bairro='" + bairro + '\'' +
                ", Estado info='" + estado_info + '\'' +
                '}';
    }

}
