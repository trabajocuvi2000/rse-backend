
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Nivel;
import java.util.List;
import java.util.Optional;

public interface NivelSerivice {
    
    Nivel insertarNivel(Nivel p);
    List<Nivel> listarNivel();
    Optional<Nivel> listarID(int id);
    Nivel editar(Nivel p);
    Optional<Nivel> eliminar(int id);
}
