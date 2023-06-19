/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinfloo.ejemplo01.utilerias;

/**
 *
 * @author Jonnathan
 */
public class ComprobarUsuario {
    private String correo;
    private String contrasena;
    boolean contrasena_correcta;

    public ComprobarUsuario() {
    }
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isContrasena_correcta() {
        return contrasena_correcta;
    }

    public void setContrasena_correcta(boolean contrasena_correcta) {
        this.contrasena_correcta = contrasena_correcta;
    }
    
    
    
}
