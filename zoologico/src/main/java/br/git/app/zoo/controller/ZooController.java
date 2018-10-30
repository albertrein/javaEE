package br.git.app.zoo.controller;

import br.git.app.zoo.modal.Zoologico;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ZooController {
    private Zoologico zoologico = new Zoologico();

    @RequestMapping("/inserindoNovoAnimal")
    public ModelAndView entradaNovoAnimal(){
        ModelAndView mav = new ModelAndView("admin/novoAnimal");
        return mav;
    }

    @RequestMapping("/insertAnimais")
    public ModelAndView insertAnimais(){
        return new ModelAndView("insertAnimal");
    }

    @RequestMapping("/animaisLista")
    public ModelAndView animaisLista(){
        return new ModelAndView("listaAnimais");
    }


}