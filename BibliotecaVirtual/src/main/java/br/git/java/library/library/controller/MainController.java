package br.git.java.library.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class MainController {

    @RequestMapping("/")
    public ModelAndView home(){
        return new ModelAndView("index");
    }
}
