package ar.com.facundobazan.cac.controllers;

import ar.com.facundobazan.cac.entities.Usuario;
import ar.com.facundobazan.cac.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private IUsuarioService iUsuarioService;

    @GetMapping(value = "usuarios")
    public List<Usuario> getAll(){
        return iUsuarioService.getAll();
    }

    @GetMapping(value = "usuarios/{id}")
    public Usuario getOne(@PathVariable String id){
        return iUsuarioService.find(Integer.valueOf(id));
    }

    @PostMapping(value = "usuarios")
    public Usuario addUsuario(@RequestBody Usuario usuario){
        return iUsuarioService.add(usuario);
    }

    @PutMapping(value = "usuarios")
    public void editUsuario(@RequestBody Usuario usuario){
        iUsuarioService.edit(usuario);
    }

    @DeleteMapping(value = "usuarios/{id}")
    public void deleteUsuario(@PathVariable String id){
        iUsuarioService.remove(Integer.valueOf(id));
    }
}
