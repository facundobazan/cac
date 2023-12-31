package ar.com.facundobazan.cac.controllers;

import ar.com.facundobazan.cac.services.IUsuarioService;
import ar.com.facundobazan.cac.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class UsuarioController {

    @Autowired
    private IUsuarioService IUsuarioService;

    @RequestMapping(value="usuarios")
    public List<Usuario> getAll(){
        return IUsuarioService.getAll();
    }
}
