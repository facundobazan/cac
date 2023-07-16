package ar.com.facundobazan.cac.dao;

import ar.com.facundobazan.cac.entities.Usuario;

import java.util.List;

public interface IUsuarioDao {
    public List<Usuario> getAll();
    public Usuario find(String id);
    public Usuario add(Usuario usuario);
    public Boolean edit(Usuario usuario);
    public Boolean delete(String id);
}
