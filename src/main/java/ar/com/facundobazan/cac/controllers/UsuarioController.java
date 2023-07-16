package ar.com.facundobazan.cac.controllers;

import ar.com.facundobazan.cac.dao.IUsuarioDao;
import ar.com.facundobazan.cac.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private IUsuarioDao IUsuarioDao;

    @GetMapping(value = "usuarios")
    public List<Usuario> getAll(){
        return IUsuarioDao.getAll();
    }

    @GetMapping(value = "usuarios/{id}")
    public String getOne(@PathVariable String id){
        return "Hola";
    }

    @PostMapping(value = "usuarios")
    public Usuario addUsuario(@RequestBody Usuario usuario){
        return usuario;
    }

    @PutMapping(value = "usuarios")
    public Boolean editUsuario(@RequestBody Usuario usuario){
        return usuario == null;
    }

    @DeleteMapping(value = "usuarios/{id}")
    public Boolean deleteUsuario(@PathVariable String id){
        return Integer.valueOf(id) < 0;
    }
}
