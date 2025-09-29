package com.rest.train.controller;

import com.rest.train.model.Ticket;
import com.rest.train.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class TicketController {
@Autowired
    private TicketService service;

@GetMapping("/tickets")
    public List<Ticket> getAllTicket() {
        return service.getTickets();
    }

    @PostMapping("/tickets")
    public Ticket createTicket(@RequestBody Ticket ticket)
    {
       return service.createTicket(ticket);
    }

    @GetMapping("/tickets/{id}")
    public Ticket getTicketByid(@PathVariable  Integer id)
    {
        return service.getTicketById(id);
    }

    @PutMapping("/tickets/ticket")
    public Ticket updateTicket(@RequestBody Ticket ticket)
    {
        return service.updateTicket(ticket);
    }

    @PutMapping("/tickets/{id}/{new:.+}")
    public Ticket updateTicketById(@PathVariable("id") Integer id, @PathVariable("new") String email)
    {
        return service.updateTicketById(id,email);
    }

    @DeleteMapping("/ticket/{id}")
    public void deleteTicketbyId(@PathVariable Integer id)
    {
        service.deleteTicket(id);
    }
}
