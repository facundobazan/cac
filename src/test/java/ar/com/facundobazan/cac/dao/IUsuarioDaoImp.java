package ar.com.facundobazan.cac.dao;

import ar.com.facundobazan.cac.entities.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //  Permite la conexion a la db
@Transactional  //  Permite armar las consultas sql a la db
public class IUsuarioDaoImp implements IUsuarioDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Usuario> getAll()  {
        String query = "FROM Usuario";
        return entityManager.createNamedQuery(query).getResultList();
    }

    @Override
    public Usuario find(String id) {
        return null;
    }

    @Override
    public Usuario add(Usuario usuario) {
        return null;
    }

    @Override
    public Boolean edit(Usuario usuario) {
        return null;
    }

    @Override
    public Boolean delete(String id) {
        return null;
    }
}
