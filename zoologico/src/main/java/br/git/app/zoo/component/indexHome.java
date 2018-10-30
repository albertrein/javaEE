package br.git.app.zoo.component;

import org.springframework.stereotype.Component;

@Component
public class indexHome {
    private final String nome = "Bem-vindo ao ZooLógico!!!";

    public String title(){
        return "ZooLógico";
    }

    public String getNome() {
        return nome;
    }
}
