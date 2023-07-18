package ar.com.facundobazan.cac.services;

import ar.com.facundobazan.cac.entities.Ticket;

import java.util.List;

public interface ITicketService {
    public List<Ticket> getAll();
    public Ticket find(Integer id);
}
