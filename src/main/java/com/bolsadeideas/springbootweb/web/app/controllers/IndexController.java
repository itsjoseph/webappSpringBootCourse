package com.bolsadeideas.springbootweb.web.app.controllers;

import com.bolsadeideas.springbootweb.web.app.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

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
        /*usuario.setEmail("juan.perez@gmail.com");*/
        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", "Bienvenido a usuario: " + usuario.getName());
        return "perfil";
    }

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public String listar(Model model) {
        List<Usuario> listar = Arrays.asList(new Usuario("luis", "Amador", "corre.com"),
                new Usuario("luis", "Amador", "corre.com"),
                new Usuario("luis", "Amador", "corre.com"),
                new Usuario("luis", "Amador", "corre.com"));
        model.addAttribute("titulo", "Listado de usuarios");
        model.addAttribute("usuarios", listar);
        return "listar";
    }
}
