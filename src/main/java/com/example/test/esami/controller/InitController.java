package com.example.test.esami.controller;

import com.example.test.esami.models.Chef;
import com.example.test.esami.models.Ristorante;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class InitController {
    @GetMapping("/init")
     public String init(){
        Chef chef1 = new Chef("valerio","mortella", "email@email.com", "1234", "chef");
        Chef chef2 = new Chef("valerio","mortella", "email@email.com", "1234", "chef");
        Chef chef3 = new Chef("valerio","mortella", "email@email.com", "1234", "chef");
        Chef chef4 = new Chef("valerio","mortella", "email@email.com", "1234", "chef");
        Chef chef5 = new Chef("valerio","mortella", "email@email.com", "1234", "chef");

        Ristorante rist1= new Ristorante("Mc Donald", "via numero 1");
        Ristorante rist2= new Ristorante("Mc Donald", "via numero 1");

        List<Chef> chefs= new ArrayList<>();
        chefs.add(chef1);
        chefs.add(chef2);
        chefs.add(chef3);
        chefs.add(chef4);
        chefs.add(chef5);

        List<Ristorante> ristoranti= new ArrayList<>();
        ristoranti.add(rist1);
        ristoranti.add(rist2);

        return "init";
    }





}
