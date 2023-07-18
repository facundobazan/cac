package ar.com.facundobazan.cac.services;

import ar.com.facundobazan.cac.entities.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //  Permite la conexion a la db
@Transactional  //  Permite armar las consultas a la db
public class UsuarioService implements IUsuarioService {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Usuario> getAll() {
        String query = "FROM Usuario";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Usuario find(Integer id) {
        return entityManager.find(Usuario.class, id);
    }

    @Override
    public Usuario add(Usuario usuario) {
        return entityManager.merge(usuario);
    }

    @Override
    public void edit(Usuario usuario) {
        Usuario usr = find(usuario.getId());
        usr = usuario;
        usr.setApellido(usuario.getApellido());
        usr.setNombre(usuario.getNombre());
        usr.setTelefono(usuario.getTelefono());
        usr.setEmail(usuario.getEmail());
        usr.setPassword(usuario.getPassword());
        entityManager.merge(usr);
    }

    @Override
    public void remove(Integer id) {
        Usuario usuario = find(id);
        entityManager.remove(usuario);
    }
}
