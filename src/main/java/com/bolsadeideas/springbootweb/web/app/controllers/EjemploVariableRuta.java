package com.bolsadeideas.springbootweb.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rutas")
public class EjemploVariableRuta {


    @GetMapping("/ruta/{texto}")
    public String getString(@PathVariable String texto, Model model) {
        model.addAttribute("titulo", "Bienvenido a Spring Boot");
        model.addAttribute("texto", "El texto enviado es: " + texto);
        return "params/variable";
    }
}
