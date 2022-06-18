package br.com.garagejunho.garagejunho.controllers;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.garagejunho.garagejunho.model.Administrador;
import br.com.garagejunho.garagejunho.repository.AdminRepository;

public class AdminsController {

    private AdminRepository repo;
    
    @GetMapping("/admins")
    public String index(Model model) {
        List<Administrador> administradores = (List<Administrador>)repo.findAll();
        model.addAttribute("administradores", administradores);
        return "home/index";
    }
}
