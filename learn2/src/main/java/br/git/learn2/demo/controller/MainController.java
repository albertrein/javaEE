package br.git.learn2.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class MainController {
    @RequestMapping("")
    public String toHome(){
        return "redirect:home";
    }


    @RequestMapping("/home")
    public String teste(){
        return "home";
    }

}
