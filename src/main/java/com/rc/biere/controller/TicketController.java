package com.rc.biere.controller;

import com.rc.biere.dto.TicketDto;
import com.rc.biere.service.TicketService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ticket")

public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<TicketDto>> getAllTicket() {
      List<TicketDto> tickets = ticketService.getAllTicket();
      return ResponseEntity.ok(tickets);
    }
}
