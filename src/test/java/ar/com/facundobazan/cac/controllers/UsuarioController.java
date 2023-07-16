package ar.com.facundobazan.cac.controllers;

import ar.com.facundobazan.cac.dao.UsuarioDao;
import ar.com.facundobazan.cac.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value="usuarios")
    public List<Usuario> getAll(){
        return usuarioDao.getUsuarios();
    }

    @GetMapping(value="usuarios/{id}")
    public Usuario getOne(@PathVariable Integer id){
        Usuario usuario = new Usuario();
        usuario.setApellido("bazán");
        usuario.setNombre("facundo");
        usuario.setTelefono("3813535730");
        usuario.setEmail("facundobazan@icloud.com");
        usuario.setPassword("asd123");
        return new Usuario();
    }
}
