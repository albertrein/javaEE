package br.git.learn2.demo.controller;

import br.git.learn2.demo.model.Data;
import br.git.learn2.demo.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/pessoas")
public class RestControllerApp {

    @Autowired
    private DataRepository repository;

    @GetMapping
    public Iterable<Data> list() {
        return repository.findAll();
    }

}
