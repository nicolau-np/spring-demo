package ao.com.spring.spring_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("")
    public String mensagem() {
        return "Hello world";
    }

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Seja bem vindo";
    }

}
