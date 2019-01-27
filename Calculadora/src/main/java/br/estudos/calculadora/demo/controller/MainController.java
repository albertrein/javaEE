package br.estudos.calculadora.demo.controller;

import br.estudos.calculadora.demo.model.Calculadora;
import br.estudos.calculadora.demo.model.Teste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    public Calculadora calculadora;
    public Teste teste;


    @GetMapping("/calculadora")
    public String getEntradas(Model mv){
        mv.addAttribute("calculadora", new Calculadora());
        mv.addAttribute("teste", new Teste());

        return "index";
    }

    @PostMapping("/calculadora")
    public @ResponseBody  String resultado(@RequestBody Calculadora calculadora, HttpServletRequest request){

        System.out.println(">>"+calculadora.getResultado());

        String jsonResponse = "{\"response\":\""+calculadora.getResultado()+"\"}";

        return jsonResponse;
    }

    @PostMapping("/teste")
    public String getTeste(Teste teste, Model mv){
        mv.addAttribute("calculadora", new Calculadora());
        mv.addAttribute("teste", new Teste());
        mv.addAttribute("testeSaida",teste.getNome());
        return "index";
    }

    /*@PostMapping("/teste")
    public ModelAndView getTeste(Teste teste){
        ModelAndView mv = new ModelAndView("resultado");
        System.out.println(">>"+teste.getNome());

        return mv;
    }*/

}
