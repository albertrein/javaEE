package br.learn.feing.cep.controller;

import br.learn.feing.cep.model.Address;
import br.learn.feing.cep.service.CepService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("")
public class MainController {

    private CepService cepService;

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(value = "/{cep}", method = RequestMethod.GET)
    public String getCep(@PathVariable String cep) {
        String out = cepService.getCep(cep).toString();
        return out;
    }

}