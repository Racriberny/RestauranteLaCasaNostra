package com.joanmoncho.tiendavintage.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MiControlador {
    @GetMapping("/home")
    public String indice(){
        return "index";
    }
    @GetMapping("/carta")
    public String carta(){
        return "Carta/carta";
    }
}
