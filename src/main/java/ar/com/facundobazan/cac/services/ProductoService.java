package ar.com.facundobazan.cac.services;

import ar.com.facundobazan.cac.entities.Producto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //  Permite la conexion a la db
@Transactional  //  Permite armar las consultas a la db
public class ProductoService implements IProductoService {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Producto> getAll() {
        return entityManager.createQuery("FROM Producto").getResultList();
    }

    @Override
    public Producto find(Integer id) {
        return entityManager.find(Producto.class, id);
    }
}
