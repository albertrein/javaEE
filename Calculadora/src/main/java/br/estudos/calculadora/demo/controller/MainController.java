package br.estudos.calculadora.demo.controller;

import br.estudos.calculadora.demo.model.Calculadora;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    public Calculadora calculadora;


    @GetMapping("/calculadora")
    public ModelAndView getEntradas(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject(new Calculadora());

        return mv;
    }

    @PostMapping("/resultado")
    public ModelAndView setEntradas(Calculadora calculadora){
        ModelAndView mv = new ModelAndView("resultado");
        mv.addObject("val1",calculadora.getVal1());
        mv.addObject("opcao",calculadora.getOpcao());
        mv.addObject("val2",calculadora.getVal2());
        mv.addObject("resultado",calculadora.getResultado());

        System.out.println("Val1 = "+calculadora.getVal1());
        System.out.println("Val2 = "+calculadora.getVal2());
        System.out.println("Opcao = "+calculadora.getOpcao());

        return mv; //todo: Dúvida, como fazer um redirect para um metodo get do resultado que recebe os campos
    }

    /*@GetMapping("/resultado")
    public ModelAndView resultado()*/
}
