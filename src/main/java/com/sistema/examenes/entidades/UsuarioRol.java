package com.sistema.examenes.entidades;

import javax.persistence.*;

@Entity
public class UsuarioRol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioRolId;

    public UsuarioRol(){}

    public UsuarioRol(Long usuarioRolId) {
        this.usuarioRolId = usuarioRolId;
    }

    public Long getUsuarioRolId() {
        return usuarioRolId;
    }

    public void setUsuarioRolId(Long usuarioRolId) {
        this.usuarioRolId = usuarioRolId;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    private Usuario usuario;

    @ManyToOne
    private Rol rol;

    public Usuario getUsuario(){
        return usuario;
    }

    public void setUsuario(Usuario usuario){
        this.usuario=usuario;
    }

    public Rol getRol(){
        return rol;
    }

    public void setRol(Rol rol){
        this.rol=rol;
    }

}
