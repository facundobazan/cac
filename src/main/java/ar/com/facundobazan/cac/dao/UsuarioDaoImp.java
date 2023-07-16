package ar.com.facundobazan.cac.dao;

import ar.com.facundobazan.cac.entities.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //  Permite la conexion a la db
@Transactional  //  Permite armar las consultas a la db
public class UsuarioDaoImp implements IUsuarioDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Usuario> getAll() {
        String query = "FROM Usuario";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Usuario find(String id) {
        String query = "FROM Usuario WHERE id="+ id;    //  TODO: no se usa por motivos de seguridad
        return (Usuario) entityManager.createQuery(query);
    }

    @Override
    public Usuario add(Usuario usuario) {
        String query = "INSERT INTO Usuarios values() "+ usuario;    //  TODO: falta implementar
        return (Usuario) entityManager.createQuery(query);
    }

    @Override
    public Boolean edit(Usuario usuario) {
        String query = "FROM Usuario WHERE id=" + usuario.getId();  //  TODO: falta implementar
        return null;
    }

    @Override
    public Boolean delete(String id) {
        String query = "FROM";  //  TODO: falta implementar
        return null;
    }
}
