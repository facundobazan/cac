package ar.com.facundobazan.cac.services;

import ar.com.facundobazan.cac.entities.Rol;

import java.util.List;

public interface IRolService {
    public List<Rol> getAll();
    public Rol find(Integer id);
    public Rol add(Rol rol);
    public void edit(Rol rol);
    public void remove(Integer id);
}
