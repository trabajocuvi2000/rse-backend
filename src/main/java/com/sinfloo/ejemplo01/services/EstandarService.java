
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Estandar;
import java.util.List;
import java.util.Optional;

public interface EstandarService {
    
    Estandar insertarEstandar(Estandar p);
    List<Estandar> listarEstandares();
    Optional<Estandar> listarID(int id);
    Estandar editar(Estandar p);
    Optional<Estandar> eliminar(int id);
    
}
