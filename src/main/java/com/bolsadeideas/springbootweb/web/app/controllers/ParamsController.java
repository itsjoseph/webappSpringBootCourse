package com.bolsadeideas.springbootweb.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamsController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("titulo", "Bienvenido a Spring Boot");
        return "params/index";
    }


    @GetMapping("/params")
    public String param(@RequestParam String nombre, Model model){
        model.addAttribute("titulo", "titulo");
        model.addAttribute("resultado", "El parametro enviado es: " + nombre);
        return "params/ver";
    }
}
