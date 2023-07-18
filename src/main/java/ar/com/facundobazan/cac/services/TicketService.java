package ar.com.facundobazan.cac.services;

import ar.com.facundobazan.cac.entities.Ticket;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //  Permite la conexion a la db
@Transactional  //  Permite armar las consultas a la db
public class TicketService implements ITicketService {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Ticket> getAll() {
        return entityManager.createQuery("FROM Ticket").getResultList();
    }

    @Override
    public Ticket find(Integer id) {
        return entityManager.find(Ticket.class, id);
    }
}
