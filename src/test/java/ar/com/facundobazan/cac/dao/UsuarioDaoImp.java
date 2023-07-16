package ar.com.facundobazan.cac.dao;

import ar.com.facundobazan.cac.entities.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //  Permite la conexion a la db
@Transactional  //  Permite armar las consultas sql a la db
public class UsuarioDaoImp implements UsuarioDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Usuario> getUsuarios() {
        String query = "FROM Usuario";
        return entityManager.createNamedQuery(query).getResultList();
    }

    @Override
    public Usuario getUsuario(Integer id) {
        return null;
    }

    @Override
    public Usuario addUsuario() {
        return null;
    }

    @Override
    public Boolean editUsuario() {
        return null;
    }

    @Override
    public Boolean deleteUsuario() {
        return null;
    }
}
