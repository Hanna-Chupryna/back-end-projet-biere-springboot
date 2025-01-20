package com.rc.biere.service;

import com.rc.biere.dto.TicketDto;
import com.rc.biere.mapper.TicketMapper;
import com.rc.biere.repository.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class TicketService {

    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }
    public List<TicketDto> getAllTicket(){
       return ticketRepository.findAll().stream().map(TicketMapper::toDto).collect(Collectors.toList());
    }

}
