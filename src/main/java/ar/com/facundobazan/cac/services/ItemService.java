package ar.com.facundobazan.cac.services;

import ar.com.facundobazan.cac.entities.Item;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //  Permite la conexion a la db
@Transactional  //  Permite armar las consultas a la db
public class ItemService implements IItemService {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Item> getAll() {
        return entityManager.createQuery("FROM Item").getResultList();
    }

    @Override
    public Item find(Integer id) {
        return entityManager.find(Item.class, id);
    }

    @Override
    public Item add(Item item) {
        return entityManager.merge(item);
    }

    @Override
    public void edit(Item item) {
        Item entity = this.find(item.getId());
        entity.setTicketId(item.getTicketId());
        entity.setProductoId(item.getProductoId());
        entity.setCantidad(item.getCantidad());

        entityManager.merge(entity);
    }

    @Override
    public void remove(Integer id) {
        Item item = this.find(id);
        entityManager.remove(item);
    }
}
