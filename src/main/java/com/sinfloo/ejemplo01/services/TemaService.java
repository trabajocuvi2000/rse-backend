
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Tema;
import java.util.List;
import java.util.Optional;

public interface TemaService {
    
    Tema insertarTema(Tema p);
    List<Tema> listarTema(); 
    Optional<Tema> listarID(int id);
    Tema editar(Tema p);
    Optional<Tema> eliminar(int id);
}
