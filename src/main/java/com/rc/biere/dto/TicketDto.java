package com.rc.biere.dto;

import com.rc.biere.entity.TicketId;
import jakarta.persistence.Column;

import java.time.LocalDate;
import java.time.LocalTime;

public class TicketDto {

    private TicketId id;
    private LocalDate dateVente;
    private LocalTime heureVente;

    public TicketId getId() {
        return id;
    }

    public void setId(TicketId id) {
        this.id = id;
    }

    public LocalDate getDateVente() {
        return dateVente;
    }

    public void setDateVente(LocalDate dateVente) {
        this.dateVente = dateVente;
    }

    public LocalTime getHeureVente() {
        return heureVente;
    }

    public void setHeureVente(LocalTime heureVente) {
        this.heureVente = heureVente;
    }
}
