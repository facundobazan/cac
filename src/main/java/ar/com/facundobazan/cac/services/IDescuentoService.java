package ar.com.facundobazan.cac.services;

import ar.com.facundobazan.cac.entities.Descuento;
import java.util.List;

public interface IDescuentoService {
    public List<Descuento> getAll();
    public Descuento find(Integer id);
    public Descuento add(Descuento descuento);
    public void edit(Descuento descuento);
    public void remove(Integer id);
}
