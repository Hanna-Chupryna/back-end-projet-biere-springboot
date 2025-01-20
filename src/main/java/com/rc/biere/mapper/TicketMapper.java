package com.rc.biere.mapper;

import com.rc.biere.dto.TicketDto;
import com.rc.biere.entity.Ticket;

public class TicketMapper {

    public static TicketDto toDto(Ticket ticket) {
        TicketDto dto = new TicketDto();
        dto.setId(ticket.getId());
        dto.setDateVente(ticket.getDateVente());
        dto.setHeureVente(ticket.getHeureVente());
        return dto;
    }
    public static Ticket toEntity(TicketDto ticketDto) {
        Ticket ticket = new Ticket();
        ticket.setId(ticketDto.getId());
        ticket.setDateVente(ticketDto.getDateVente());
        ticket.setHeureVente(ticketDto.getHeureVente());
        return ticket;
    }
}
