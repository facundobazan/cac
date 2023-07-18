package ar.com.facundobazan.cac.controllers;

import ar.com.facundobazan.cac.entities.Auth;
import ar.com.facundobazan.cac.services.IAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private IAuthService iAuthService;

    @PostMapping(value = "auth")
    public Boolean authenticate(@RequestBody Auth auth){
        return iAuthService.authenticate(auth);
    }
}
