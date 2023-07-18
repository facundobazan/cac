package ar.com.facundobazan.cac.services;

import ar.com.facundobazan.cac.entities.Usuario;

import java.util.List;

public interface UsuarioDao {
    List<Usuario> getUsuarios();
    Usuario getUsuario(Integer id);
    Usuario addUsuario();
    Boolean editUsuario();
    Boolean deleteUsuario();
}
