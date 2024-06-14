package com.bolsadeideas.springbootweb.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping(value = {"/index","/","/home"}, method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("titulo", "Bienvenido a Spring Boot");
        return "index";
    }
}
