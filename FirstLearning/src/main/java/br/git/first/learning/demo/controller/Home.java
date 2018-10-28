package br.git.first.learning.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/teste")
public class Home {

    @RequestMapping("/tt")
    public String teste() {
        System.out.println("teste ++++++");
        return "Hello Intellij!!!";
    }

    @RequestMapping("/home")
    public ModelAndView home() {
        System.out.println("aqui");
        ModelAndView mAv = new ModelAndView("teste");
        mAv.addObject("");
        return mAv;
    }

    @RequestMapping("/inicio")
    public ModelAndView home2() {
        ModelAndView mv = new ModelAndView("home/home");


        return mv;
    }
}