package ar.com.facundobazan.cac.controllers;

import ar.com.facundobazan.cac.entities.Producto;
import ar.com.facundobazan.cac.services.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private IProductoService iProductoService;

    @GetMapping(value = "productos")
    public List<Producto> getAll(){
        return iProductoService.getAll();
    }

    @GetMapping(value = "productos/{id}")
    public Producto getOne(@PathVariable String id){
        return iProductoService.find(Integer.valueOf(id));
    }
}
