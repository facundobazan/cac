package ar.com.facundobazan.cac.controllers;

import ar.com.facundobazan.cac.entities.Rol;
import ar.com.facundobazan.cac.services.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RolController {

    @Autowired
    private IRolService iRolService;

    @GetMapping(value = "roles")
    public List<Rol> getAll(){
        return iRolService.getAll();
    }

    @GetMapping(value = "roles/{id}")
    public Rol getById(@PathVariable String id){
        return iRolService.find(Integer.valueOf(id));
    }

    @PostMapping(value = "roles")
    public Rol add(@RequestBody Rol rol){
        return iRolService.add(rol);
    }

    @PutMapping(value = "roles")
    public void edit(@RequestBody Rol rol){
        iRolService.edit(rol);
    }

    @DeleteMapping(value = "roles/{id}")
    public void delete(@PathVariable String id){
        iRolService.remove(Integer.valueOf(id));
    }
}
