package br.git.app.zoo.controller;

import br.git.app.zoo.component.indexHome;
import br.git.app.zoo.modal.Zoologico;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String initializer(){
        return "redirect:/begin";
    }

    @RequestMapping("/begin")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("zoo", new indexHome());
        return modelAndView;
    }
}
