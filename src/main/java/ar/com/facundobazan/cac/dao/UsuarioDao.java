package ar.com.facundobazan.cac.dao;

import ar.com.facundobazan.cac.entities.Usuario;

import java.util.List;

public interface UsuarioDao {
    public List<Usuario> getAll();
    public Usuario getOne(String id);
    public Boolean editOne(Usuario usuario);
    public Boolean deleteOne(String id);
}
