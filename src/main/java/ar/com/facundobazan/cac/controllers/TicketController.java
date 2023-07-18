package ar.com.facundobazan.cac.controllers;

import ar.com.facundobazan.cac.entities.Ticket;
import ar.com.facundobazan.cac.services.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketController {

    @Autowired
    private ITicketService iTicketService;

    @GetMapping(value = "tickets")
    public List<Ticket> getAll(){
        return iTicketService.getAll();
    }

    @GetMapping(value = "tickets/{id}")
    public Ticket getOne(@PathVariable String id){
        return iTicketService.find(Integer.valueOf(id));
    }
    /*
    @PostMapping(value = "tickets")
    public Ticket add(@RequestBody Usuario usuario){
        return iTicketDao.add(usuario);
    }

    @DeleteMapping(value = "tickets/{id}")
    public void remove(@PathVariable String id){
        iTicketDao.remove(Integer.valueOf(id));
    }

     */
}
