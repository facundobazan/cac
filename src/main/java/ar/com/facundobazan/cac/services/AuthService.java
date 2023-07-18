package ar.com.facundobazan.cac.services;

import ar.com.facundobazan.cac.entities.Auth;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository //  Permite la conexion a la db
@Transactional  //  Permite armar las consultas a la db
public class AuthService implements IAuthService {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Boolean authenticate(Auth auth) {
        String query = "From Usuario WHERE email='"+auth.getEmail()+"' AND password='"+auth.getPassword()+"'";
        System.out.println(query);
        return entityManager.createQuery(query).getResultList().size() > 0;
    }

    @Override
    public void changePassword(Auth auth) {

    }
}
