package br.git.learn2.demo.controller;

import br.git.learn2.demo.model.Data;
import br.git.learn2.demo.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class ControllerDataInsert {
    @Autowired
    private DataRepository dataRepository;

    @RequestMapping(value = "/insertdata", method = RequestMethod.POST)
    public ModelAndView insertdata(@RequestParam("textoToInsert") String text, HttpSession secao){
        ModelAndView str = new ModelAndView("teste");
        str.addObject("textoinserido",text);

        Data dataToInsert = new Data();
        dataToInsert.setData(text);
        dataRepository.save(dataToInsert);

        return str;
    }

    @RequestMapping("/listaDados")
    @ResponseBody
    public String listaDados(){
        String str = new String();
        Iterable<Data> lista = dataRepository.findAll();
        for(Data data : lista){
            str += data;
        }
        return str;
    }
}
