package ar.com.facundobazan.cac.services;

import ar.com.facundobazan.cac.entities.Rol;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //  Permite la conexion a la db
@Transactional  //  Permite armar las consultas a la db
public class RolService implements IRolService {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Rol> getAll() {
        String query = "FROM Rol";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Rol find(Integer id) {
        return entityManager.find(Rol.class, id);
    }

    @Override
    public Rol add(Rol rol) {
        return entityManager.merge(rol);
    }

    @Override
    public void edit(Rol rol) {
        Rol rolAux = this.find(rol.getId());
        rolAux.setRol(rol.getRol());
        entityManager.merge(rolAux);
    }

    @Override
    public void remove(Integer id) {
        Rol rol = find(id);
        entityManager.remove(rol);
    }
}
