package ar.com.facundobazan.cac.services;

import ar.com.facundobazan.cac.entities.Item;
import ar.com.facundobazan.cac.entities.Usuario;

import java.util.List;

public interface IItemService {
    public List<Item> getAll();
    public Item find(Integer id);
    public Item add(Item item);
    public void edit(Item item);
    public void remove(Integer id);
}
