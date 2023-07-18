package ar.com.facundobazan.cac.services;

import ar.com.facundobazan.cac.entities.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //  Permite la conexion a la db
@Transactional  //  Permite armar las consultas sql a la db
public class IUsuarioServiceImp implements IUsuarioService {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Usuario> getAll() {
        String query = "FROM Usuario";
        return entityManager.createNamedQuery(query).getResultList();
    }

    @Override
    public Usuario find(Integer id) {
        return entityManager.find(Usuario.class, Integer.valueOf(id));
    }

    @Override
    public Usuario add(Usuario usuario) {
        String query = "INSERT INTO Usuario ( `apellido`, `nombre`, `telefono`, `email`, `password`, `rol_id`) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]','[value-6]','[value-7]')";
        return entityManager.find(Usuario.class, usuario.getId());
    }

    @Override
    public void edit(Usuario usuario) {
    }

    @Override
    public void remove(Integer id) {
        Usuario usuario = find(id);
        entityManager.remove(usuario);
    }
}
