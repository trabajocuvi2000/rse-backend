
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Administrador;
import java.util.List;
import java.util.Optional;

public interface AdministradorService {
    
    Administrador insertarAdministrador(Administrador p); 
    List<Administrador> listarAdministrador();
    Optional<Administrador> listarID(int id);
    Administrador editar(Administrador p);
    Optional<Administrador> eliminar(int id);
    
}
