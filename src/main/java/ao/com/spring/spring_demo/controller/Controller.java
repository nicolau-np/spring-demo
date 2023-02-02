package ao.com.spring.spring_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ao.com.spring.spring_demo.models.Model;

@RestController
public class Controller {

    @GetMapping("")
    public String mensagem() {
        return "Hello world";
    }

    @GetMapping("/boasVindas/{nome}")
    public String boasVindas(@PathVariable String nome) {

        return "Seja bem vindo: " + nome;
    }

    @PostMapping("/pessoa") 
    public Model pessoa(@RequestBody Model pessoa) {
        return pessoa;
    }

}
