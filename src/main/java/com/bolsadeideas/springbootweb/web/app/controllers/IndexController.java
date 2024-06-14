package com.bolsadeideas.springbootweb.web.app.controllers;

import com.bolsadeideas.springbootweb.web.app.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/app")
public class IndexController {

    @RequestMapping(value = {"/index", "/", "/home"}, method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("titulo", "Bienvenido a Spring Boot");
        return "index";
    }

    @RequestMapping(value = "/detalle", method = RequestMethod.GET)
    public String about(Model model) {
        Usuario usuario = new Usuario();
        usuario.setName("Juan");
        usuario.setLastName("Perez");
        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", "Bienvenido a usuario: " + usuario.getName());
        return "perfil";
    }
}
