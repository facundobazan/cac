package ar.com.facundobazan.cac.services;

import ar.com.facundobazan.cac.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public List<Usuario> getAll();
    public Usuario find(Integer id);
    public Usuario add(Usuario usuario);
    public void edit(Usuario usuario);
    public void remove(Integer id);
}
