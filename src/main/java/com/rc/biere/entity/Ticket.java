package com.rc.biere.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "ticket")
public class Ticket {
    @EmbeddedId
    private TicketId id;

    @Column(name = "DATE_VENTE", nullable = false)
    private LocalDate dateVente;

    @Column(name = "HEURE_VENTE", nullable = false)
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