package br.git.app.zoo.modal;

import java.util.ArrayList;
import java.util.TreeMap;

public class Zoologico {
    private String animais;

    public Zoologico(){}

    public Zoologico(String nome){
        setAnimais(nome);
    }

    public String getAnimais() {
        return animais;
    }

    public void setAnimais(String animais) {
        this.animais = animais;
    }

//    public String printList(){
//        int i = 0;
//        String saida = "";
//        for(String actual : animais){
//            saida += actual;
//            saida += "<br>";
//        }
//        return saida;
//    }
}