package br.git.app.zoo.modal;

import java.util.ArrayList;
import java.util.TreeMap;

public class Zoologico {
    private ArrayList<String> animais = new ArrayList<>();

    public Boolean insertNewAnimal(String animal){
        animais.add(animal);
        return true;
    }

    public String printList(){
        int i = 0;
        String saida = "";
        for(String actual : animais){
            saida += actual;
        }
        return saida;
    }
}