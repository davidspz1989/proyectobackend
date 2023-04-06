package com.sistema.examenes.exceptions;

public class UserNotFoundException extends Exception {

    public UserNotFoundException(){
        super("Usuario no encontrado en la base de datos, vuelva a intentarlo !!");
    }

    public UserNotFoundException(String massege){
        super(massege);
    }
}
