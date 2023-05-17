package com.invoice.invoice.controller;

import com.invoice.invoice.entities.Client;
import com.invoice.invoice.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/all_Clients")
    public ModelAndView getAllContacts() {
        List<Client> list = new ArrayList<>();
        list = clientService.findAll();
        return new ModelAndView("allClients", "client", list);
    }

    @GetMapping("/saveClient")
    public String addContact(Model model) {
        Client client;
        model.addAttribute("client", new Client());

        return "createClients";
    }

    @PostMapping("/saveClient")
    public String SaveClient(Client client) {

        clientService.save(client);

        return "redirect:/all_Clients";
    }

    @RequestMapping(value = "/{id}")
    public Optional<Client> getClientbyId(@PathVariable Long id) {
        return clientService.findById(id);
    }



}


