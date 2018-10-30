package br.git.app.zoo.controller;

import br.git.app.zoo.inputs.NovoAnimal;
import br.git.app.zoo.modal.Zoologico;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ZooController {
    private Zoologico zoologico = new Zoologico();

    @RequestMapping("/inserindoNovoAnimal")
    public ModelAndView entradaNovoAnimal(){
        ModelAndView mav = new ModelAndView("admin/novoAnimal");
        return mav;
    }


    @GetMapping("/insertAnimais")
    public String insertAnimaisForm(@ModelAttribute("animal") NovoAnimal novoAnimal){
        return "GET";
    }
    @PostMapping("/insertAnimais")
    public String insertAnimais(NovoAnimal newAnimal, RedirectAttributes redirectAttrs){
        NovoAnimal animal = new NovoAnimal();
        animal.setAnimalNome(newAnimal.getAnimalNome());
        System.out.println(">>> "+newAnimal.getAnimalNome());
        return "POST";
    }

    @RequestMapping("/animaisLista")
    public ModelAndView animaisLista(){
        return new ModelAndView("listaAnimais");
    }


}