package com.sistema.examenes.entidades;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Rol {

    @Id
    private Long rolId;
    private String name;
    public Rol(){}

    public Rol(Long rolId, String name ){
        this.rolId=rolId;
        this.name=name;
    }

    public Long getRolId(){
        return rolId;
    }

    public void setRolId(Long rolId){
        this.rolId=rolId;
    }

    public String getRolName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public Set<UsuarioRol>getUsuarioRoles(){
        return usuarioRoles;
    }

    public void setUsuarioRoles(Set<UsuarioRol> usuarioRoles){
        this.usuarioRoles=usuarioRoles;
    }

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "rol")
    private Set<UsuarioRol> usuarioRoles=new HashSet<>();
}
