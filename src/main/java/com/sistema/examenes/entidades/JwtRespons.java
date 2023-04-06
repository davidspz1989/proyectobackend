package com.sistema.examenes.entidades;

public class JwtRespons {

    private String token;

    public JwtRespons(String token){
        this.token=token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
