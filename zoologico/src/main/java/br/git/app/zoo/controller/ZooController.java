package br.git.app.zoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ZooController {
    @RequestMapping("/animaisLista")
    public ModelAndView animaisLista(){
        return new ModelAndView();
    }

    @RequestMapping("/insertAnimais")
    public ModelAndView insertAnimais(){
        return new ModelAndView();
    }

}