package ar.com.facundobazan.cac.services;

import ar.com.facundobazan.cac.entities.Producto;

import java.util.List;

public interface IProductoService {
    public List<Producto> getAll();
    public Producto find(Integer id);
}
