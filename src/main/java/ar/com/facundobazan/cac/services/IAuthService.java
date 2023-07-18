package ar.com.facundobazan.cac.services;

import ar.com.facundobazan.cac.entities.Auth;

public interface IAuthService {
    public Boolean authenticate(Auth auth);
    public void changePassword(Auth auth);
}
