package com.sistema.examenes.exceptions;

public class UserFoundException extends Exception {

    public UserFoundException(){
        super("Usuario ya existe en la base de datos, vuelva a intentarlo !!");
    }

    public UserFoundException(String message){
        super(message);
    }
}
