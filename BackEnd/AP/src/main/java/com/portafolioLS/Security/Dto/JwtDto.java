
package com.portafolioLS.Security.Dto;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;

public class JwtDto {

    private String token;
    private String bearer = "Bearer";
    private String nombreUsuario;
    private Collection<? extends GrantedAuthority> authories;
    
    
    //Constructor

    public JwtDto(String token, String nombreUsuario, Collection<? extends GrantedAuthority> aauthories) {
        this.token = token;
        this.nombreUsuario = nombreUsuario;
        this.authories = aauthories;
    }

    
    
    //Getters and Setters

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBearer() {
        return bearer;
    }

    public void setBearer(String bearer) {
        this.bearer = bearer;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Collection<? extends GrantedAuthority> getAuthories() {
        return authories;
    }

    public void setAuthories(Collection<? extends GrantedAuthority> authories) {
        this.authories = authories;
    }
    
    
    
    
}
