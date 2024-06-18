package com.bolsadeideas.springbootweb.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {

    @GetMapping("/string")
    public String getString(@RequestParam String texto, Model model) {
        model.addAttribute("titulo", "Bienvenido a Spring Boot");
        model.addAttribute("texto", "El texto enviado es: " + texto);
        return "params/string";
    }
}
