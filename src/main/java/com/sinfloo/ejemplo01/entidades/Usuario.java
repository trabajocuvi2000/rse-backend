
package com.sinfloo.ejemplo01.entidades;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
    
    @Id
    @Column (name = "Usuario_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Usuario_ID;
    @Column (name = "usuario")
    private String usuario;
    @Column (name = "contrasena")
    private String contrasena;
    
    @OneToOne (cascade = CascadeType.ALL)//para que todo lo que me aga a usuario tambien me aga a encuestado
    @JoinColumn (name="Encuestado_ID")//esta es la columna de la base de datos No de las entidades
    private Encuestado encuestado;
    
    @OneToOne (cascade = CascadeType.ALL)//para que todo lo que me aga a usuario tambien me aga a encuestado
    @JoinColumn (name="Administrador_ID")//esta es la columna de la base de datos No de las entidades
    private Administrador Administrador;
    
    //@Column (name = "Administrador_ID")
    //private String Administrador_ID;

    public int getUsuario_ID() {
        return Usuario_ID;
    }

    public void setUsuario_ID(int Usuario_ID) {
        this.Usuario_ID = Usuario_ID;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Encuestado getEncuestado() {
        return encuestado;
    }

    public void setEncuestado(Encuestado encuestado) {
        this.encuestado = encuestado;
    }

    /*public String getAdministrador_ID() {
        return Administrador_ID;
    }

    public void setAdministrador_ID(String Administrador_ID) {
        this.Administrador_ID = Administrador_ID;
    }*/

    public Administrador getAdministrador() {
        return Administrador;
    }

    public void setAdministrador(Administrador Administrador) {
        this.Administrador = Administrador;
    }

    
    
    
    
    
    
}
