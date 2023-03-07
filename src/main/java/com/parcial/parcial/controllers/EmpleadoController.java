package com.parcial.parcial.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.parcial.parcial.model.Empleado;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("empleado")
public class EmpleadoController {

    @GetMapping({"","/","/empleado"})
    public String empleado(Model model, Empleado empleado){
        model.addAttribute("titulo", "formulario");
        model.addAttribute("empleado",empleado);
        return "index";
    }
    
    @PostMapping("/empleado")
    public String procesar(@Valid Empleado empleado, BindingResult result,Model model){
        if(result.hasErrors()){
        model.addAttribute("titulo", "Resultado formulario");
        return "index";
        }
        return "resultado";
    }
    

}
