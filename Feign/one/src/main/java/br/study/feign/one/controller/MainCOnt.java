package br.study.feign.one.controller;

import br.study.feign.one.repository.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class MainCOnt {

    @Autowired
    private Book boo;

    @RequestMapping("/")
}
