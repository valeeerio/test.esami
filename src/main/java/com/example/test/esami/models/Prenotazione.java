package com.example.test.esami.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Prenotazione  {
    private String note;
    private LocalDateTime data;
    private int coperti;
    private Ristorante ristorante;
    private Cliente cliente;

    public Prenotazione(String note, LocalDateTime data, int coperti, Ristorante ristorante, Cliente cliente) {
        this.note = note;
        this.data = data;
        this.coperti = coperti;
        this.ristorante = ristorante;
        this.cliente = cliente;
    }

    public Prenotazione(){}


    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getCoperti() {
        return coperti;
    }

    public void setCoperti(int coperti) {
        this.coperti = coperti;
    }

    public Ristorante getRistorante() {
        return ristorante;
    }

    public void setRistorante(Ristorante ristorante) {
        this.ristorante = ristorante;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
