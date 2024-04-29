package com.example.test.esami.controller;

import com.example.test.esami.models.Cliente;
import com.example.test.esami.models.Prenotazione;
import com.example.test.esami.models.Ristorante;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Map;

@RestController
public class PrenotazioneController {
    Cliente cliente = new Cliente();
    Prenotazione prenotazione= new Prenotazione();

    @PostMapping("/prenotazione")
    public String prenotazioneForm(@RequestBody MultiValueMap<String, String> userFormData){

        System.out.println(userFormData.toString());

        String nome= userFormData.get("nome").get(0);
        String cognome= userFormData.get("cognome").get(0);
        String email= userFormData.get("email").get(0);
        String telefono= userFormData.get("telefono").get(0);
        String note= userFormData.get("note").get(0);
        int coperti= Integer.parseInt(userFormData.get("coperti").get(0));
        String ristorante= userFormData.get("ristorante").get(0);
        LocalDateTime dataInizio= LocalDateTime.parse(userFormData.get("data-inizio").get(0));
        LocalDateTime dataFine= LocalDateTime.parse(userFormData.get("data-fine").get(0));

        cliente.setNome(nome);
        cliente.setCognome(cognome);
        cliente.setEmail(email);
        cliente.setCellulare(telefono);

        prenotazione.setCliente(cliente);
        prenotazione.setNote(note);
        prenotazione.setCoperti(coperti);

        Ristorante ristorante1 = new Ristorante();
        ristorante1.setNome(ristorante);
        prenotazione.setRistorante(ristorante1);

        ArrayList<LocalDateTime> dateDisponibili= new ArrayList<>();

        LocalDateTime data1= dataInizio.plusHours(2);
        LocalDateTime data2= dataInizio.plusHours(4);
        LocalDateTime data3= dataInizio.plusHours(6);

        dateDisponibili.add(data1);
        dateDisponibili.add(data2);
        dateDisponibili.add(data3);

        return dateDisponibili.toString();
    }

    @PostMapping("/finalizzazionePrenotazione")
    public String finalizzazionePrenotazione(@RequestBody MultiValueMap<String, String> userFormData){
        LocalDateTime data= LocalDateTime.parse(userFormData.get("data").get(0));
        prenotazione.setData(data);

        return "Codice Prenotazione 1234 per la data:" + data.toString();
    }




}
