package com.rest.train.service;

import com.rest.train.model.Ticket;
import com.rest.train.repo.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TicketService {
@Autowired
    private TicketRepo repo;
    public List<Ticket> getTickets()
    {
        return repo.findAll();
    }

    public Ticket createTicket(Ticket ticket) {
       return repo.save(ticket);
    }

    public Ticket getTicketById(Integer id) {
        return repo.findById(id).get();
    }
    public void  deleteTicket(Integer ticketID) {
        repo.deleteById(ticketID);
    }

    public Ticket updateTicket(Ticket ticket)
    {
        return repo.save(ticket);
        //else
    }

    public Ticket updateTicketById(Integer ticketId,String email)
    {
        Ticket tick=repo.findById(ticketId).get();
        tick.setEmail(email);
        return repo.save(tick);
        //else
    }

}
