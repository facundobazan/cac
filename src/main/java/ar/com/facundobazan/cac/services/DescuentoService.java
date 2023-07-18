package ar.com.facundobazan.cac.services;

import ar.com.facundobazan.cac.entities.Descuento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //  Permite la conexion a la db
@Transactional  //  Permite armar las consultas a la db
public class DescuentoService implements IDescuentoService {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Descuento> getAll() {
        return entityManager.createQuery("FROM Descuento").getResultList();
    }

    @Override
    public Descuento find(Integer id) {
        return entityManager.find(Descuento.class, id);
    }

    @Override
    public Descuento add(Descuento descuento) {
        return entityManager.merge(descuento);
    }

    @Override
    public void edit(Descuento descuento) {
        Descuento entity = find(descuento.getId());
        entity = descuento;
        entity.setDescuento(descuento.getDescuento());
        entity.setValor(descuento.getValor());
        entityManager.merge(entity);
    }

    @Override
    public void remove(Integer id) {
        Descuento entity = find(id);
        entityManager.remove(entity);
    }
}
