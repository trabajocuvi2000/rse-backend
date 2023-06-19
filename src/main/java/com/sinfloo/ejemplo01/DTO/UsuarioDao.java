/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinfloo.ejemplo01.DTO;

import com.sinfloo.ejemplo01.entidades.Usuario;

/**
 *
 * @author Jonnathan
 */
public interface UsuarioDao {
    
    Usuario obtenerUsuarioPorCredenciales(Usuario  usuario);
    
}
