
package com.sinfloo.ejemplo01.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "administrador")
public class Administrador {
    
    @Id
    @Column (name = "Administrador_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Administrador_ID;
    @Column (name = "nombre")
    private String nombre;
    @Column (name = "apellido")
    private String apellido;
    @Column (name = "correo")
    private String correo;

    public int getAdministrador_ID() {
        return Administrador_ID;
    }

    public void setAdministrador_ID(int Administrador_ID) {
        this.Administrador_ID = Administrador_ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    

    
    
}
