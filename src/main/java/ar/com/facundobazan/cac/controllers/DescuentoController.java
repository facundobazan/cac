package ar.com.facundobazan.cac.controllers;

import ar.com.facundobazan.cac.entities.Descuento;
import ar.com.facundobazan.cac.services.IDescuentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DescuentoController {

    @Autowired
    private IDescuentoService iDescuentoService;

    @GetMapping(value = "descuentos")
    public List<Descuento> getAll(){
        return iDescuentoService.getAll();
    }

    @GetMapping(value = "descuentos/{id}")
    public Descuento getOne(@PathVariable String id){
        return iDescuentoService.find(Integer.valueOf(id));
    }

    @PostMapping(value = "descuentos")
    public Descuento add(@RequestBody Descuento descuento){
        return iDescuentoService.add(descuento);
    }

    @PutMapping(value = "descuentos")
    public void edit(@RequestBody Descuento descuento){
        iDescuentoService.edit(descuento);
    }

    @DeleteMapping(value = "descuentos/{id}")
    public void delete(@PathVariable String id){
        iDescuentoService.remove(Integer.valueOf(id));
    }
}
