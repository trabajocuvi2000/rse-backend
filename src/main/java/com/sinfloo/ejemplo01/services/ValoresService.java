
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Valores;
import java.util.List;


public interface ValoresService {
    
    Valores insertarValore(Valores p);
    List<Valores> listarValores();
    void eliminarDatos();
    
    
}
