package br.git.app.zoo.controller;

import br.git.app.zoo.inputs.NovoAnimal;
import br.git.app.zoo.modal.Zoologico;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ZooController {
    private List<Zoologico> zoologico = new ArrayList<>();
    //private Zoologico zoologico = new Zoologico();

    @RequestMapping("/inserindoNovoAnimal")
    public ModelAndView entradaNovoAnimal(){
        ModelAndView mav = new ModelAndView("admin/novoAnimal");
        return mav;
    }

    @RequestMapping(value = "/insertAnimais", method = RequestMethod.POST)
    public String addingAnimal(@RequestParam("nomeAnimal") String animalNome, HttpSession secao){
        System.out.println(animalNome);
        zoologico.add(new Zoologico(animalNome));
        return "redirect:/begin";
    }

    @RequestMapping("/animaisLista")
    public ModelAndView animaisLista(){
        ModelAndView mav = new ModelAndView("admin/animalsList");
        mav.addObject("zoo",zoologico);
        //mav.addObject("lista",zoologico);
        return mav;
    }


}