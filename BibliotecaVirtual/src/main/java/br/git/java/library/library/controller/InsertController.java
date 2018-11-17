package br.git.java.library.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/insert", method = RequestMethod.POST)
public class InsertController {

    public ModelAndView gettingDataOfInsert(@RequestParam("titulo") String nome, @RequestParam("autor") String autor, @RequestParam("editora") String editora, HttpSession secao){

    }
}
